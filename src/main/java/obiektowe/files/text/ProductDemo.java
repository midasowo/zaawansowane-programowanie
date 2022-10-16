package obiektowe.files.text;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ProductDemo {

    public static void main(String[] args) {
        Product product1 = new Product("kanapka", 9.99, 1);
        Product product2 = new Product("bułka", 1.99, 2);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        System.out.println(products);

        product1.saveProduct(product1);
//        product2.saveProduct(product2);

        Product productsFromFile = new Product();
        product1.readProducts(productsFromFile);
//        product2.readProducts(productsFromFile);
    }
}
//    Stwórz obiekt Product z polami name(string), price(double) oraz amount(int).
//        Przygotuj prosty serwis, który przyjmie listę produktów oraz zapisze je do pliku products.csv.
//        Jedna linia pliku to jeden obiekt.
//        Przygotuj metodę która odczyta z pliku zapisane linie i odtworzy z nich listę obiektów.



