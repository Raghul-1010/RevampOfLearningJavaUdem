package org.LearnJava;

public class StringLearn01 {

    public static void main(String[] args) {
        // String is one of the pre-built class in Java
        // [ PandaArun ]
        // [ 012345678 ]
        String a = new String("PandaArun");
        String b = new String(" TigerArun");
        System.out.println(a.charAt(3)); // To identify and print the character at that particular index
        System.out.println(a.length());// To measure the length of the string
        System.out.println(a.substring(5));
        System.out.println(a.substring(3,6));
        System.out.println(a.concat("Tiger"));
        System.out.println(b.length()); //10 - 9character - 1 white space
        String c = b.trim(); // Trim to remove extra white space
        System.out.println(c); // Print the trimmed version
        System.out.println(c.length()); // After trimming the spaces
        System.out.println(c.toUpperCase()); // To make every String to Uppercase
        System.out.println(c.toLowerCase()); // To make every String to Lowercase
        //To remove extra spaces in the middle of the string
        String d = "t i ge r Ar u n  ";
        System.out.println(d.replace(" ",""));
        //Split
        String [] arr = a.split(String.valueOf(a.charAt(5)));// Splitting from the first available element
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        String replaceVerify= a.replace("Panda","Monkey");
        System.out.println(replaceVerify);
    }
}
