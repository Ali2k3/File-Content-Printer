package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadTextFile {
    public static void main(String[] args) {
        Path filePath = Path.of("src/main/java/org/example/sample.txt");

        try {
            for (String line : Files.readAllLines(filePath)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Could not read the file: " + e.getMessage());
        }
    }
}
