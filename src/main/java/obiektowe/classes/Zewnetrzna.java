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
        class  LokalnaKlasa{

        }
        LokalnaKlasa lokalnaKlasa = new LokalnaKlasa();

        Car car = new Car();
        Car track = new Car() {
            @Override
            public void drive() {
                System.out.println("Jadę ciężarówką");
            }
        };

        System.out.println(car.getClass());
        System.out.println(track.getClass());

        car.drive();
        track.drive();

        Shouter shouter = new Shouter(){
            @Override
            public void shout(String text) {
                System.out.println(text.toUpperCase() + "!!!");
            }
        };

        shouter.shout("co słychać?");

        Funkcja funkcja = new Funkcja(){
            @Override
            public void coRobieNaKliknecie() {
                System.out.println("Hello world!");
            }
        };

        Przycisk przycisk = new Przycisk(funkcja);
        przycisk.click();


    }





   /* static void metoda(){
    }
    static void innaMetoda(Metoda metod){
        metoda.wywolaj();
    }*/





}

class Car{

    public void drive() {
        System.out.println("Jade");
    }


}

interface Shouter{
    void shout(String text);
}

interface Funkcja{
    void coRobieNaKliknecie();
}

class Przycisk{

    private Funkcja funkcja;

    public Przycisk(Funkcja funkcja) {
        this.funkcja = funkcja;
    }


    public void click() {
        funkcja.coRobieNaKliknecie();
    }
}
