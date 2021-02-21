import java.util.HashMap;
import java.util.Map;

public class DrumMapper {

    private static final DrumMap sourceMap = new DrumMap("Toontrack Superior Drummer 3");
    private static final DrumMap targetMap = new DrumMap("GGD Invasion Default Mapping Invasion");
    private static final Map<Integer, Integer> mappingMap = new HashMap<>();
    private static final Boolean MAPPING = true;

    static {


        /*//GM Standard => Invasion Default mapping
        //mappingMap.put(58, 38);//Vibraslap => Doesn't exist in GGD*/

        mappingMap.put(52, 65);//China 1

        mappingMap.put(36, 24);//kick
        mappingMap.put(38, 26);//Snare Hit

        mappingMap.put(50, 33);//RT 1
        mappingMap.put(48, 34);//RT 2
        mappingMap.put(47, 35);//RT 3
        mappingMap.put(45, 38);//RT 4 => FT 3
        mappingMap.put(43, 36);//FT 1
        mappingMap.put(41, 37);//FT 2

        mappingMap.put(51, 61);//Ride 1
        mappingMap.put(53, 62);//Ride 1 Bell
        mappingMap.put(59, 63);//Ride 2

        mappingMap.put(56, 79);//Cowbell => GGD Bell L Hit
        mappingMap.put(52, 65);//China 1
        mappingMap.put(49, 52);//Crash 1
        mappingMap.put(57, 54);//Crash 2
        mappingMap.put(55, 73);//Splash 1

        mappingMap.put(42, 17);//HH C
        mappingMap.put(46, 45);//HH O
        mappingMap.put(44, 48);//HH PCF
        mappingMap.put(37, 70);//Snare Stick
        mappingMap.put(54, 78);//Tambourine => Cym 1 Stack Hit

        /*GM Standard*/
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
        sourceMap.add(new MidiNote("Vibraslap", "A#2", 58));



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

        // GGD Invasion Default
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
        targetMap.add(new MidiNote("Bell R Hit", "G#4", 80));

    }

    public static int map(int key) {
        if (!MAPPING) {
            return key;
        }

        MidiNote sourceNote = sourceMap.get(key);
        if (sourceNote == null) {
            return key;
        }
        Integer mappingKey = mappingMap.get(sourceNote.getMidiKey());
        if (mappingKey == null) {
            return key;
        }
        MidiNote targetNote = targetMap.get(mappingKey);
        if (targetNote == null) {
            return key;
        } else {
            System.out.println("!! Mapping note [" + sourceNote + "] to [" + targetNote + "]");
            return targetNote.getMidiKey();
        }

    }


}
