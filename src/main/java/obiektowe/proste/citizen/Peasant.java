package obiektowe.proste.citizen;

public class Peasant extends Citizen{
    public Peasant(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
