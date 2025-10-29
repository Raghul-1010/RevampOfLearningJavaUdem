package org.LearnJava;

import java.util.Scanner;

public class JavaRevamp {

    static Scanner io = new Scanner(System.in);

    static int num = 39;

    //Basic For Loop
    public static void commonForLoop() {
        for (int i = 1; i <= num / 3; i++) {
            System.out.println("Count this" + i);
        }
    }

    public void minutesToHours(RevampSupport helper) {
        System.out.print("Enter the total minutes:");
        int totalMinutes = io.nextInt(); // Accept totalMinutes as INTEGER
        helper.splitTime(totalMinutes);    }

    public void hoursToMinutes(RevampSupport helper) {
        System.out.print("Enter the time in HH:MM format:");
        String time = io.nextLine();  // Accept TIME as STRING
        helper.revTimeFormat(time);
    }

    public static void main(String[] args) {
        JavaRevamp Obj1 =  new JavaRevamp();
        RevampSupport classObj = new RevampSupport(); //Object for accessing RevampSupport child class.
        /*commonForLoop();
        classObj.quotientRemainder();
        RevampSupport.evenOrOdd(); //Static Method
        classObj.removeLastDigit();
        classObj.removeLastDigitSimple();
        classObj.extractLastDigit();
        classObj.extractFirstDigit();
        classObj.divisibleByThree();
        classObj.divisibleByTwo();
        classObj.oneToHundredDivBy3and5();
        lassObj.reverseANumber();
        classObj.numPalindrome();
        classObj.countOfNumberOfDigitsInNum();
        classObj.simpleCount();
        classObj.splitTime(totalMinutes);
        classObj.revTimeFormat(time);*/
        Obj1.hoursToMinutes(classObj);
        classObj.minutesToHours(classObj);
        io.close();
    }
}
