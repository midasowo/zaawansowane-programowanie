package obiektowe.escaperoom;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private List<Item> items = new ArrayList<>();

    public Room(){
        items.add(new Door());
        items.add(new Window());
        items.add(new Key());
    }

    public List<Item> getItems() {
        return items;
    }

    public Item findItemBy(String name) throws ItemNotFoundException {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }

        }
        throw new ItemNotFoundException();
    }

}
