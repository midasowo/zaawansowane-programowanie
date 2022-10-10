package obiektowe.escaperoom;

public class Key extends Item {

    public Key() {
        super("Klucz");
    }

    public boolean isKeyAvailable() {
        return false;
    }

    @Override
    public void use() {
        System.out.println("Używam klucza");
    }
}
