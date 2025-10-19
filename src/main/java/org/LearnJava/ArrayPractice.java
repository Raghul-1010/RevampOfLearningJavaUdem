package org.LearnJava;

public class ArrayPractice {
    static int[][] a = new int[4][2];

    static {
        a[0][0] = 18;
        a[0][1] = 1;
        a[1][0] = 2;
        a[1][1] = 1000;
        a[2][0] = 3;
        a[2][1] = 12;
        a[3][0] = 4;
        a[3][1] = 21;
    }

    static int min = a[0][0];
    static int max = a[0][0];

    public void minimumValueFromMultiDimeArray() {
        // Assumed and initialized the first value of array as lowest.

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //System.out.print(a[i][j]+"\t");
                if (a[i][j] < min) {
                    min = a[i][j];
                    System.out.println(min);
                }

            }
            System.out.println(" ");
        }
    }

    public void maximumValueFromMultiDimeArray() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //System.out.print(a[x][y] + "\t");
                if (a[i][j] > max) {
                    max = a[i][j];
                    System.out.println(max);
                }
            }
            System.out.println(" ");
        }
    }

    /*
    12 99 114
    13 113  0
    1  13 99
     */
    /* Find the lowest number in the row and analyze and print the highest number in its column.*/

    //Step 1 : Find the lowest Number.
//Step 2 : Identify the column of the lowest number.
//Step 3 : Find the highest number in identified column.
    public static void lowestAndHighest() {
        int[][] yarra = {{12, 99, 114}, {13, 113, 0}, {1, 13, 99}};
        int minimum = yarra[0][0]; //Assume first element is the smallest in the multi-array
        int lowestCol = 0; //Assume first element is the smallest in the multi-array
        for (int i = 0; i < yarra.length; i++)//Rows
        {
            for (int j = 0; j < yarra[i].length; j++)//travel through columns
            {
                if (yarra[i][j] < minimum) {//i - row ||  j-column
                    minimum = yarra[i][j];
                    lowestCol = j;
                    // System.out.println(minimum); - 0
                    // System.out.println(lowestCol); - 2
                }
            }
        }
        int k = 0;//initiating the row index
        int highestInCol = yarra[0][lowestCol];
        while (k < yarra.length) {
            if (yarra[k][lowestCol] > highestInCol) {
                highestInCol = yarra[k][lowestCol];
                System.out.println(highestInCol);
            }
            k++;
        }
        System.out.println(highestInCol);

    }




    public static void main(String[] args) {
        ArrayPractice obj1 = new ArrayPractice();
        // obj1.minimumValueFromMultiDimeArray();
        //obj1.maximumValueFromMultiDimeArray();
        lowestAndHighest();

    }
}
