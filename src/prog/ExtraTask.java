package prog;

/**
 * Created by ekaterina on 04.08.16.
 */
public class ExtraTask {

    public static void main(String[] args) {
        double[][] matrix = {{1,2,3},
                            {4,6,3},
                            {2,3,1}};
        double[][] copyOfMatrix = {{1,2,3},
                                {4,6,3},
                                {2,3,1}};
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


}
