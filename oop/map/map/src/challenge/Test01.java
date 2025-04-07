package challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rober\\OneDrive\\Documentos\\Github\\my-studies\\oop\\map\\map" +
                "\\src\\challenge\\text.txt")))
        {
            Map<String, Integer> map = new HashMap<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Integer vote = Integer.parseInt(fields[1]);

                if (map.containsKey(name)) {
                    vote += map.get(name);
                }
                map.put(name, vote);

                line = br.readLine();
            }

            for (String key : map.keySet()) {
                System.out.println(key + " : " + map.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
