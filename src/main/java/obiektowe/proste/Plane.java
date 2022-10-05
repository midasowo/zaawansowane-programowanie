package obiektowe.proste;

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
        //spr czy nie za dużo
        usedSeats += people;
        double totalPeopleWeight = 100*people;
        weightInKg += totalPeopleWeight;
    }

    public String toString() {
        return "samolot, miasto: " + city + " waga: " + weightInKg
                + "maks miejsca: " + maxSeats + " wykorzystane miejsca" + usedSeats;
    }


}
