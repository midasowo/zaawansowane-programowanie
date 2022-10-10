package obiektowe.escaperoom;

public class Door extends Item {

    public Door() {
        super("Drzwi");
    }

    public boolean isDoorOpen() {
        return false;
    }

    @Override
    public void use() {
        System.out.println("Używam drzwi");
    }
}
