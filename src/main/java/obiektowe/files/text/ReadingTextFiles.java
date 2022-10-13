package obiektowe.files.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
//SCANNER - ODCZYT Z PLIKU

public class ReadingTextFiles {

    public static void main(String[] args) {
        //scanner jak dostanie String to skanuje ten String, nie traktuje go jako ścieżki do pliku tak, jak PrintWriter
        File file = new File("car.txt"); //obiekt reperezentujacy ścieżkę
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
            e.printStackTrace();
        }

        try {
            List<String> list = Files.readAllLines(Path.of("car.txt"));
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
