package basic_with_class;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();
        Product p1 = new Product("Tv", 2500.0);
        Product p2 = new Product("Laptop", 4000.0);
        Product p3 = new Product("Tablet", 3000.0);

        stock.put(p1, 100000.0);
        stock.put(p2, 200000.0);
        stock.put(p3, 150000.0);

        Product ps = new Product("Tv", 2500.0);
        /*
        * HashMap uses equals and hashcode.
        * If they don't exist. It uses the address memory
        * */
        System.out.println("Contains 'ps' key : " + stock.containsKey(ps));
    }
}
