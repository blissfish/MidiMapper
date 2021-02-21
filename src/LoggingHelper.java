import javax.sound.midi.*;

public class LoggingHelper {
    public static void printMetaMessage(MetaMessage message) throws InvalidMidiDataException {
        System.out.println("Status: " + message.getStatus() + " Type: " + message.getType() + " Length: " + message.getLength() + " Data: [" + new String(message.getData()) + "]");
    }

    public static void printMessage(ShortMessage sm, String command) {
        int key = sm.getData1();
        int octave = (key / 12) - 1;
        int note = key % 12;
        String noteName = MidiMapper.NOTE_NAMES[note] + octave;
        int velocity = sm.getData2();
        System.out.println("Command: " + command + " " + noteName + " key=" + key + " velocity: " + velocity);
    }

    public static void print(String s) {
        System.out.println(s);

    }

    public static void printEvent(MidiEvent event) {
        StringBuilder builder = new StringBuilder("@" + event.getTick() + " ");
        MidiMessage message = event.getMessage();
        if (message instanceof MetaMessage) {
            MetaMessage mm = (MetaMessage) message;
            builder.append("MetaMessage::Status: " + mm.getStatus() + " Type: " + mm.getType() + " Length: " + mm.getLength() + " Data: [" + new String(mm.getData()) + "]");

        } else if (message instanceof ShortMessage) {
            ShortMessage sm = (ShortMessage) message;
            int key = sm.getData1();
            int octave = (key / 12) - 1;
            int note = key % 12;
            String noteName = MidiMapper.NOTE_NAMES[note] + octave;
            int velocity = sm.getData2();
            builder.append("ShortMessage::Channel: " + sm.getChannel() + " Command: " + convert(sm) + " " + noteName + " key=" + key + " velocity: " + velocity);

        }
        System.out.println(builder.toString());


    }

    private static String convert(ShortMessage sm) {

        if (sm.getCommand() == 0x90) {
            return "NOTE_ON";
        } else if (sm.getCommand() == 0x80) {
            return "NOTE_OFF";
        }
        return null;
    }
}