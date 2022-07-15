package pepcoding_level1.basic_programming.TwoDArray;

/**
 * Set Matrix zero
 *
 * https://takeuforward.org/data-structure/set-matrix-zero/
 *
 */
public class SetMatrixZero
{
    static void setZeroes (int[][] matrix)
    {//[[1,1,1],[1,0,1],[1,1,1]]  => [[1,0,1],[0,0,0],[1,0,1]]
        int rows = matrix.length, cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {

                    int ind = i - 1;
                    while (ind >= 0) {
                        if (matrix[ind][j] != 0) {
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }
                    ind = i + 1;
                    while (ind < rows) {
                        if (matrix[ind][j] != 0) {
                            matrix[ind][j] = -1;
                        }
                        ind++;
                    }
                    ind = j - 1;
                    while (ind >= 0) {
                        if (matrix[i][ind] != 0) {
                            matrix[i][ind] = -1;

                        }
                        ind--;
                    }
                    ind = j + 1;
                    while (ind < cols) {
                        if (matrix[i][ind] != 0) {
                            matrix[i][ind] = -1;

                        }
                        ind++;
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] <= 0) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

    static void setZero (int matrix[][])
    {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                //if I find in the matrix have 0 then will make entire row and that column as -1
                //because if we made 0 here then while iterating the other rows and columns 0 will come again and we will get affected unnecessary
                if (matrix[i][j] == 0) {

                    int indicator = i - 1;
                    while (indicator >= 0) {
                        if (matrix[indicator][j] != 0) {
                            matrix[indicator][j] = -1;
                        }
                        indicator--;
                    }

                    indicator = i + 1;
                    while (indicator < rows) {
                        if (matrix[indicator][j] != 0) {
                            matrix[indicator][j] = -1;
                        }
                        indicator++;
                    }

                    indicator = j - 1;
                    while (indicator >= 0) {
                        if (matrix[i][indicator] != 0) {
                            matrix[i][indicator] = -1;
                        }
                        indicator--;
                    }

                    indicator = j + 1;
                    while (indicator < cols) {
                        if (matrix[i][indicator] != 0) {
                            matrix[i][indicator] = -1;
                        }
                        indicator++;
                    }
                }
            }
        }

        //once it's done then all the places where we have -1 need to set 0

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main (String args[])
    {
        //[[1,0,1],[0,0,0],[1,0,1]]
        //int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        int arr[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
      //  setZeroes(arr);
        setZero(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
