package challenges.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Exercise01 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rober\\OneDrive\\" +
                "Documentos\\Github\\my-studies\\oop\\set\\" +
                "set\\src\\challenges\\ex01\\text.txt")))
        {

            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }
            System.out.println("Total Users : " + set.size());
        } catch(IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
