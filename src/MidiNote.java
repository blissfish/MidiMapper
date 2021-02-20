public class MidiNote {
    private String instrument = null;
    private String noteName = null;
    private Integer midiKey = null;

    public MidiNote(String instrument, String noteName, int midiKey) {
        this.instrument = instrument;
        this.noteName = noteName;
        this.midiKey = midiKey;
    }

    @Override
    public String toString() {
        return "MidiNote{" +
                "instrument='" + instrument + '\'' +
                ", noteName='" + noteName + '\'' +
                ", midiKey=" + midiKey +
                '}';
    }

    public String getInstrument() {
        return instrument;
    }

    public String getNoteName() {
        return noteName;
    }

    public Integer getMidiKey() {
        return midiKey;
    }
}
