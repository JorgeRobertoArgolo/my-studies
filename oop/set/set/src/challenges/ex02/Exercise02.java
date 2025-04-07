package challenges.ex02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd;

        Set<Student> set = new HashSet<>();

        System.out.println("How many students for course A ?");
        qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            int num = sc.nextInt();
            sc.nextLine();

            set.add(new Student(num));
        }

        System.out.println("How many students for course B ?");
        qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            int num = sc.nextInt();
            sc.nextLine();

            set.add(new Student(num));
        }

        System.out.println("How many students for course C ?");
        qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            int num = sc.nextInt();
            sc.nextLine();

            set.add(new Student(num));
        }

        System.out.println("Total students : " + set.size());

        sc.close();
    }
}
