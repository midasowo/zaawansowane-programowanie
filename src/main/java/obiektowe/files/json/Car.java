package obiektowe.files.json;

import java.util.Objects;

class Car  {


    private String brand;
    private String model;
    private double mileageInThousandsKm;
    private double capacity;
    private Engine engine;

    public Car(String brand, String model, double mileageInThousandsKm, double capacity, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.mileageInThousandsKm = mileageInThousandsKm;
        this.capacity = capacity;
        this.engine = engine;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getMileageInThousandsKm() {
        return mileageInThousandsKm;
    }

    public double getCapacity() {
        return capacity;
    }

    public Engine getEngine() {
        return engine;
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
