import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappingTable {
    public static final String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    public static final List<String> noteNameList = Arrays.asList(NOTE_NAMES);
    public static final String GM_STANDARD = "GM_STANDARD_MAPPING_PROFIL";
    public static final String GGD_INVASION = "GGD_INVASION_MAPPING_PROFIL";
    private static final Map<Integer, MidiNote> sourceMap = new HashMap();
    private static final Map<Integer, MidiNote> targetMap = new HashMap();
    private static final Map<MidiNote, MidiNote> mappedNotes = new HashMap();

    static {

        /*GM Standard*/
        add2SourceMap(new MidiNote("Cowbell", "G#2", 56));
        add2SourceMap(new MidiNote("Cymbal China 1 Hit", "E2", 52));
        add2SourceMap(new MidiNote("Cymbal Crash 1 Hit", "C#2", 49));
        add2SourceMap(new MidiNote("Cymbal Crash 2 Hit", "A2", 57));
        add2SourceMap(new MidiNote("Cymbal Splash 1 Hit", "G2", 55));
        add2SourceMap(new MidiNote("Floortom 1 Hit", "G1", 43));
        add2SourceMap(new MidiNote("Floortom 2 Hit", "F1", 41));
        add2SourceMap(new MidiNote("Hi Hat Closed", "F#1", 42));
        add2SourceMap(new MidiNote("Hi Hat Open 1", "A#1", 46));
        add2SourceMap(new MidiNote("Hi Hat Pedal Close Foot", "G#1", 44));
        add2SourceMap(new MidiNote("Kick", "C1", 36));
        add2SourceMap(new MidiNote("Racktom 1 Hit", "D2", 50));
        add2SourceMap(new MidiNote("Racktom 2 Hit", "C2", 48));
        add2SourceMap(new MidiNote("Racktom 3 Hit", "B1", 47));
        add2SourceMap(new MidiNote("Racktom 4 Hit", "A1", 45));
        add2SourceMap(new MidiNote("Ride 1", "D#2", 51));
        add2SourceMap(new MidiNote("Ride 1 Bell", "F2", 53));
        add2SourceMap(new MidiNote("Ride 2", "B2", 59));
        add2SourceMap(new MidiNote("Snare Hit", "D1", 38));
        add2SourceMap(new MidiNote("Snare Sidestick", "C#1", 37));
        add2SourceMap(new MidiNote("Tambourine", "F#2", 54));
        add2SourceMap(new MidiNote("Vibraslap", "A#2", 58));

        //GGD Invasion
        add2TargetMap(new MidiNote("Kick", "C0", 24));
        add2TargetMap(new MidiNote("Kick Adk", "A#-1", 22));
        add2TargetMap(new MidiNote("Kick Left", "B-1", 23));
        add2TargetMap(new MidiNote("Snare Hit", "D0", 26));
        add2TargetMap(new MidiNote("Snare Flam", "D#0", 27));
        add2TargetMap(new MidiNote("Snare Off", "F0", 29));
        add2TargetMap(new MidiNote("Snare Ruff", "E0", 28));
        add2TargetMap(new MidiNote("Snare Sidestick", "F#0", 30));

        add2TargetMap(new MidiNote("Racktom 1 Hit", "A0", 33));
        add2TargetMap(new MidiNote("Racktom 2 Hit", "A#0", 34));
        add2TargetMap(new MidiNote("Racktom 3 Hit", "B0", 35));

        add2TargetMap(new MidiNote("Floortom 1 Hit", "C1", 36));
        add2TargetMap(new MidiNote("Floortom 2 Hit", "C#1", 37));
        add2TargetMap(new MidiNote("Floortom 3 Hit", "D1", 38));

        add2TargetMap(new MidiNote("Ride 1 Bell", "C#3", 61));
        add2TargetMap(new MidiNote("Ride 1 Bow", "D3", 62));
        add2TargetMap(new MidiNote("Ride 1 Edge", "D#3", 63));

        add2TargetMap(new MidiNote("Cymbal Bell 1 Hit", "G4", 79));
        add2TargetMap(new MidiNote("Cymbal Bell 2 Hit", "G#4", 80));

        add2TargetMap(new MidiNote("China L Hit", "F3", 65));
        add2TargetMap(new MidiNote("China L Choke", "F#3", 66));
        add2TargetMap(new MidiNote("China R Hit", "G3", 67));
        add2TargetMap(new MidiNote("China R Choke", "G#3", 68));

        add2TargetMap(new MidiNote("Main Crash L Hit", "E2", 52));
        add2TargetMap(new MidiNote("Main Crash L Choke", "F2", 53));
        add2TargetMap(new MidiNote("Main Crash R Hit", "F#2", 54));
        add2TargetMap(new MidiNote("Main Crash R Choke", "G2", 55));
        add2TargetMap(new MidiNote("Wide Crash L Hit", "G#2", 56));
        add2TargetMap(new MidiNote("Wide Crash L Choke", "A2", 57));
        add2TargetMap(new MidiNote("Wide Crash R Hit", "A#2", 58));
        add2TargetMap(new MidiNote("Wide Crash R Choke", "B2", 59));

        add2TargetMap(new MidiNote("Splash L Hit", "C#4", 73));
        add2TargetMap(new MidiNote("Splash L Choke", "D4", 74));
        add2TargetMap(new MidiNote("Splash C Hit", "D#4", 75));
        add2TargetMap(new MidiNote("Splash C Choke", "E4", 76));

        add2TargetMap(new MidiNote("HH TipT ight", "F1", 41));
        add2TargetMap(new MidiNote("HH Edge Tight", "F#1", 42));
        add2TargetMap(new MidiNote("HH Tip Closed", "G1", 43));
        add2TargetMap(new MidiNote("HH Edge Closed ", "G#1", 44));
        add2TargetMap(new MidiNote("HH Open 1", "A1", 45));
        add2TargetMap(new MidiNote("HH Open 2", "A#1", 46));
        add2TargetMap(new MidiNote("HH Open 3", "B1", 47));
        add2TargetMap(new MidiNote("HH Pedal", "C2", 48));
        add2TargetMap(new MidiNote("HH Cc", "F-1", 17));

        add2TargetMap(new MidiNote("X Hat Closed", "A#3", 70));
        add2TargetMap(new MidiNote("X Hat Open", "B3", 71));

        add2TargetMap(new MidiNote("Stack Hit", "F#4", 78));
        add2TargetMap(new MidiNote("Bell L Hit", "G4", 79));
        add2TargetMap(new MidiNote("Bell R Hit", "G#4", 80));


 /*
 *        GM Standard
        sourceMap.add(new MidiNote("Cowbell", "G#2", 56));
        sourceMap.add(new MidiNote("Cymbal China 1 Hit", "E2", 52));
        sourceMap.add(new MidiNote("Cymbal Crash 1 Hit", "C#2", 49));
        sourceMap.add(new MidiNote("Cymbal Crash 2 Hit", "A2", 57));
        sourceMap.add(new MidiNote("Cymbal Splash 1 Hit", "G2", 55));
        sourceMap.add(new MidiNote("Floortom 1 Hit", "G1", 43));
        sourceMap.add(new MidiNote("Floortom 2 Hit", "F1", 41));
        sourceMap.add(new MidiNote("Hi Hat Closed", "F#1", 42));
        sourceMap.add(new MidiNote("Hi Hat Open 1", "A#1", 46));
        sourceMap.add(new MidiNote("Hi Hat Pedal Close Foot", "G#1", 44));
        sourceMap.add(new MidiNote("Kick", "C1", 36));
        sourceMap.add(new MidiNote("Racktom 1 Hit", "D2", 50));
        sourceMap.add(new MidiNote("Racktom 2 Hit", "C2", 48));
        sourceMap.add(new MidiNote("Racktom 3 Hit", "B1", 47));
        sourceMap.add(new MidiNote("Racktom 4 Hit", "A1", 45));
        sourceMap.add(new MidiNote("Ride 1", "D#2", 51));
        sourceMap.add(new MidiNote("Ride 1 Bell", "F2", 53));
        sourceMap.add(new MidiNote("Ride 2", "B2", 59));
        sourceMap.add(new MidiNote("Snare Hit", "D1", 38));
        sourceMap.add(new MidiNote("Snare Sidestick", "C#1", 37));
        sourceMap.add(new MidiNote("Tambourine", "F#2", 54));
        sourceMap.add(new MidiNote("Vibraslap", "A#2", 58));*/



/*SD 3 => Invasion Default mapping
        mappingMap.put(36, 24);//kick
        mappingMap.put(38, 26);//snare hit
        mappingMap.put(40, 28);//snare rim (GGD = ruff?)
        mappingMap.put(37, 30);//snare stick

        mappingMap.put(21, 48);//Pedal close foot
        mappingMap.put(55, 52);//Cym crash 1
        mappingMap.put(49, 54);//Cym crash 2
        mappingMap.put(57, 56);//Cym crash 3

        mappingMap.put(53, 61);//Ride bell
        mappingMap.put(51, 62);//Ride bow
        mappingMap.put(59, 63);//Ride edge

        mappingMap.put(43, 36);//F Tom 1
        mappingMap.put(41, 37);//F Tom 2
        mappingMap.put(48, 33);//R Tom 1
        mappingMap.put(47, 34);//R Tom 2
        mappingMap.put(45, 35);//R Tom 3

        mappingMap.put(22, 44);//HH CE
        mappingMap.put(42, 43);//HH CT
        mappingMap.put(24, 45);//HH O1
        mappingMap.put(25, 46);//HH O2
        mappingMap.put(26, 47);//HH O3
        //mappingMap.put(60,35);//HH O4
        //mappingMap.put(17,35);//HH O5
        mappingMap.put(62, 42);//HH TE
        mappingMap.put(63, 41);//HH TT
        */

/*
        // Toontracks SD 3 mapping
        sourceMap.add(new MidiNote("Cymbal Crash 1 Hit", "G2", 55));
        sourceMap.add(new MidiNote("Cymbal Crash 1 Mute", "G#2", 56));
        sourceMap.add(new MidiNote("Cymbal Crash 2 Hit", "C#2", 49));
        sourceMap.add(new MidiNote("Cymbal Crash 2 Mute", "D2", 50));
        sourceMap.add(new MidiNote("Cymbal Crash 3 Hit", "A2", 57));
        sourceMap.add(new MidiNote("Cymbal Crash 3 Mute", "A#2", 58));
        sourceMap.add(new MidiNote("Cymbal Crash 4 Hit", "E2", 52));
        sourceMap.add(new MidiNote("Cymbal Crash 4 Mute", "F#2", 54));
        sourceMap.add(new MidiNote("Floortom 1 Hit", "G1", 43));
        sourceMap.add(new MidiNote("Floortom 1 Rimshot", "D#4", 75));
        sourceMap.add(new MidiNote("Floortom 2 Hit", "F1", 41));
        sourceMap.add(new MidiNote("Floortom 2 Rimshot", "C#4", 73));
        sourceMap.add(new MidiNote("Hi Hat Closed Edge", "A#-1", 22));
        sourceMap.add(new MidiNote("Hi Hat Closed Tip", "F#1", 42));
        sourceMap.add(new MidiNote("Hi Hat Open 1", "C0", 24));
        sourceMap.add(new MidiNote("Hi Hat Open 2", "C#0", 25));
        sourceMap.add(new MidiNote("Hi Hat Open 3", "D0", 26));
        sourceMap.add(new MidiNote("Hi Hat Open 4", "C3", 60));
        sourceMap.add(new MidiNote("Hi Hat Open 5", "F-1", 17));
        sourceMap.add(new MidiNote("Hi Hat Pedal Close Foot", "A-1", 21));
        sourceMap.add(new MidiNote("Hi Hat Tight Edge", "D3", 62));
        sourceMap.add(new MidiNote("Hi Hat Tight Tip", "D#3", 63));
        sourceMap.add(new MidiNote("Kick", "C1", 36));
        sourceMap.add(new MidiNote("Racktom 1 Hit", "C2", 48));
        sourceMap.add(new MidiNote("Racktom 1 Rimshot", "A#4", 82));
        sourceMap.add(new MidiNote("Racktom 2 Hit", "B1", 47));
        sourceMap.add(new MidiNote("Racktom 2 Rimshot", "G#4", 80));
        sourceMap.add(new MidiNote("Racktom 3 Hit", "A1", 45));
        sourceMap.add(new MidiNote("Racktom 3 Rimshot", "F#4", 78));
        sourceMap.add(new MidiNote("Ride 1 Bell", "F2", 53));
        sourceMap.add(new MidiNote("Ride 1 Bow", "D#2", 51));
        sourceMap.add(new MidiNote("Ride 1 Edge", "B2", 59));
        sourceMap.add(new MidiNote("Ride 1 Mute", "B4", 83));
        sourceMap.add(new MidiNote("Snare Hit", "D1", 38));
        sourceMap.add(new MidiNote("Snare Rimshot", "E1", 40));
        sourceMap.add(new MidiNote("Snare Sidestick", "C#1", 37));*/

/*        // GGD Invasion Default
        targetMap.add(new MidiNote("Kick", "C0", 24));
        targetMap.add(new MidiNote("Kick Adk", "A#-1", 22));
        targetMap.add(new MidiNote("Kick Left", "B-1", 23));
        targetMap.add(new MidiNote("Snare Hit", "D0", 26));
        targetMap.add(new MidiNote("Snare Flam", "D#0", 27));
        targetMap.add(new MidiNote("Snare Off", "F0", 29));
        targetMap.add(new MidiNote("Snare Ruff", "E0", 28));
        targetMap.add(new MidiNote("Snare Sidestick", "F#0", 30));

        targetMap.add(new MidiNote("Racktom 1 Hit", "A0", 33));
        targetMap.add(new MidiNote("Racktom 2 Hit", "A#0", 34));
        targetMap.add(new MidiNote("Racktom 3 Hit", "B0", 35));

        targetMap.add(new MidiNote("Floortom 1 Hit", "C1", 36));
        targetMap.add(new MidiNote("Floortom 2 Hit", "C#1", 37));
        targetMap.add(new MidiNote("Floortom 3 Hit", "D1", 38));

        targetMap.add(new MidiNote("Ride 1 Bell", "C#3", 61));
        targetMap.add(new MidiNote("Ride 1 Bow", "D3", 62));
        targetMap.add(new MidiNote("Ride 1 Edge", "D#3", 63));

        targetMap.add(new MidiNote("Cymbal Bell 1 Hit", "G4", 79));
        targetMap.add(new MidiNote("Cymbal Bell 2 Hit", "G#4", 80));

        targetMap.add(new MidiNote("China L Hit", "F3", 65));
        targetMap.add(new MidiNote("China L Choke", "F#3", 66));
        targetMap.add(new MidiNote("China R Hit", "G3", 67));
        targetMap.add(new MidiNote("China R Choke", "G#3", 68));

        targetMap.add(new MidiNote("Main Crash L Hit", "E2", 52));
        targetMap.add(new MidiNote("Main Crash L Choke", "F2", 53));
        targetMap.add(new MidiNote("Main Crash R Hit", "F#2", 54));
        targetMap.add(new MidiNote("Main Crash R Choke", "G2", 55));
        targetMap.add(new MidiNote("Wide Crash L Hit", "G#2", 56));
        targetMap.add(new MidiNote("Wide Crash L Choke", "A2", 57));
        targetMap.add(new MidiNote("Wide Crash R Hit", "A#2", 58));
        targetMap.add(new MidiNote("Wide Crash R Choke", "B2", 59));

        targetMap.add(new MidiNote("Splash L Hit", "C#4", 73));
        targetMap.add(new MidiNote("Splash L Choke", "D4", 74));
        targetMap.add(new MidiNote("Splash C Hit", "D#4", 75));
        targetMap.add(new MidiNote("Splash C Choke", "E4", 76));

        targetMap.add(new MidiNote("HH TipT ight", "F1", 41));
        targetMap.add(new MidiNote("HH Edge Tight", "F#1", 42));
        targetMap.add(new MidiNote("HH Tip Closed", "G1", 43));
        targetMap.add(new MidiNote("HH Edge Closed ", "G#1", 44));
        targetMap.add(new MidiNote("HH Open 1", "A1", 45));
        targetMap.add(new MidiNote("HH Open 2", "A#1", 46));
        targetMap.add(new MidiNote("HH Open 3", "B1", 47));
        targetMap.add(new MidiNote("HH Pedal", "C2", 48));
        targetMap.add(new MidiNote("HH Cc", "F-1", 17));

        targetMap.add(new MidiNote("X Hat Closed", "A#3", 70));
        targetMap.add(new MidiNote("X Hat Open", "B3", 71));

        targetMap.add(new MidiNote("Stack Hit", "F#4", 78));
        targetMap.add(new MidiNote("Bell L Hit", "G4", 79));
        targetMap.add(new MidiNote("Bell R Hit", "G#4", 80))*/
    }

    public MappingTable(String sourceProfil, String targetProfil) {
        init(sourceProfil, targetProfil);
    }

    private static Integer convertNoteNameToKey(String sourceNoteName) {
        int index = 1;
        if (sourceNoteName.contains("#")) {
            index = sourceNoteName.indexOf("#") + 1;
        }
        String noteName = sourceNoteName.substring(0, index);
        String octaveStr = sourceNoteName.substring(index);
        int noteValue = noteNameList.indexOf(noteName);
        int octave = Integer.parseInt(octaveStr) + 2;
        return noteValue + (octave * 12);
    }

    private static void add2SourceMap(MidiNote note) {
        sourceMap.put(note.getMidiKey(), note);
    }

    private static void add2TargetMap(MidiNote note) {
        targetMap.put(note.getMidiKey(), note);
    }

    private void init(String sourceProfil, String targetProfil) {

    }

    public void addMapping(String sourceNoteName, String targetNoteName) {
        Integer sourceKey = convertNoteNameToKey(sourceNoteName);
        Integer targetKey = convertNoteNameToKey(targetNoteName);
        MidiNote sourceNote = sourceMap.get(sourceKey);
        MidiNote targetNote = targetMap.get(targetKey);
        mappedNotes.put(sourceNote, targetNote);
        LoggingHelper.print("!! Added mapping for SOURCE_NOTE [" + sourceNote + "] => TARGET_NOTE [" + targetNote + "]");


    }

    public MidiNote getTargetNote(Integer key) {
        MidiNote sourceNote = sourceMap.get(key);
        MidiNote targetNote = mappedNotes.get(sourceNote);
        LoggingHelper.print("!! Added mapping for SOURCE_NOTE [" + sourceNote + "] => TARGET_NOTE [" + targetNote + "]");
        return targetNote;
    }
}
