package prog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by ekaterina on 06.08.16.
 */
public class Extra {


    public static void main(String[] args) {

        Extra extra = new Extra();
        extra.go();
    }

    public void go(){
        String[] fullFile = readFile();

        int time[] = new int[fullFile.length];
        double GPSX[] = new double[fullFile.length];
        double GPSY[] = new double[fullFile.length];
        double distancePassed[] = new double[fullFile.length];
        double accelerateX[] = new double[fullFile.length];
        double accelerateY[] = new double[fullFile.length];

        String[] str;

        for (int i = 0; i < fullFile.length; i++) {
            str = fullFile[i].split(",");

            if(!str[0].equals(""))
                time[i] = (int) Double.parseDouble(str[0]);
            else
                time[i] = 0;


            if(!str[1].equals(""))
                GPSX[i] = Double.parseDouble(str[1]);
            else
                GPSX[i] = 0.0;

            if(!str[2].equals(""))
                GPSY[i] = Double.parseDouble(str[2]);
            else
                GPSY[i] = 0.0;

            if(!str[3].equals(""))
                distancePassed[i] = Double.parseDouble(str[3]);
            else
                distancePassed[i] = 0.0;

            if(!str[4].equals(""))
                accelerateX[i] = Double.parseDouble(str[4]);
            else
                accelerateX[i] = 0.0;

            if(!str[5].equals(""))
                accelerateY[i] = Double.parseDouble(str[5]);
            else
                accelerateY[i] = 0.0;

            System.out.print(time[i] + "   ");
            System.out.print(GPSX[i] + "   ");
            System.out.print(GPSY[i] + "   ");
            System.out.print(distancePassed[i] + "   ");
            System.out.print(accelerateX[i] + "   ");
            System.out.println(accelerateY[i] + "   ");
        }
    }

    private static String[] readFile() {
        try {
            Scanner scan = new Scanner(new File("data.csv"));
            ArrayList<String> result = new ArrayList<String>();
            scan.nextLine();
            while (scan.hasNext()){
                result.add(scan.nextLine() + "\n");
            }
            return result.toArray(new String[result.size()]);
        } catch (FileNotFoundException ex) {
            return null;
        }
    }


    private void parseFile(double[] valuesArray, int i, String[] str){
        if(!str[0].equals(""))
            valuesArray[i] = (int) Double.parseDouble(str[0]);
        else
            valuesArray[i] = 0;
    }

    private void parseFile(int[] valuesArray, int i, String[] str){
        if(!str[0].equals(""))
            valuesArray[i] = (int) Double.parseDouble(str[0]);
        else
            valuesArray[i] = 0;
    }




}
