package obiektowe.escaperoom;

//rozruch programu i przygotowywanie niezbędnych do tego obiektów
public class App {

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.startGame();


    }
}




        /*Projekt Escape Room

        Zaprojektuj program, w którym użytkownik będzie znajdował się w pokoju. Będą znajdować
         się w nim przedmioty: drzwi, okno i klucz.
        Użytkownik może wykonać interakcje z jednym z wybranych przedmiotów (użyj narzędzia Scanner).
                Gra kończy się gdy uda mu się otworzyć drzwi.

        Jeśli użytkownik użyje:
        okno: - otworzy się lub zamknie
        klucz: - użytkownik zabierze klucz i klucz nie będzie się już pojawiał jako jedna z opcji
        drzwi: - otworzą się ale tylko jeśli użytkownik zabrał klucz, jeśli nie, pozostaną zamknięte

        Przy każdej próbie użycia obiektu powinien wyświetlić się stosowny komunikat.*/



