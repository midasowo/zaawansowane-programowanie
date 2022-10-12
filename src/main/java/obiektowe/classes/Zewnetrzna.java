package obiektowe.classes;

public class Zewnetrzna {
    private int pole;
    private Wewnetrzna wewnetrzna = new Wewnetrzna(); // :)

    public Zewnetrzna(int pole) {
        this.pole = pole;
        System.out.println("Tworzę obiekt klasy zewnętrznej");
    }

    @Override
    public String toString() {
        return "Zewnetrzna{" +
                "pole=" + pole ;
    }

    static class  Wewnetrzna{
        private int poleWewnetrznej;
        public Wewnetrzna(){
            System.out.println("Tworzę obiekt klasy wewnętrznej");
//            System.out.println(Zewnetrzna.this.pole); //Obiekty klasy wewnętrznej są domyślnie ściśle związne z obiektem klasy zewnętrznej
//            System.out.println(pole);// Jeśli klasa jest statyczna nie ma już związku z obiektem klasy zewnętrznej
            System.out.println(this.poleWewnetrznej);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Zewnetrzna zewnetrzna1 = new Zewnetrzna(13);
        Zewnetrzna zewnetrzna2 = new Zewnetrzna(10);
        System.out.println(zewnetrzna1);
//        Zewnetrzna.Wewnetrzna wewnetrzna = zewnetrzna2.new Wewnetrzna();
        //że można korzystać z klasy wewnętrznej bez odnoszenia się do klasy zewnętrznej?
//        Zewnetrzna.Wewnetrzna wewnetrznaStatyczna = new Zewnetrzna.Wewnetrzna();
    }
}
