import java.util.HashMap;
import java.util.Map;

/**
 * Cymbal Crash 1 Mute G#2 56
 * Cymbal Crash 2 Hit C#2 49
 * Cymbal Crash 2 Mute D2 50
 * Cymbal Crash 3 Hit A2 57
 * Cymbal Crash 3 Mute A#2 58
 * Cymbal Crash 4 Hit E2 52
 * Cymbal Crash 4 Mute F#2 54
 * Floortom 1 Hit G1 43
 * Floortom 1 Rimshot D#4 75
 * Floortom 2 Hit F1 41
 * Floortom 2 Rimshot C#4 73
 * Hi Hat Closed Edge A#-1 22
 * Hi Hat Closed Tip F#1 42
 * Hi Hat Open 1 C0 24
 * Hi Hat Open 2 C#0 25
 * Hi Hat Open 3 D0 26
 * Hi Hat Open 4 C3 60
 * Hi Hat Open 5 F-1 17
 * Hi Hat Pedal Close Foot A-1 21
 * Hi Hat Tight Edge D3 62
 * Hi Hat Tight Tip D#3 63
 * Kick C1 36
 * Racktom 1 Hit C2 48
 * Racktom 1 Rimshot A#4 82
 * Racktom 2 Hit B1 47
 * Racktom 2 Rimshot G#4 80
 * Racktom 3 Hit A1 45
 * Racktom 3 Rimshot F#4 78
 * Ride 1 Bell F2 53
 * Ride 1 Bow D#2 51
 * Ride 1 Edge B2 59
 * Ride 1 Mute B4 83
 * Snare Hit D1 38
 * Snare Rimshot E1 40
 * Snare Sidestick C#1 37
 */
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
