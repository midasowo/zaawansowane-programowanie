package obiektowe.files.text;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private double mileageInThousandKm;
    private double capacity;

    public Car(String brand, String model, double mileageInThousandKm, double capacity) {
        this.brand = brand;
        this.model = model;
        this.mileageInThousandKm = mileageInThousandKm;
        this.capacity = capacity;
    }

    public String toCsv() {
        return String.format(("%s;%s;%.1f;%.1f"), brand, model, mileageInThousandKm, capacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileageInThousandKm=" + mileageInThousandKm +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.mileageInThousandKm, mileageInThousandKm) == 0 && Double.compare(car.capacity, capacity) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, mileageInThousandKm, capacity);
    }
}


