package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadTextFile {
    public static void main(String[] args) {
        Path filePath = Path.of("src/main/java/org/example/sample.txt");
        System.out.println("Print Description");
        try {
            for (String line : Files.readAllLines(filePath)) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println("Could not read the file: " + e.getMessage());
        }
        finally {
            System.out.println("My task was to rebase a commit and I did it!!!");
            System.out.println("I have to commit Gullu");
            System.out.println("Bye Bye !!");
            System.out.println("Tata!!");
            System.out.println("Done Brother");
        }
    }
}
