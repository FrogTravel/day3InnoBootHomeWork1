package prog;

import java.util.Scanner;

/**
 * Created by ekaterina on 03.08.16.
 */
public class extraClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] alph = str.toCharArray();
        byte passwordLength = scanner.nextByte();

        String[] k = passwordGenerator(alph, passwordLength);


    }

    public static String[] passwordGenerator(char[] alphabet, byte lengthOfPass){
        double alphabetLength = alphabet.length;

        int numberOfPasswords = (int) Math.pow(alphabetLength, lengthOfPass);
        int number = 0;
        String password = "";

        String[] result = new String[numberOfPasswords];

        for(int i = 0; i < numberOfPasswords; i++){
            number = i;

            for(int j = 0; j < lengthOfPass; j++){
                password = alphabet[(int) (number%alphabetLength)] + password;
                number /= lengthOfPass;
            }

            result[i] = password;
            System.out.print(password + " ");
            password = "";

        }

        return result;
    }
}
