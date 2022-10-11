package obiektowe.escaperoom;

import java.util.List;
import java.util.Scanner;

//klasa do interakcji z aplikacją - wyświetla komunikaty, pozwala wprowadzać decyzje gracza do programu
public class Controller {

    private Game game = new Game();

    public void startGame() {
        System.out.println("Rozpoczynasz grę.");
        System.out.println("Widzisz pokój z różnymi przedmiotami, z którymi możesz wchodzić w interakcję");
        askForItems();
    }

    private void askForItems() {
        do {
            showItems();
            String itemName = selectItem();
            useItem(itemName);
        } while (true);
    }

    private void showItems() {
        List<Item> items = game.getItems();
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }

    private String selectItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz nazwę przedmiotu, którego chcesz użyć: ");
        return scanner.nextLine();
    }

    private void useItem(String itemName) {
        try {
            String result = game.useItem(itemName);
            System.out.println(result);
            System.out.println("Przedmiot " + itemName + " aktywowany");
        } catch (ItemNotFoundException e) {
            System.out.println("Nie znaleziono przedmiotu!");
        }
    }
}
