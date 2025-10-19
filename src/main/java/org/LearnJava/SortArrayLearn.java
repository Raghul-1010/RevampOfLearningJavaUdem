package org.LearnJava;

public class SortArrayLearn {

    //Sort in ascending order

    static int[] arraySort = new int[5];

    static {
        arraySort[0] = 30;
        arraySort[1] = 10;
        arraySort[2] = 90;
        arraySort[3] = 100;
        arraySort[4] = 9;
    }

    static int temp;

    /*
     * We're about to swap the variables/numbers inside the array
     * Step 1: Read the values in the array
     * Step 2: Compare the value with the array and arrange the in ascending order
     */
    public static void sortingArray() {
        // actual [30,10,90,100,9]
        // expected [ 9,10,30,90,100]
        for (int i = 0; i <= arraySort.length - 1; i++) {
            //System.out.println(arraySort[i]); print the actual
            for (int j = i + 1; j <= arraySort.length - 1; j++) {
                //System.out.println(arraySort[j]);
                if (arraySort[i] > arraySort[j]) {
                    temp = arraySort[i];
                    arraySort[i] = arraySort[j];
                    arraySort[j] = temp;
                }
            }
        }
        for (int i = 0; i < arraySort.length - 1; i++) {
            System.out.println(arraySort[i]);
        }

    }

    public static void swapInDescendingOrder() {
        for (int a = 0; a <= arraySort.length - 1; a++) {
            for (int b = a + 1; b < arraySort.length - 1; b++) {
                if (arraySort[b] > arraySort[a]) {
                    temp = arraySort[b];
                    arraySort[b] = arraySort[a];
                    arraySort[a] = temp;
                }
            }
        }
        for(int a=0;a<arraySort.length-1;a++){
            System.out.println(arraySort[a]);
        }
    }

    public void generalSwap() {
        int a = 20;
        int b = 900;
        int c; // temp place to store the swapping values
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
        //without temp
        int z = 100;
        int y = 90;
        z = z + y; // z =  190
        y = z - y; // y = 190-90 = 100
        z = z - y; // z = 190 - 100 = 90
        System.out.println(z);
        System.out.println(y);


    }


    public static void main(String[] args) {
        SortArrayLearn obj1 = new SortArrayLearn();
        //obj1.generalSwap();
        //sortingArray();
        swapInDescendingOrder();

    }
}
