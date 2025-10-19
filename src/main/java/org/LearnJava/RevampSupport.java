package org.LearnJava;

import com.sun.source.tree.WhileLoopTree;

//.length() works only for String or array types
public class RevampSupport extends JavaRevamp {
    static int A = 55;
    static int B = 5;

    //Print the quotient and remainder of two given numbers.
    public void quotientRemainder() {
        int C = A / B;
        int D = A % B;
        System.out.println(C); // QUOTIENT IS 10
        System.out.println(D); // REMAINDER IS 0
    }

    //EVENORODD
    public static void evenOrOdd() {
        if (A % 2 == 0) {
            System.out.println("A is Even and it is =" + A);
        } else if (B % 2 == 0) {
            System.out.println("B is Even and it is =" + B);
        }
    }

    //Remove the last digit of a number. in most complex way
    public void removeLastDigit() {
        long numbers = 578389;
        String numStr = String.valueOf(numbers);//long to string conversion
        String wLD = "";
        for (int i = 0; i < numStr.length() - 1; i++) {
            wLD += numStr.charAt(i);
        }
        long backToNum = Long.parseLong(wLD); //Convert Back to String to Math
        System.out.println(backToNum);
    }

    //Remove the last digit of a number. Approach 2 (Simple)
    public void removeLastDigitSimple() {
        long numbers = 34432;
        System.out.println(numbers / 10);
        // /10 will remove the last the integer(digit from the numbers)
    }

    //Extract the last digit from the given number
    public void extractLastDigit() {
        long number = 7092177123L;
        long b = number % 10;
        System.out.println(b);
        //%10 always fetch the last remainder. % gives you the remainder after division.
    }

    // Extract First Digit
    public void extractFirstDigit() {
        long number = 78995;
        long temp = number; //temp is used, so number remains intact and can be used elsewhere
        while (temp >= 10)
        // Iteration 1 : 78995 >= 10 - 78995/10 = 7899
        //Iteration 2 :  7899 >= 10 - 7899/10 = 789
        //Iteration 3 : 789 >= 10 - 789/10 = 78
        //Iteration 4 : 78 >= 10 - 78/10 = 7
        //Iteration 5 : 7>=10 XXXXX
        {
            temp /= 10;
        }
        System.out.println(temp);
    }

    //Find the sum of digits of a number.
    public void sumOfDigits() {
        long number = 3187;
        long temp = number;
        long sum = 0;
        while (temp >= 0) {
            long lastDigit = temp % 10;
            sum += lastDigit;
            temp /= 10; //temp = temp/10
            /*Number = 3187
            Loop 1: lastDigit = 3187 % 10 = 7, sum = 7, temp = 5783 / 10 = 318
            Loop 2: lastDigit = 318 % 10 = 8, sum = 15, temp = 318 / 10 = 31
            Loop 3: lastDigit = 31 % 10 = 1, sum = 16, temp = 3 / 10 = 3*/
        }
    }


}
