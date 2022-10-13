package obiektowe.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteObjectDemo {

    public static void main(String[] args) {

        Car car = new Car("volkswagen", "passat", 180, 1.9);
        System.out.println(car);
        try {
            PrintWriter out = new PrintWriter("src/main/java/obiektowe/files/car2.csv");  //comma separated values
            out.printf(car.toCsv());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



