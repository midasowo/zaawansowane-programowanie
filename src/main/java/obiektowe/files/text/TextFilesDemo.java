package obiektowe.files.text;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextFilesDemo {

    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter("car.txt");  //przykładowe narzędzie do zapisu w pliku
            String car = "passat 1.9 tdi 180 tys. km";
            out.println(car); //wydruk pliku
            out.println(car);
            out.close(); //zamkniecie narzędzia
        } catch (FileNotFoundException e) { //obsłużyć wyjątki
            System.out.println("Problem z utworzeniem pliku!");
            e.printStackTrace();
        }

    }
}
