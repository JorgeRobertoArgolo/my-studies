package basic;

import java.util.Map;
import java.util.TreeMap;
/*
* TreeMap -> order by key
* */
public class Basic {
    public static void main(String[] args){
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "Mary");
        cookies.put("email", "mary@gmail.com");
        cookies.put("phone", "999999999");
        //Override
        cookies.put("phone", "999999998");

        cookies.remove("email");

        System.out.println("Contains 'phone' key : " + cookies.containsKey("phone"));
        System.out.println("Phone number : " + cookies.get("phone"));
        System.out.println("Email : " + cookies.get("email"));
        System.out.println("Size : " + cookies.size());

        System.out.println("All Cookies :");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}