package obiektowe.files.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SerializationJsonDemo {

    public static void main(String[] args) {
        //ObjectMapper wymaga aby nasze klasy miały:
        //- gettery do wszystkich pól
        //-zgodne nazwy z nazwami w pliku
        //-bezparametrowy konstruktor

        Engine engine = new Engine("TDI");
        Car car = new Car("Volkswagen", "Passat",180, 1.9, engine);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("src/main/java/obiektowe/files/json/car.json"), car);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
