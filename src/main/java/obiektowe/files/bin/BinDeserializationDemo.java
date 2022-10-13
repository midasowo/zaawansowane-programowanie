package obiektowe.files.bin;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BinDeserializationDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/obiektowe/files/bin/car.bin"));
            Car car = (Car) ois.readObject();
            System.out.println(car);
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Nie udało się odczytać obiektu");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("No i po co skasowałeś klase?");
        }
    }
}
