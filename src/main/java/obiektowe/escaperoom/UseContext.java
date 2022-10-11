package obiektowe.escaperoom;

public class UseContext {

    private Player player;
    private Game game;
    private Room room;

    public UseContext(Player player, Game game, Room room) {
        this.player = player;
        this.game = game;
        this.room = room;
    }

    public Player getPlayer() {
        return player;
    }

    public Game getGame() {
        return game;
    }

    public Room getRoom() {
        return room;
    }
}
