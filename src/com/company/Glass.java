package com.company;

/**
 * Created by Ira on 05.04.2015.
 */
public class Glass {

    public String name;
    public String material;
    public int height;
    public int filling;

    public Glass(String s){
        name = s;
        material = "paper";
        height = 10;
        filling = 0;
    }

    public int fillGlass(int f){
        filling = filling + f;
        if(filling > 100) {
            System.out.println("Too much for glass " + name + ".");
            filling = 100;
        }
        return filling; //which variable to return in this case: f or filling?
    }

    public int emptyGlass(){
        int filling_past = filling;
        filling = 0;
        return filling_past;
    }

    public int volume(int v){
        int volume = 20*v;
        return volume;
    }
}
