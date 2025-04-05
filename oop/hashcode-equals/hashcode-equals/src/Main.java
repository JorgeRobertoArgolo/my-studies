//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
 * Hash code is faster than equals
 *
 * First you use the hash code to find the
 * element. Then use the equals to confirm
 * */
public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Mary", "mary@gmail.com");
        Customer c2 = new Customer("Eve", "eve@gmail.com");
        Customer c3 = new Customer("Eve", "eve@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        System.out.println(c2.equals(c3));
        System.out.println(c2 == c3);
    }

    public void basic () {
        String a = "Mary";
        String b = "Eve";
        String c = "Eve";



        System.out.println(a.equals(b));
        System.out.println(c.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
    }
}