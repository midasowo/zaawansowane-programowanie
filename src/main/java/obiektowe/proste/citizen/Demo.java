package obiektowe.proste.citizen;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        King king = new King("Arthur");
        Soldier soldier = new Soldier("Viktoria");
        Townsman townsman = new Townsman("Zofia");
        Peasant peasant = new Peasant("Jan");


        List<Citizen> citizens = new ArrayList<>();
        citizens.add(king);
        citizens.add(soldier);
        citizens.add(townsman);
        citizens.add(peasant);

        Town town = new Town(citizens);
        System.out.println(town.howManyCanVote());
        town.whoCanVote();


    }
}

/*
    Stwórz klasę abstrakcyjną Citizen oraz klasy dziedziczące:
        Peasant(Chłop),
        Townsman(Mieszczanin),
        King(Król),
        Soldier(Żołnierz)
        Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować to pole). Citizen powinien być klasą
        abstrakcyjną która posiada metodę abstrakcyjną 'canVote' która zwraca true dla townsman'a i soldier'a,
         ale false dla chłopa i króla.
        Stwórz klasę Town która posiada zbiór obiektów typu Citizen. Dodaj do niej kilku citizenów (tworząc ich w main).
         Obiekt klasy Town ma mieć metody:
        howManyCanVote -  które zwracają ilość osób które mogą głosować
        whoCanVote -  która wypisuje imiona osób które mogą głosować
*/



