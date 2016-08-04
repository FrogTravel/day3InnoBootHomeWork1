package prog;

import java.util.Scanner;

/**
 * Created by ekaterina on 04.08.16.
 */
public class ClassWork {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int matrixStroke = scan.nextInt();
        int matrixColumn = scan.nextInt();

        int[][] firstMatrix = {{1,2},
                               {2,3}};

        int[][] secondMatrix = {{6,7,9,100},
                                {8,10,5,23}};

        int[][] result = add(firstMatrix, secondMatrix);

        for(int i = 0; i < result.length; i++){
            for (int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }

        result = addScalar(firstMatrix, 5);

        for(int i = 0; i < result.length; i++){
            for (int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }

        result = multiplyScalar(firstMatrix, 5);

        for(int i = 0; i < result.length; i++){
            for (int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }

        result = multiply(firstMatrix, secondMatrix);

        for(int i = 0; i < result.length; i++){
            for (int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /**
     *
     * @param firstMatrix
     * @param secondMatrix
     * @return
     */
    public static int[][] add(int[][] firstMatrix, int[][] secondMatrix){
        int[][] resultMatrix = new int[firstMatrix.length][firstMatrix[0].length];
        if((firstMatrix.length == secondMatrix.length)&&(firstMatrix[0].length == secondMatrix[0].length)) {
            for (int i = 0; i < firstMatrix.length; i++) {
                for (int j = 0; j < firstMatrix[0].length; j++) {
                    resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
            }
        }
        return resultMatrix;
    }

    public static int[][] addScalar(int[][] firstMatrix, int scalar){
        int[][] resultMatrix = new int[firstMatrix.length][firstMatrix[0].length];
            for (int i = 0; i < firstMatrix.length; i++) {
                for (int j = 0; j < firstMatrix[0].length; j++) {
                    resultMatrix[i][j] = firstMatrix[i][j] + scalar;
                }
            }
        return resultMatrix;
    }

    public static int[][] multiplyScalar(int[][] firstMatrix, int scalar) {
        int[][] resultMatrix = new int[firstMatrix.length][firstMatrix[0].length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[0].length; j++) {
                resultMatrix[i][j] = firstMatrix[i][j] * scalar;
            }
        }
        return resultMatrix;
    }

    public static int[][] multiply(int[][] firstMatrix, int[][] secondMatrix){
        int resultStrokeLength = firstMatrix.length;
        int resultColumnLength = secondMatrix[0].length;

        int[][] resultMatrix = new int[resultStrokeLength][resultColumnLength];
        if(firstMatrix[0].length == secondMatrix.length) {

            for (int i = 0; i < resultStrokeLength; i++) {
                for (int j = 0; j < resultColumnLength; j++) {
                    for(int k = 0; k < firstMatrix.length; k++){
                        resultMatrix[i][j] += firstMatrix[i][k]*secondMatrix[k][j];
                    }
                }
            }
        }
        return resultMatrix;
    }

}
