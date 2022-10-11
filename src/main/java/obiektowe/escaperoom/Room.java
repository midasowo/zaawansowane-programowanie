package obiektowe.escaperoom;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private List<Item> items = new ArrayList<>();

    public Room() {
        Key key =new Key();
        items.add(new Door(key));
        items.add(new Window());
        items.add(key);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public Item findItemBy(String name) throws ItemNotFoundException{
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        throw new ItemNotFoundException();
    }


    public void removeItem(Item item) {
        items.remove(item);
    }
}
