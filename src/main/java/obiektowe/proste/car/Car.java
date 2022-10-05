package obiektowe.proste.car;

public class Car {

    private static final int KM_TO_SERVICE = 20_000;

    private String brand;
    private double mileageInKm;

    public Car(String brand, double mileageInKm) {
        this.brand = brand;
        this.mileageInKm = mileageInKm;
    }

    public void printInfo() {
        System.out.printf("Marka: %s, przebieg: %.0f\n"
                , brand, mileageInKm);
    }

    public void getdistanceToDrive(int distance) {
        mileageInKm += distance;
    }

    public double getDistanceToService() {
        return Math.abs(mileageInKm % KM_TO_SERVICE - KM_TO_SERVICE);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileageInKm=" + mileageInKm +
                '}';
    }


}
