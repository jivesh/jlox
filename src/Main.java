import lox.Lox;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Booting up Lox v1.0!");
        try {
            Lox.main(args);
        } catch (IOException e) {
            System.out.println("Caught an IO exception: " + e.getMessage());
        }
    }
}