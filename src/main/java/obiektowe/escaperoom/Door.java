package obiektowe.escaperoom;

public class Door extends Item {

    public Door() {
        super("Drzwi");
    }

    @Override
    public String use() {
        return "Używam drzwi";
    }
}
