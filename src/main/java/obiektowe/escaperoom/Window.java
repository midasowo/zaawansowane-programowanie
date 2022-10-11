package obiektowe.escaperoom;

public class Window extends Item {

    private boolean open = false;

    public Window() {
        super("Okno");
    }

    @Override
    public String use(UseContext context) {
//        open = open ? false : true;
        /*if (open) {
            open = false;
        }else{
            open = true;
        }*/

        open = !open;
        return open ? "Zamykasz okno" : "Otwierasz okno";
    }
}
