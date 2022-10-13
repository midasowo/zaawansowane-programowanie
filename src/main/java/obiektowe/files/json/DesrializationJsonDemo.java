package obiektowe.files.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DesrializationJsonDemo {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Car car = objectMapper.readValue(new File("src/main/java/obiektowe/files/json/car.json"),Car.class);
            System.out.println(car);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
