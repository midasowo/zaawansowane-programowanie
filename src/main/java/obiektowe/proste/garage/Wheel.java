package obiektowe.proste.garage;

public class Wheel {

    private double pressure;
    boolean flat = false;

    public Wheel(double pressure) {
        this.pressure = pressure;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", flat=" + flat +
                '}';
    }
}
