import java.util.Arrays;
import java.util.List;

public class Test {

    public static final String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    public static final List<String> noteNameList = Arrays.asList(NOTE_NAMES);


    public static void main(String[] args) throws Exception {
        for (int i = -2; i < 8; i++) {
            for (int j = 0; j < NOTE_NAMES.length; j++) {
                String name = NOTE_NAMES[j] + i;
                int key = convertNoteNameToKey(name);
                System.out.println("Note [" + name + "] => key [" + key + "]");
            }
        }

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
}
