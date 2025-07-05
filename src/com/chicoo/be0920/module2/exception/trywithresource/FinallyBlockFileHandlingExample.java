package com.chicoo.be0920.module2.exception.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyBlockFileHandlingExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            // Reading a file
            reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle IO exceptions
        } finally {
            // Close BufferedReader
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            // Writing to a file
            writer = new FileWriter("output.txt");
            writer.write("Closing resources using finally block");
        } catch (IOException e) {
            e.printStackTrace(); // Handle IO exceptions
        } finally {
            // Close FileWriter
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
