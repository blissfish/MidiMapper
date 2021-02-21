import java.util.HashMap;
import java.util.Map;

public class DrumMapper {

    private static final DrumMap sourceMap = new DrumMap("Toontrack Superior Drummer 3");
    private static final DrumMap targetMap = new DrumMap("GGD Invasion Default Mapping Invasion");
    private static final Map<Integer, Integer> mappingMap = new HashMap<>();

    private static final MappingTable mappingTable = new MappingTable(MappingTable.GM_STANDARD, MappingTable.GGD_INVASION);
    private static final Boolean MAPPING = true;

    static {
        /*//GM Standard => Invasion Default mapping*/
        mappingTable.addMapping("C1", "C0");//kick
        //mappingTable.addMapping(58, 38);//Vibraslap => Doesn't exist in GGD*/
        mappingTable.addMapping("E2", "F3");//China 1
        mappingTable.addMapping("C1", "C0");//kick
        mappingTable.addMapping("D1", "D0");//snare
        mappingTable.addMapping("D2", "A0");//RT 1
        mappingTable.addMapping("C2", "A#0");//RT 2
        mappingTable.addMapping("B1", "B0");//RT 3
        mappingTable.addMapping("A1", "D1");//RT 4 => FT 3
        mappingTable.addMapping("G1", "C1");//FT 1
        mappingTable.addMapping("F1", "C#1");//FT 2
        mappingTable.addMapping("D#2", "C#3");//Ride 1
        mappingTable.addMapping("F2", "D3");//Ride 1 Bell
        mappingTable.addMapping("B2", "D#3");//Ride 2
        mappingTable.addMapping("G#2", "G4");//Cowbell => GGD Bell L Hit
        mappingTable.addMapping("E2", "F3");//China 1
        mappingTable.addMapping("C#2", "E2");//Crash 1
        mappingTable.addMapping("A2", "F#2");//Crash 2
        mappingTable.addMapping("G2", "C#4");//Splash 1
        mappingTable.addMapping("F#1", "F-1");//HH CC
        mappingTable.addMapping("A#1", "A1");//HH O
        mappingTable.addMapping("G#1", "C2");//HH PCF
        mappingTable.addMapping("C#1", "A#3");//Snare Stick
        mappingTable.addMapping("F#2", "F#4");//Tambourine => Cym 1 Stack Hit
        System.exit(0);

    }

    public static int map(int key) {
        if (!MAPPING) {
            return key;
        }
        MidiNote targetNote = mappingTable.getTargetNote(key);

        if (targetNote == null) {
            return key;
        } else {
            return targetNote.getMidiKey();
        }

    }


}
