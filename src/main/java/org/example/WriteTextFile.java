package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteTextFile {
    public static void main(String[] args) {
        Path filePath = Path.of("src/main/java/org/example/output.txt");

        try {
            Files.writeString(filePath, "Ali is there");
            System.out.println("Text written successfully!");
        } catch (IOException e) {
            System.out.println("Could not write to the file: " + e.getMessage());
        }
    }
}

