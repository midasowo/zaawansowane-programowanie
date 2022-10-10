package obiektowe.proste.garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {

    List<Wheel> wheels;

    public Car(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void flatRandomTire() {
        Random random = new Random();
        Wheel unluckyWheel = wheels.get(random.nextInt(wheels.size()));

        unluckyWheel.flat = true;
        unluckyWheel.setPressure(0);
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                '}';
    }
}
