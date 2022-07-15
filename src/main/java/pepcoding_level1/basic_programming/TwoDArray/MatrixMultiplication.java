package pepcoding_level1.basic_programming.TwoDArray;

import java.util.Scanner;

/**
 * Link :
 * https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/matrix_multiplication/topic
 * <p>
 * Matrix Multiplication
 * <p>
 * Input Format
 * A number n1
 * A number m1
 * e11
 * e12..
 * e21
 * e22..
 * .. n1 * m1 number of elements of array a1
 * A number n2
 * A number m2
 * e11'
 * e12'..
 * e21'
 * e22'..
 * .. n2 * m2 number of elements of array a2
 * <p>
 * Output Format
 * e11' e12' e13' ..
 * e21' e22' e23' ..
 * .. elements of prd array
 */
public class MatrixMultiplication
{
    public static void main (String[] args)
    {
        //taking input
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();//taking rows
        int c1 = sc.nextInt();//taking columns

        //forming 2d Array
        int[][] one = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                one[i][j] = sc.nextInt();
            }
        }

        int r2 = sc.nextInt();//taking rows
        int c2 = sc.nextInt();//taking columns

        //forming 2nd matrix for multiplication
        int[][] two = new int[r2][c2];

        //filling the 2nd array
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                two[i][j] = sc.nextInt();
            }
        }

        //now we need to do the multiplication
        if (c1 != r2) {
            System.out.println("matrix 1 column and matrix2 rows should be same");
            return;
        }

        //now we need to take one more array to store the multiplied value
        // array size should be as matrix 1 rows and matrix 2 column

        //matrix one : 2 , 3 and matrix two is : 3, 4
        //then matrix product will be form based on 1st matrix row i.e 2 and 2nd matrix column i.e 4
        // product : 2*4
        /*
          product :
          c11 c12 c13 c14
          c21 c22 c23 c24
          here c11= a11.b11 + a12.b21 + a13.b31
               c23 = a21.b13 + a22.b23 + a23.b33 ( a rows are same and column get change and b rows same as a's column
          in above product of c11 : 1st row and first column
          rows are same , but column getting change
          a12.b21 here 1st column is same as 2nd matrix row
         */
        int product[][] = new int[r1][c2];

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                for (int k = 0; k < c1; k++) {//now we need to fill
                    product[i][j] += one[i][k] * two[k][j];
                }
            }
        }

        //we need to print the product
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                System.out.println(product[i][j] + " ");
            }
            System.out.println();
        }

    }
}
