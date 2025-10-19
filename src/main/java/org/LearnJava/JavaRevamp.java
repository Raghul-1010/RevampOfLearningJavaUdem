package org.LearnJava;

public class JavaRevamp {
    static int num = 39;

    //Basic For Loop
    public static void commonForLoop() {
        for (int i = 1; i <= num / 3; i++) {
            System.out.println("Count this" + i);
        }
    }

    public static void main(String[] args) {
        /*JavaRevamp Obj1 =  new JavaRevamp();*/
        RevampSupport classObj = new RevampSupport(); //Object for accessing RevampSupport child class.
        /*commonForLoop();
        classObj.quotientRemainder();
        RevampSupport.evenOrOdd(); //Static Method
        classObj.removeLastDigit();
        classObj.removeLastDigitSimple();
        classObj.extractLastDigit();*/
        classObj.extractFirstDigit();
    }
}
