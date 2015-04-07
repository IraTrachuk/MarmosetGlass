package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Created by Ira on 07.04.2015.
 */
public class Lists {
    public static void main(String[] args) {
        List<String> s = new ArrayList<String>();
        List<String> f = new ArrayList<String>();

        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");

        //print(s);

        f.add("a");
        f.add("b");
        f.add("c");
        f.add("d");
        f.add("e");

        System.out.println(isListsEqual(s,f));

        String[] a = {"a", "b", "c", "d"};
        print(a);

        System.out.println(isEqual(a,s));


    }

    public static void print(List<String> l){
        for(String str:l)
            System.out.println(str);
    }

    public static boolean isListsEqual(List<String> a, List<String> b) {
        if (a.equals(b))
                return true;
        else
            return false;
    }

    public static void print(String[] a){
        for (String s:a)
            System.out.println(s);
    }

    public static boolean isEqual(String[] c, List<String> d) {
        List<String> str = Arrays.asList(c);

        if (str.equals(d))
            return true;
        else
            return false;
    }
}
