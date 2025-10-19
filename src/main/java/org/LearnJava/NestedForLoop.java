package org.LearnJava;

import java.util.SortedMap;

public class NestedForLoop {
    static String A = "OuterLoop Started";
    static String A1 = "OuterLoop Ended";
    static String B = "InnerLoop";

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println(A);
            for (int j = 1; j <= 4; j++) {
                System.out.println(B);
            }
            System.out.println(A1);
        }
    }
}
