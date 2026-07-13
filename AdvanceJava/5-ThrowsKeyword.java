class ThrowsKeyword {
    
}

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    static void openFile() throws IOException {
        FileReader file = new FileReader("data.txt");
        System.out.println("File opened successfully.");
    }

    public static void main(String[] args) {

        try {
            openFile();
        } catch (IOException e) {
            System.out.println("Exception Handled!");
            System.out.println(e);
        }

        System.out.println("Program continues...");
    }
}