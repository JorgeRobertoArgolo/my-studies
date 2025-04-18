import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product("TV", 2900.00));
        list.add(new Product("Laptop", 3900.00));
        list.add(new Product("Table", 1500.00));

        /*
        * First method
        * */
        //list.sort(new MyComparator());

        /*
        * Second Method
        * */
        /*
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        list.sort(comp);
        */

        /*
        * Third Method -> arrow function
        * */
        /*
        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };
        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        list.sort(comp);
         */

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));



        for (Product p : list) {
            System.out.println(p);
        }
    }
}