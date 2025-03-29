package binary_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 128; i++) {
            list.add(i);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Take a guess : ");
        Integer guess = sc.nextInt();
        sc.nextLine();

        try {
            Integer position = BinarySearch.binarySearch(list, guess);

            if (position == null) {
                System.out.println("The value " + guess + " isn't in the list");
            } else {
                System.out.println("The position of the value " + guess + " is " + position);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
