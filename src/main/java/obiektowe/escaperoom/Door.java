package obiektowe.escaperoom;

public class Door extends Item {

    private Key key;
    public Door(Key key) {
        super("Drzwi");
        this.key = key;
    }

    @Override
    public String use(Room room, Player player, Game game) {
        if (player.hasItem(key)) {
            game.endGame();
            return "Drzwi się otwierają!";
        }
        return "Drzwi pozostają zamknięte, nie masz klucza!";
    }
}
