import java.io.*;
import java.nio.file.*;
import java.util.Vector;

public class Global implements Serializable {
    static Vector<Project> projects = new Vector<>(0);
    static boolean workflag = true;
    static boolean haveToLoad = false;
    private static final String FILE_NAME = "projects.txt";

    public static void saveProjectsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(getFile()))) {
            oos.writeObject(projects);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadProjectsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(getFile()))) {
            projects = (Vector<Project>) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            projects = new Vector<>();
            System.err.println("Error loading projects from file. Creating an empty projects vector.");
        }
    }

    private static File getFile() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return file;
    }
}