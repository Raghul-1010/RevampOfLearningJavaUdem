package org.LearnJava;

import java.util.Arrays;

public class multidimensionalArray {

    public void printMinimumNumberFromMultiDimensionalArray() {
        int[][] arrayLearn = new int[3][3];
        int min = arrayLearn[0][0]; //Assume First element of the matrix is the smallest
        arrayLearn[0][0] = 42;
        arrayLearn[0][1] = 11;
        arrayLearn[0][2] = 12;
        arrayLearn[1][0] = 13;
        arrayLearn[1][1] = 14;
        arrayLearn[1][2] = 15;
        arrayLearn[2][0] = 16;
        arrayLearn[2][1] = 17;
        arrayLearn[2][2] = 18;

        for (int i = 0; i < arrayLearn.length; i++) {
            for (int j = 0; j < arrayLearn[i].length; j++) {
                //System.out.print(arrayLearn[i][j]+"\t");
                if (arrayLearn[i][j] < min) {
                    min = arrayLearn[i][j];
                }
            }
        }
        System.out.println(min);
    }

    public void multiDimensionalArrayPrac() {
        int[][] b = {{32, 56, 98}, {34, 10, 90}, {32, 30, 33, 91}};
        int[][] c = new int[2][3];
        c[0][0] = 12;
        c[0][1] = 25;
        c[0][2] = 65;
        c[1][0] = 35;
        c[1][1] = 80;
        c[1][2] = 60;
        try {
            System.out.println(b[2][3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Check for the array value fed");
        }
        //System.out.println("The length of array c is "+ c[0].length); length is 3 because c[0] refers column of size 3     12 25 65  Row - 2
        //System.out.println("The length of array c is "+ c.length); length is 2 because c[0] refers rows of size 2          35 80 60
        // Columns - 3
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print((c[i][j] + "\t"));
            }
            System.out.println(" ");
        }
    }

    public void test() {
        int[][] arrayMulti = new int[2][3];
        arrayMulti[0][0] = 2;
        arrayMulti[0][1] = 2;
        arrayMulti[0][2] = 2;
        arrayMulti[1][0] = 2;
        arrayMulti[1][1] = 2;
        arrayMulti[1][2] = 2;

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.print(arrayMulti[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }

    public void tryFor() {
        int a = 0;
        for (int i = 0; i <=4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a+"\t");
                a++;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        multidimensionalArray arrayStu = new multidimensionalArray();
        //arrayStu.multiDimensionalArrayPrac();
        //arrayStu.printMinimumNumberFromMultiDimensionalArray();
        arrayStu.test();
        //arrayStu.tryFor();
    }
}
