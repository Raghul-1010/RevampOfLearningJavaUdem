package org.LearnJava;

public class revString {
    String originalValue = "ReverseThisString";
    String reversedValue = "";

    public void reversing()
    {
     for(int i=originalValue.length()-1;i>=0;i--){
         reversedValue += originalValue.charAt(i);
     }
        System.out.println(reversedValue);
    }

    public String palindromeCheck()
    {
        if (originalValue.equals(reversedValue)) {
            return "It is a palindrome";
        } else {
            return "It is NOT a palindrome";
        }

    }
    public static void main(String[] args) {
        revString objectA = new revString();
        objectA.reversing();
        String result = objectA.palindromeCheck();
        System.out.println(result);
    }
}
