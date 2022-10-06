package obiektowe.proste.postoffice;

import java.util.Random;

public class Package {

    final String sender;
    final String recipient;
    final int weightInGram;
    final boolean priority;
    Status status = Status.CREATED;


    public Package(String sender, String recipient, int weightInGram) {
        validateSender(sender);
        this.sender = sender;

        this.recipient = recipient;
        if (recipient == null || recipient.isBlank()) {
            System.out.println("Nie podano odbiorcy");
        }

        this.weightInGram = weightInGram;
        priority = false;
    }

    private void validateSender(String sender) {
        if (sender == null || sender.isBlank()) {
            System.out.println("Nie podano nadawcy");
            throw new IllegalArgumentException("Nie podano nadawcy");
        }
    }

    public Package() {
        Random random = new Random();
        String[] names = {"Ania", "Marta", "Adam", "Asia", "Arek", "Wojtek"};
        sender = names[random.nextInt(names.length)];
        recipient = names[random.nextInt(names.length)];
        weightInGram = random.nextInt(100_000) + 1;
        priority = random.nextBoolean();
    }


    public double getPrice() {
        double price = 0;
        if (weightInGram <= 500) {
            price = 5;
        } else if (weightInGram <= 1000) {
            price = 8;
        } else if (weightInGram <= 2000) {
            price = 12;
        } else {
            price += (weightInGram - 2000.0) / 1000;
        }

        if (priority) {
            price *= 1.1;
        }
        return price;
    }


//    return (weight > 0.5 && weight <= 1) ? 8 : (weight > 1 && weight <= 2) ? 12 : (weight > 2) ? (12.0 + (weight - 2.0)) : 5.0;



   /* Przygotuj również metodę pozwalającą wyliczyć i zwrócić cenę paczki, która zostanie wyliczona na podstawie jej parametrów:
    paczka do 0.5 kg  kosztuje 5 zł
do 1kg kosztuje 8zł
do 2 kg kosztuje 12 zł
    powyżej 2kg doliczane jest 1 zł za każdy kilogram
    paczka kosztuje 10% drożej jeśli jest priorytetowa*/

    @Override
    public String toString() {
        return "Package{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", weightInGram=" + weightInGram +
                ", priority=" + priority +
                ", price=" + getPrice() +
                '}';
    }


    /*
    Konstruktor powinien skontrolować te wartości i wyświetlić błąd jeśli:
    adresat lub nadawca nie został podany
    waga nie mieści się w zakresie 1- 1000.*/


}
