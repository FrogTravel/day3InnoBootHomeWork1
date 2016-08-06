package prog;

/**
 * Created by ekaterina on 04.08.16.
 */
public class LinearEquatationsSolver {

    /**
     * Copy of matrix is needed to right work of function
     * Another way method will change matrix array
     * @param args
     */
    public static void main(String[] args) {
        double[][] matrix = {{1,2,3},
                            {4,6,3},
                            {2,3,1}};
        double[][] copyOfMatrix = copyMatrix(matrix);
        double[] freeMember =  {6,
                                8,
                                12};
        double mainDeterminate = getDeterminate(copyOfMatrix);

        for(int i = 0; i < matrix.length; i++){
            double[][] newMatrix =  changeArray (matrix, freeMember, i);
            double aditionDeterminant = getDeterminate(newMatrix);

            double result = aditionDeterminant/mainDeterminate;
            System.out.println("Result: " + result);
        }
    }

    /**
     * Method gives determinant using matrix as param
     * It iterates through the matrix, than if see that element is
     * not at the main diagonal first count coefficient
     * on what non-zero element will be added
     * than it goes to the right and changes every element in the stroke
     * @param localMatrix matrix that must be changed
     * @return determinant of matrix
     */
    public static double getDeterminate(double[][] localMatrix) {
        double coef = 0;
        for(int i = 0; i < localMatrix.length; i++){
            for(int j = 0; j < localMatrix.length; j++){

//                System.out.println("localMatrix: ");
//                for(int l = 0; l < localMatrix.length; l++){
//                    for(int p = 0; p < localMatrix.length; p++){
//                        System.out.print(localMatrix[l][p] + " ");
//                    }
//                    System.out.println();
//                }

                if(i == j) continue;
                coef = (-localMatrix[i][j])/localMatrix[i][i];
                for(int k = i; k < localMatrix.length; k++){
                    localMatrix[k][j] += coef * localMatrix[k][i];
                }
            }
        }

        double determinant = 1;
        for(int i = 0; i < localMatrix.length; i++) {
            determinant *= localMatrix[i][i];
        }

       // System.out.println("\t\tDeterminant: " + determinant);
        return determinant;
    }

    /**
     * Change one column of matrix to another
     * @param matrix that must be changed
     * @param freeMember on what it will be change
     * @param index what column to change
     * @return new matrix
     */
    public static double[][] changeArray(double[][] matrix, double[] freeMember, int index){
        double[][] newMatrix = new double[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if(index == i){
                    newMatrix[j][i] = freeMember[j];
                }else{
                    newMatrix[j][i] = matrix[j][i];
                }
                //System.out.print((int) matrix[i][j] + " ");
            }
            //System.out.println();
        }
        return newMatrix;
    }


    /**
     * Copy matrix
     * @param matrix that must be copied
     * @return new matrix
     */
    public static double[][] copyMatrix(double matrix[][]){
        double resultMatrix[][] = new double[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                resultMatrix[i][j] = matrix[i][j];
                System.out.print(resultMatrix);
            }
            System.out.println();
        }
        return resultMatrix;

    }


}
