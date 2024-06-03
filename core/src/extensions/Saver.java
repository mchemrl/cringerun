package extensions;

import com.badlogic.gdx.Gdx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Saver {

    //if true - no music/sounds, 1 - music, 2 - sound
    public static void saveSettings(boolean isMusic, boolean isSound){
        try {
            PrintWriter writer = new PrintWriter(new File("core/src/extensions/settings.txt"));
            writer.println(isMusic);
            writer.println(isSound);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void saveProgress(){

    }
}
