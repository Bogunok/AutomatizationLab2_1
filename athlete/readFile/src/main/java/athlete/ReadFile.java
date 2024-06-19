package athlete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) {
        //Reads file athlete.txt of athletes personal information
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/main/resources/athlete.txt")));
            System.out.println("Content of athlete.txt:");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}