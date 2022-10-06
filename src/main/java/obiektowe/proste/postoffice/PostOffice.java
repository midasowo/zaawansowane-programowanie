package obiektowe.proste.postoffice;

import java.util.Scanner;

public class PostOffice {

    double money = 0;
    Package lastOrderedParcel = null;

    public double orderParcel(Package parcel, double cash) {
        if (cash >= parcel.getPrice()) {
            parcel.status = Status.ORDERED;
            money += parcel.getPrice();
            lastOrderedParcel = parcel;
            return cash - parcel.getPrice();
        } else {
            return cash;
        }
    }

    public Package returnLastOrderedParcel() {
        return lastOrderedParcel;
    }

    public Package createPackage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nadawce:");
        String sender = scanner.nextLine();
        System.out.println("Podaj odbiorce:");
        String recipient = scanner.nextLine();
        System.out.println("Podaj wagę w gramach:");
        int weight = scanner.nextInt();
        return new Package(sender, recipient, weight);
    }


}

/*
* zachowania poczty
Do poczty dodaj metodę, która pozwoli nam nadawać paczki
Metoda ma wymagać przekazania paczki oraz kwoty pieniędzy
Metoda przyjmując paczkę powinna sprawdzić jej cenę, i jeśli zapłacono wystarczającą ilość pieniędzy ma zmienić jej status na “nadana”
*  oraz zwrócić resztę.
Jeśli przekazano zbyt małą kwotę ma zwrócić tę kwotę i nie modyfikować stanu paczki.
Na koniec dodaj do poczty pole “utarg” i dodawaj do niego zarobione przez pocztę pieniądze.
Dodaj metodę pozwalającą na stworzenie i zwrócenie paczki
Ma ona zapytać w konsoli o wszystkie parametry paczki i stworzyć ją jako obiekt
na koniec zwróć utworzoną paczkę
W mainie spróbuj wykorzystać nową metodę do wytworzenia paczki
nadaj ją przy pomocy poprzedniej metody do nadawania paczek
Dodatkowe: Dodaj metodę, która będzie wyświetlała ostatnią nadaną paczkę.
*
*
*
* */



