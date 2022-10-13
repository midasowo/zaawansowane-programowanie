package obiektowe.files.text;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ProductDemo {

    public static void main(String[] args) {
        Product product1 = new Product("kanapka", 9.99, 1);
        Product product2 = new Product("bagietka", 1.99, 2);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        System.out.println(products);

        try {
            PrintWriter out = new PrintWriter("src/main/java/obiektowe/files/text/products.csv");
            out.println(product1.toCsv());
            out.println(product2.toCsv());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Product productsFromFile = new Product();
        try {
            List<String> productsInList = productsFromFile.readFromProducts();
            System.out.println(productsInList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//    Stwórz obiekt Product z polami name(string), price(double) oraz amount(int).
//        Przygotuj prosty serwis, który przyjmie listę produktów oraz zapisze je do pliku products.csv.
//        Jedna linia pliku to jeden obiekt.
//        Przygotuj metodę która odczyta z pliku zapisane linie i odtworzy z nich listę obiektów.



