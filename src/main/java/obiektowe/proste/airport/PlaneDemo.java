package obiektowe.proste.airport;

import java.util.Random;

public class PlaneDemo {

    public static void main(String[] args) {

        Random random = new Random();

        Plane plane = new Plane("Warszawa", 33_000, 180);
        Plane plane2 = new Plane("Katowice", 33_000, 200);
        Plane plane3 = new Plane("Berlin", 33_000, 220);

        System.out.println(plane);
        System.out.println(plane2);
        System.out.println(plane3);

        plane.load(100);
        plane2.load(150);
        plane3.load(200);

        System.out.println(plane);
        System.out.println(plane2);
        System.out.println(plane3);


    }
}
