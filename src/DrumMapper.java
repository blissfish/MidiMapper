public class DrumMapper {

    private static final DrumMap sourceMap = new DrumMap("Toontrack Superior Drummer 3");
    private static final DrumMap targetMap = new DrumMap("GGD Invasion");

    static {
        targetMap.add(new MidiNote("Cymbal Crash 1 Hit", "G2", 61));

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
        sourceMap.add(new MidiNote("Snare Sidestick", "C#1", 37));
    }

    public static int map(int key) {
        MidiNote sourceNote = sourceMap.get(key);
        if (sourceNote == null) {
            return key;
        } else if (sourceNote.getMidiKey() == 21) {
            MidiNote targetNote = targetMap.get(61);
            if (targetNote == null) {
                return key;
            } else {
                System.out.print(" Mapping note [" + sourceNote + "] to [" + targetNote + "]");
                return targetNote.getMidiKey();
            }
        }
        return key;
    }


}
