package obiektowe.escaperoom;

public class Key extends Item {

    public Key() {
        super("Klucz");
    }

    @Override
    public String use(Room room) {
        //room.getItems().remove(this);
        room.removeItem(this);
        return "Używam, klucza";
    }

}
