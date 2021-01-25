import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws Exception {

        StringBuilder log = new StringBuilder();

        if (new File("D://Games").mkdir())
            log.append("Папка D://Games создана\n");

        if (new File("D://Games/src").mkdir())
            log.append("Папка D://Games/src создана\n");

        if (new File("D://Games/res").mkdir())
            log.append("Папка D://Games/res создана\n");

        if (new File("D://Games/savegames").mkdir())
            log.append("Папка D://Games/savegames создана\n");

        if (new File("D://Games/temp").mkdir())
            log.append("Папка D://Games/temp создана\n");

        if (new File("D://Games/src/main").mkdir())
            log.append("Папка D://Games/src/main создана\n");

        if (new File("D://Games/src/test").mkdir())
            log.append("Папка D://Games/src/test создана\n");

        try {
            if (new File("D://Games/src/main//Main.java").createNewFile())
                log.append("Файл Main.java в каталоге D://Games/src/main создан\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            if (new File("D://Games/src/main//Utils.java").createNewFile())
                log.append("Файл Utils.java в каталоге D://Games/src/main создан\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        if (new File("D://Games/res/drawables").mkdir())
            log.append("Папка D://Games/res/drawables создана\n");

        if (new File("D://Games/res/vectors").mkdir())
            log.append("Папка D://Games/res/vectors создана\n");

        if (new File("D://Games/res/icons").mkdir())
            log.append("Папка D://Games/res/icons создана\n");


        try {
            if (new File("D://Games/temp//temp.txt").createNewFile())
                log.append("Файл temp.txt в каталоге D://Games/temp создан\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter logWriter = new FileWriter("D://Games/temp//temp.txt")) {
            logWriter.write(log.toString());
            logWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
