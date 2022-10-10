package obiektowe.proste.citizen;

public abstract class Citizen {
    private String name;

 /*  public Citizen() {
      System.out.println("Powstaje Citizen");
   }*/

    public Citizen(String name) {
        this.name = name;
    }

    public abstract boolean canVote();

    public String getName() {
        return name;
    }
}