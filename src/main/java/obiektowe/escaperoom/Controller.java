package obiektowe.escaperoom;

import java.util.List;

public abstract class Controller {
    private Game game = new Game();

    public void startGame() {
        showMessage("Rozpoczynasz grę");
        showMessage("Widzisz pokój z różnymi przedmiotami, z którymi możesz wchodzić w interakcję");
        repeatInteraction();
        showMessage("Gratulacje, rozwiązałeś zagadkę i wygrałeś!");
    }

    private void repeatInteraction() {
        do {
            executeInteraction();
        } while (game.isGameRunning());
    }

    private void executeInteraction() {
        showItems();
        String itemName = selectItem();
        useItem(itemName);
    }

    private void showItems() {
        List<Item> items = game.getItems();
        String text = "";
        for (Item item : items) {
            text += item.getName() + "\n";
        }
        showMessage(text);
    }

    private String selectItem() {
        return readMessage("Wpisz nazwę przedmiotu, którego chcesz użyć: ");
    }

    private void useItem(String itemName) {
        try {
            String result = game.useItem(itemName);
            showMessage(result);
        } catch (ItemNotFoundException e) {
            showMessage("Nie znaleziono przedmiotu!");
        }
    }

    public abstract void showMessage(String message);

    public abstract String readMessage(String question);


}
