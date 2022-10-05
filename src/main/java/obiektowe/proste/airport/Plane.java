package obiektowe.proste.airport;


public class Plane {

    String city;
    double weightInKg;
    int maxSeats;
    int usedSeats;

    Plane(String city, double weightInKg, int maxSeats) {
        this.city = city;
        this.weightInKg = weightInKg;
        this.maxSeats = maxSeats;
        usedSeats = 0;
    }

    public Plane(String city, double weightInKg, int maxSeats, int usedSeats) {
        this.city = city;
        this.weightInKg = weightInKg;
        this.maxSeats = maxSeats;
        this.usedSeats = usedSeats;
    }

    public void fly() {

    }

    public void load(int people) {
        usedSeats += people;
        double totalPeopleWeight = 100 * people;
        weightInKg += totalPeopleWeight;
    }

    public String toString() {
        int citySpaces = 10;
        return String.format("samolot, miasto: %" + citySpaces + "s waga: %7.1f maks " +
                        "miejsca: %5d wykorzystanie miejsca: %5d",
                city, weightInKg, maxSeats, usedSeats);
    }

    /*@Override
    public String toString() {
        return "Plane{" +
                "city='" + city + '\'' +
                ", weightInKg=" + weightInKg +
                ", maxSeats=" + maxSeats +
                ", usedSeats=" + usedSeats +
                '}';
    }*/
}
