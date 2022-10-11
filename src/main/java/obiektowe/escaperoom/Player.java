package obiektowe.escaperoom;

import obiektowe.proste.line.Line;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Item> items = new ArrayList<>();

    public void  addItem (Item item){
        items.add(item);
    }

    public boolean hasItem(Item item) {
        return items.contains(item);
    }

    @Override
    public String toString() {
        return "Player{" +
                "items=" + items +
                '}';
    }
}
