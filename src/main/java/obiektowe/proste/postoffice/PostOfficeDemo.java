package obiektowe.proste.postoffice;

public class PostOfficeDemo {

    public static void main(String[] args) {
        final Package parcel = new Package("Mieczysław Bela", "Artur Leczyński", 1000);
        //  LocalDate date = LocalDate.of(2034,13,20);
        final Package parcel2 = new Package();
        final Package parcel3 = null;

        //final uniemożliwia wstawienie innego obiektu
//       parcel = parcel2;
//        parcel3= parcel;

        System.out.println(parcel.getPrice());
        System.out.println(parcel2.getPrice());
        System.out.println(parcel3.getPrice());
    }
}

/*
* Poczta part 1
Zaprojektuj i przetestuj nowy, referencyjny typ danych: Paczka.
Paczki mogą mieć nadawcę, odbiorcę oraz wagę, wyrażoną z dokładnością do gramów.
Mogą również być priorytetowe lub nie, domyślnie nie są.
Tworząc paczkę trzeba podać nadawcę, odbiorcę oraz jej wagę.
Konstruktor powinien skontrolować te wartości i wyświetlić błąd jeśli:
adresat lub nadawca nie został podany
waga nie mieści się w zakresie 1- 1000.
skontroluj, czy cechy paczek ustawiają się poprawnie
Przygotuj drugi alternatywny sposób tworzenia paczek (👉konstruktor), który będzie losował imię nadawcy, imię odbiorcy, wagę paczki i to czy jest ona priorytetowa czy nie.
manipulacje zmiennymi:
Przygotuj w main dwie zmienne z paczkami
Stwórz jedną zmienną bez paczki, zainicjowaną wartością null.
Sprawdź cenę paczek wykorzystując te 3 zmienne.
Napisz instrukcję, która wstawi pierwszą paczkę do trzeciej zmiennej i zastąpi nulla
wyświetl cenę paczki w trzeciej zmiennej
 Przetestuj co się stanie jeśli ustawisz wszystkie zmienne jako “final”.
* */

