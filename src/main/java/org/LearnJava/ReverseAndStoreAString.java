package org.LearnJava;

class ReverseAndStoreAString {
    public static void main(String[] args) {
        String name = "Tiger";
        String revName = "";
        for (int i=name.length()-1;i>=0;i--) // name.length() = Tiger is 5 = java indexing starts from 0
            //So it is name.length() - 1 = 4 // indexing T-0; i-1; g-2; e-3; r-4
        {
             revName += name.charAt(i);
        }
        System.out.println(revName);
    }
}
