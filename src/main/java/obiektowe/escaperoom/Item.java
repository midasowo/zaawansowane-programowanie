package obiektowe.escaperoom;

public abstract class Item {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract String use(Room room, Player player, Game game);

    public String getName() {
        return name;
    }

}
