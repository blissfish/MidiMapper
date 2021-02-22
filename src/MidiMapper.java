import javax.sound.midi.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class MidiMapper {
    public static final int NOTE_ON = 0x90;
    public static final int NOTE_OFF = 0x80;
    public static final int MM_TRACK_NAME = 0x03;
    public static final String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    public static final DrumMapper mapper = new DrumMapper();
    private static final List<File> fileList = new ArrayList();
    private static String version = "v0.1";

    public static void main(String[] args) throws Exception {
        read(new File("in"));
        LoggingHelper.print("START processing of [" + fileList.size() + "] files ...");
        int nrOfFiles = 1;//fileList.size();
        for (int i = 0; i < nrOfFiles; i++) {
            perform(fileList.get(i), i);
        }
        LoggingHelper.print("COMPLETED processing of [" + nrOfFiles + "] files ...");
    }

    private static void read(File dir) {
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File current = files[i];
            if (files[i].isDirectory()) {
                read(files[i]);
            } else {
                if (files[i].getName().endsWith("mid")) {
                    fileList.add(files[i]);
                }
            }
        }
    }

    private static void perform(File sourceFile, int nr) {
        try {
            String targetFileName = sourceFile.getParent() + "\\" + sourceFile.getName();
            String in = Matcher.quoteReplacement("in\\");
            targetFileName = targetFileName.startsWith("in\\") ? targetFileName.replaceFirst(in, "") : targetFileName;
            File targetFile = new File("output/" + targetFileName);
            nr += 1;
            LoggingHelper.print("START mapping of file nr. " + nr + " [" + sourceFile.getName() + "] => [" + targetFile + "]");
            Sequence sequence = MidiSystem.getSequence(sourceFile);
            //Sequence sequence = MidiSystem.getSequence(new File("midifile2.mid"));
            int trackNumber = 0;
            for (Track track : sequence.getTracks()) {
                trackNumber++;
                LoggingHelper.print("!! Track " + trackNumber + ": size = " + track.size());

                for (int i = 0; i < track.size(); i++) {
                    MidiEvent event = track.get(i);
                    LoggingHelper.printEvent(event);

                    MidiMessage message = event.getMessage();
                    if (message instanceof MetaMessage) {
                        MetaMessage mm = (MetaMessage) message;
                        //LoggingHelper.printMetaMessage(mm);
                        if (mm.getType() == MM_TRACK_NAME) {
                            track.remove(event);
                            //changeTrackName(track, mm, targetFileName);
                        }

                    } else if (message instanceof ShortMessage) {
                        ShortMessage sm = (ShortMessage) message;
                        int command = sm.getCommand();
                        if (command == NOTE_ON) {
                            map(sm, "NOTE_ON");
                        } else if (sm.getCommand() == NOTE_OFF) {
                            map(sm, "NOTE_OFF");
                        }
                    } else {
                        LoggingHelper.print("Other message: " + message.getClass());
                    }
                }
                addTrackName(track, trackNumber, targetFileName);

            }

            /**/
            if (!targetFile.exists()) {
                targetFile.getParentFile().mkdirs();
                targetFile.createNewFile();
            }

            MidiSystem.write(sequence, 1, targetFile);

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    private static void addTrackName(Track track, int trackNumber, String targetFileName) throws InvalidMidiDataException {
        String trackName = targetFileName;
        trackName = trackName.replace(".mid", "");
        trackName += " :: MidiDrumMapper " + version;
        MetaMessage metaMessage = new MetaMessage();
        metaMessage.setMessage(MM_TRACK_NAME, trackName.getBytes(), trackName.length());
        MidiEvent event = new MidiEvent(metaMessage, (long) 0);
        track.add(new MidiEvent(metaMessage, (long) 0));

        LoggingHelper.print("!! Added track " + trackNumber + " name [" + new String(metaMessage.getData()) + "]");
    }

    private static void changeTrackName(Track track, MetaMessage message, String targetFileName) throws InvalidMidiDataException {
        String trackName = targetFileName;
        trackName = trackName.replace(".mid", "");
        trackName += " :: MidiDrumMapper " + version;
        message.setMessage(MM_TRACK_NAME, trackName.getBytes(), trackName.length());

        LoggingHelper.print("!! Changed track name from [" + new String(message.getData()) + "] to [" + trackName + "]");
    }

    private static void map(ShortMessage sm, String command) throws InvalidMidiDataException {
        Integer origValue = sm.getData1();
        Integer mappedValue = DrumMapper.map(origValue);
        if (mappedValue != null) {
            sm.setMessage(sm.getCommand(), sm.getChannel(), mappedValue, sm.getData2());
        }
    }


}