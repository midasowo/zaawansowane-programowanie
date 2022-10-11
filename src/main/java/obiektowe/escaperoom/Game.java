package obiektowe.escaperoom;

import java.util.List;

//logika biznesowa aplikacji
public class Game {

    private Room room = new Room();
    private Player player = new Player();
    private boolean running = true;

    public List<Item> getItems() {
        return room.getItems();
    }

    public String useItem(String itemName) throws ItemNotFoundException {
        Item itemFound = room.findItemBy(itemName);
        return itemFound.use(new UseContext(player, this, room)); // polimorfizm w praktyce
    }

    public boolean isGameRunning() {
        return running;
    }

    public void endGame() {
        running = false;
    }
}
