package obiektowe.escaperoom;

public class Key extends Item {

    public Key() {
        super("Klucz");
    }

    @Override
    public String use(Room room, Player player, Game game) {
        //room.getItems().remove(this);
        //Key key = this;
        player.addItem(this);
        room.removeItem(this);
        return "Używam, klucza";
    }

}
