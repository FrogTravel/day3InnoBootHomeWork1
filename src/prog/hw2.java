package prog;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by ekaterina on 03.08.16.
 */
public class hw2 {
    static int x = 0, y = 0;

    public static void main(String[] args){
        String commands = "";
        try {
             commands = readString();
        }catch (NoSuchElementException e){

        }


        String[] str = commands.split("");

        for(int i = 0; i < commands.length(); i++){
            switch (str[i]){
                case "L":
                    x -= 1;
                    break;
                case "U":
                    y += 1;
                    break;
                case "R":
                    x += 1;
                    break;
                case "D":
                    y -= 1;
                    break;
            }
        }

        writeString(String.valueOf(x) + " " + String.valueOf(y));
    }

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

}
