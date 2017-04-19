package server; /**
 * Created by sampastoriza on 4/16/17.
 */
import java.io.File;

public class AudioUtil {
    public static File getSoundFile(String fileName) {
        File soundFile = new File(fileName);
        if (!soundFile.exists() || !soundFile.isFile())
            throw new IllegalArgumentException("not a file: " + soundFile);
        return soundFile;
    }
}