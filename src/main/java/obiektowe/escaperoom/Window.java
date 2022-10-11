package obiektowe.escaperoom;

public class Window extends Item {

    private boolean open = false;

    public Window() {
        super("Okno");
    }

    @Override
    public String use(Room room) {
        open = !open;
        return open ? "Zamykasz okno" : "Otwierasz okno";
    }
}
