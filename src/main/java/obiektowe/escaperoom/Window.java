package obiektowe.escaperoom;

public class Window extends Item {

    public Window() {
        super("Okno");
    }

    public boolean isWindowOpen() {
        return false;
    }

    @Override
    public void use() {
        System.out.println("Używam okno");
    }
}
