package obiektowe.proste.citizen;

public class Townsman extends Citizen {


    public Townsman(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }


}
