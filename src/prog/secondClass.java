package prog;

import java.util.Scanner;

/**
 * Created by ekaterina on 03.08.16.
 */
public class secondClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int counter = 0;

        int n = 0;

        boolean prime = true;

        while(true){
            n++;

            if(n >= 2) {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = false;
                    }
                }
            }

            if(prime) {
                System.out.println(n);
                counter++;
            }

            if(counter >= 1000){
                break;
            }

            prime = true;
        }

    }
}
