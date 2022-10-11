package obiektowe.escaperoom;

public abstract class Item {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract String use(Room room);

    public String getName() {
        return name;
    }

}
