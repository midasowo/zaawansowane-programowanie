package obiektowe.proste.garage;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Wheel wheel1 = new Wheel(2);
        Wheel wheel2 = new Wheel(2);
        Wheel wheel3 = new Wheel(2.2);
        Wheel wheel4 = new Wheel(2.2);

        List<Wheel> wheels = new ArrayList<>();
        wheels.add(wheel1);
        wheels.add(wheel2);
        wheels.add(wheel3);
        wheels.add(wheel4);
        Car car = new Car(wheels);

        System.out.println(car);






    }
}
