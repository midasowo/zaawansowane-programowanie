package obiektowe.escaperoom;

public class Key extends Item {

    public Key() {
        super("Klucz");
    }

    @Override
    public String use() {
        return "Używam, klucza";
    }

}
