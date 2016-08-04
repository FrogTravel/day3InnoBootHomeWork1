package prog;

import java.util.Scanner;

/**
 * Created by ekaterina on 03.08.16.
 */
public class thirdClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input numbers");

        double firstNumber = scan.nextDouble();
        double secondNumber = scan.nextDouble();

        System.out.println("Input operator");

        String operator = scan.next();

        double result = 0;

        switch (operator){
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber/secondNumber;
                break;
            case "%":
                result = firstNumber%secondNumber;
                break;
        }

        System.out.println("Result: \n" + result);

    }
}
