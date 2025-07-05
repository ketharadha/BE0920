package com.chicoo.be0920.module2.exception.checkedexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleExceptionWithFinally {
    public static void main(String[] args) {

        try {
            method1("dummy");
        } catch (FileNotFoundException e) { //Most Specific
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void method1(String name) throws IOException, FileNotFoundException, ClassNotFoundException {
        if(name.equals("dummy")) {
            throw new FileNotFoundException();
        } else if (name.equals("interrupted")) {
            throw new IOException();
        } else if (name.equals("interrupted")) {
            throw new ClassNotFoundException();
        }
    }
}
