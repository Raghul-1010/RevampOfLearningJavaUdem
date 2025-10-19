package org.LearnJava;

import javax.xml.namespace.QName;

public class StringLearnSB {
    StringBuilder name = new StringBuilder("String Builder");
    String original = "NormalStringLiteral";
    public static void main(String[] args) {
        StringLearnSB obj = new StringLearnSB();
        System.out.println(obj.name);
        (obj.name).append('s');
        System.out.println(obj.name);

    }
}
