package obiektowe.files.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CarReaderDemo {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/main/java/obiektowe/files/text/car2.csv"));
            String csvLine = scanner.nextLine();
            String[] csvElements = csvLine.split(";");
            String brand = csvElements[0];
            String model = csvElements[1];
            double mileage = Double.parseDouble(csvElements[2].replace(',','.'));
            double capacity = Double.parseDouble(csvElements[3].replace(',','.'));
            Car carFromFile = new Car(brand, model, mileage, capacity);
            System.out.println(carFromFile);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
