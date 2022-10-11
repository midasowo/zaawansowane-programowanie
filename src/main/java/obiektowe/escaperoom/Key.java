package obiektowe.escaperoom;

public class Key extends Item {

    public Key() {
        super("Klucz");
    }

    @Override
    public String use(UseContext context) {
        //room.getItems().remove(this);
        //Key key = this;
        context.getPlayer().addItem(this);
        context.getRoom().removeItem(this);
        return "Używam, klucza";
    }

}
