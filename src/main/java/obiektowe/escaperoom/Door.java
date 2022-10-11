package obiektowe.escaperoom;

public class Door extends Item {

    private Key key;
    public Door(Key key) {
        super("Drzwi");
        this.key = key;
    }

    @Override
    public String use(UseContext context) {
        if (context.getPlayer().hasItem(key)) {
            context.getGame().endGame();
            return "Drzwi się otwierają!";
        }
        return "Drzwi pozostają zamknięte, nie masz klucza!";
    }
}
