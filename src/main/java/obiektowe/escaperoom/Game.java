package obiektowe.escaperoom;

import java.util.List;

//logika biznesowa aplikacji
public class Game {

    private Room room = new Room();

    public List<Item> getItems() {
        return room.getItems();
    }

    public void useItem(String itemName) throws ItemNotFoundException {
        Item itemFound = room.findItemBy(itemName);
        itemFound.use();  //polimorfizm w praktyce
    }
}
