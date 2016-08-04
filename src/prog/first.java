package prog;
import java.io.*;
import java.util.Scanner;

/**
 * Created by ekaterina on 03.08.16.
 */
public class first {
    private static double readDouble() {
        try {
            return new Scanner(new File("input.txt")).nextDouble();
        } catch (FileNotFoundException ex) {
            return -1;
        }
    }

    private static String readString() {
        try {
            return new Scanner(new File("input.txt")).nextLine();
        } catch (FileNotFoundException ex) {
            return null;
        }
    }

    private static void writeString(String s) {
        try {
            try (Writer writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("output.txt"), "ascii"))) {
                writer.write(s);
            }
        } catch (IOException ex) {
        }
    }

    private static void writeDouble(double number) {
        writeString(Double.toString(number));
    }

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        int number = Integer.valueOf(readString());

        String result = "";

        for(int i = 1; i <= number; i++){
            if(number % i == 0) result += i + " ";
        }

        writeString(result);
    }
}
