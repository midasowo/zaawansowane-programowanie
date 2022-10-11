package obiektowe.escaperoom;

public class Window extends Item {

    private boolean open = false;

    public Window() {
        super("Okno");
    }

    @Override
    public String use() {
        if (open) {
            open = false;
            return "Zamykasz okno";
        } else {
            open = true;
            return "Otwierasz okno";
        }
    }
}
