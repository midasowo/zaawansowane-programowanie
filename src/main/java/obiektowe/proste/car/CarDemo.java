package obiektowe.proste.car;

public class CarDemo {

    public static void main(String[] args) {

        Car audi = new Car("AUDI", 50_000);
        Car bmw = new Car("BMW", 99_000);

        System.out.println(audi);
        System.out.println(bmw);

        audi.printInfo();
        bmw.printInfo();

        audi.getdistanceToDrive(100);

        audi.printInfo();

        System.out.println(audi.getDistanceToService());
        System.out.println(bmw.getDistanceToService());
    }
}
