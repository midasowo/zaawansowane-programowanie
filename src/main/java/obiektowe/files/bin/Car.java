package obiektowe.files.bin;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

class Car  implements Serializable {

    public static final long serialVersionUID = -9151209106588661959L; // przejąłęm zdalne sterowanie nad ID klasy aby, stare zapisy działały

    private String brand;
    private String model;
    private double mileageInThousandsKm;
    private double capacity;
    private Engine engine;
    private transient Scanner scanner = new Scanner(System.in);  // pomiń dane pole przy serializacji

    public Car(String brand, String model, double mileageInThousandsKm, double capacity, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.mileageInThousandsKm = mileageInThousandsKm;
        this.capacity = capacity;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.mileageInThousandsKm, mileageInThousandsKm) == 0 && Double.compare(car.capacity, capacity) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, mileageInThousandsKm, capacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileageInThousandsKm=" + mileageInThousandsKm +
                ", capacity=" + capacity +
                '}';
    }
}
