package com.chicoo.be0920.module2.exception.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceFileExample {
    public static void main(String[] args) {
        // Reading a file
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle IO exceptions
        }

        // Writing to a file
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("File Writer in try with resource example!");
        } catch (IOException e) {
            e.printStackTrace(); // Handle IO exceptions
        }
    }
}

