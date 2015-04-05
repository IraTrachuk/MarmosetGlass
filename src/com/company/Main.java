package com.company;

public class Main {

    public static void main(String[] args) {

        int v;

        Glass s = new Glass("Super");
        Glass k = new Glass("Bigger");

        /*
        System.out.println("s: " + s.name);
        System.out.println("k: " + k.name);
        System.out.println("Glass material: " + s.material);
        System.out.println("Glass height: " + k.height);
        System.out.println("Glass filling: " + s.filling);
        */

        s.fillGlass(30);
        //System.out.println("Glass s filling: " + s.filling);

        v = s.emptyGlass();
        //System.out.println("v: " + v);
        //System.out.println("Glass k filling: " + k.filling);

        k.fillGlass(v);
        //System.out.println("Glass s filling: " + s.filling);
        //System.out.println("Glass k filling: " + k.filling);

        s.fillGlass(k.emptyGlass());
        //System.out.println("Glass s filling: " + s.filling);
        //System.out.println("Glass k filling: " + k.filling);

        s.fillGlass(50);
        //System.out.println("Glass s filling: " + s.filling);

        s.fillGlass(45);
        //System.out.println("Glass s filling: " + s.filling);

        s.name = "ReSuper";
        //System.out.println("s: " + s.name);
        //System.out.println("k: " + k.name);

        System.out.println("Volume of glass with height 20: " + s.volume(20));

    }
}
