import java.util.HashMap;
import java.util.Map;

public class DrumMap {

    private Map<Integer, MidiNote> map = new HashMap();
    private String mapName = null;

    public DrumMap(String mapName) {
        this.mapName = mapName;
    }

    public void add(MidiNote note) {
        map.put(note.getMidiKey(), note);
    }

    public MidiNote get(int key) {
        MidiNote note = map.get(key);
        return note;
    }

}
