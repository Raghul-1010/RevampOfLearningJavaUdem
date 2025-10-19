package org.LearnJava;

public class ArrayLearn {
    //Array is a container to store multiple values of same datatype
    public static void main(String[] args) {
        int[] newArray = new int[5]; // We're just creating a container and defining its size as 5
        newArray[0] = 1;
        newArray[1] = 2;
        newArray[2] = 3;
        newArray[3] = 4;
        newArray[4] = 5;
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        int[] b ={12,13,14,15,16};
        for (int j=0;j<b.length;j++)
        {
            System.out.println(b[j]);
        }
    }
}
