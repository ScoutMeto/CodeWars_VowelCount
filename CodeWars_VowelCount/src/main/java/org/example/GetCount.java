package org.example;

public class GetCount {

    public static int getCount(String str) {

        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }
}
