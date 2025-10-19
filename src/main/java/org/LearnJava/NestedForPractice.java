package org.LearnJava;

public class NestedForPractice {
    static int k = 1;
    static int o = 1;
    static int p = 3;
    public static void lowerDiagonal()
    {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println(" ");
        }
    }
    public static void upperDiagonal(){
        for (int l = 1; l <= 4; l++) {
            for (int m = 0; m <= 4-l; m++) {
                System.out.print(o);
                System.out.print("\t");
                o++;
            }
            System.out.println(" ");
        }

    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
    */
    public static void incrementalLooping(){
        for (int l = 1; l <= 4; l++) {
            for (int m = 3; m <=l; m++) {
                System.out.print(m);
                System.out.print("\t");
            }
            System.out.println(" ");
        }

    }
    public static void multiplesOfThree(){
        for (int l = 1; l <= 3; l++) {
            for (int m = 1; m <=l; m++) {
                System.out.print(p);
                System.out.print("\t");
                p+=3;
            }
            System.out.println(" ");
        }

    }
    /*1
      2 4
      3 5 7
      6 8 10 12
      9 11 13 15 17
      14 16 18 20 22
     */

    public static void practice(){
        int start = 1;
        for (int row=1;row<=6;row++)
        {
            int current = start;
            for(int col=1; col<=row;col++)
            {
                System.out.print(current+"\t");
                current+=2;
            }
            start++;

            System.out.println();
        }

    }
    public static void main(String[] args) {
        //lowerDiagonal();
        //upperDiagonal();
        //incrementalLooping();
        //multiplesOfThree();
        practice();
    }
}
