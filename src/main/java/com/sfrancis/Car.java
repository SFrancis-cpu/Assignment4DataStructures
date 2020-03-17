package com.sfrancis;

import java.util.ArrayList;

public class Car {

    public static void main(String args[]){
        ArrayList<String> myCars =new ArrayList<String>();
        myCars.add("Mazda");
        myCars.add("Toyota");
        myCars.add("Lexus");
        myCars.add("Peugot");
        myCars.add("AntMobile");
        myCars.add("Jimmy");

        //displaying elements
        System.out.println(myCars);

        //Adding "Mazda" at the fourth position
        myCars.add(3, "Mazda");

        //displaying elements
        System.out.println(myCars);


    }
}


