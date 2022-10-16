package obiektowe.files.text;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class ProductRepository {

    public void saveProduct(Product product) {
        try {
            PrintWriter out = new PrintWriter("src/main/java/obiektowe/files/text/products.csv");
            out.println(product.toCsv());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readProducts(Product productsFromFile) {
        try {
            List<String> productsInList = productsFromFile.readFromProducts();
            System.out.println(productsInList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }







}
