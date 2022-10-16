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

        ProductRepository productManaging = new ProductRepository();
        productManaging.saveProduct(product1);
        productManaging.saveProduct(product2);

//        Product productsFromFile = new Product();
//        productManaging.readProducts(product1);
        productManaging.readProducts(product2);
    }
}
//    Stwórz obiekt Product z polami name(string), price(double) oraz amount(int).
//        Przygotuj prosty serwis, który przyjmie listę produktów oraz zapisze je do pliku products.csv.
//        Jedna linia pliku to jeden obiekt.
//        Przygotuj metodę która odczyta z pliku zapisane linie i odtworzy z nich listę obiektów.



