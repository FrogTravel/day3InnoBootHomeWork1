package prog;

import java.util.Scanner;

/**
 * Created by ekaterina on 03.08.16.
 */
public class firstClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double counter = scan.nextInt();

        double sum = 0;

        /*for(int i = 0; i < counter; i++){
            sum += (Math.pow(-1, i))/(2*i + 1);
        }*/

        int i = 0;
        while(i < counter) {
            sum += (Math.pow(-1, i))/(2*i + 1);
            i++;
        }

        sum *= 4;

        System.out.print(sum);

    }
}
