import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static StringBuilder log = new StringBuilder();

    public static void main(String[] args) throws Exception {

        createDir("D://Games");
        createDir("D://Games/src");
        createDir("D://Games/res");
        createDir("D://Games/savegames");
        createDir("D://Games/temp");
        createDir("D://Games/src/main");
        createDir("D://Games/src/test");

        try {
            createFile("D://Games/src/main//Main.java");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            createFile("D://Games/src/main//Utils.java");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        createDir("D://Games/res/drawables");
        createDir("D://Games/res/vectors");
        createDir("D://Games/res/icons");

        createFile("D://Games/temp//temp.txt");

        try (FileWriter logWriter = new FileWriter("D://Games/temp//temp.txt")) {
            logWriter.write(log.toString());
            logWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(log.toString());

    }

    static void createDir(String path) {
        if (new File(path).mkdir()) log.append("Папка ")
                .append(path)
                .append(" создана\n---\n");
    }

    static void createFile(String path) throws Exception {
        if (new File(path).createNewFile()) {
            log.append("Файл ")
                    .append(path, path.lastIndexOf('/') + 1, path.length())
                    .append(" в каталоге ")
                    .append(path, 0, path.lastIndexOf('/') - 1)
                    .append(" создан\n---\n");
        }
    }

}
