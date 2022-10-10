package obiektowe.proste.citizen;

import java.util.List;

public class Town {

    private List<Citizen> citizens;

    public Town(List<Citizen> citizens) {
        this.citizens = citizens;
    }

    int howManyCanVote() {
        int count = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                count++;
            }
        }
        return count;
    }

    int howManyCanVoteStream() {
        return (int) citizens.stream()
//              .filter(Citizen::canVote)
                .filter(citizen -> citizen.canVote())
                .count();
    }

    void whoCanVote() {
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }
    }
}
