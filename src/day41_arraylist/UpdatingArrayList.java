package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args){
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1,"lada");
        myCars.add(2, "yugo");

        // jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla
        System.out.println(myCars);
        System.out.println(myCars.toString());// prints all cars
        String allCarsIn1st = myCars.toString();//saves all cars in 1 string variable

        System.out.println("allAcarsIn1st = " +allCarsIn1st);

        //change index 0 to Lamborghini
        myCars.set(0, "Lamborghini");
        System.out.println("after set = " + myCars.toString());

        //change index 4 to Honda
        myCars.set(4, "Honda");
        System.out.println("after set honda = " + myCars.toString());
        /**
         * How would you do that if myCars was array
         * myCars[4] = "Honda";
         */
        //find the index number of "ford"
        /**String str = "java";
        str.indexOf("v") ==> 2
         */
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichmyCars = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichmyCars);

        //chnage moskvich to jiguli
        myCars.set(moskvichmyCars, "jiguli");

        System.out.println("after set to jiguli = " + myCars);

        //replace ford with trebant using single statement
        // indexOf("ford"), "trabant"
        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set to trabant = " + myCars);

        //lada-> bugatti
        /*
        if myCars contains "lada"
        find index of lada and set value to bugatti
        else
        print "lada is not found"
         */
        if(myCars.contains("lada")) {
            myCars.set( myCars.indexOf("lada"), "bugatti");
        } else {
            System.out.println("lada is not found");
        }

        System.out.println("after set bugatti = " + myCars.toString());


        /**
         *lamborghini -> prius
         *          toyota -> lexus
         *          trabant -> audi
          */
        for(int i = 0; i < myCars.size(); i++){
            if(myCars.get(i).equals("lamborghini")){
                //change to prius
                myCars.set(i, "prius");
            }else if (myCars.get(i).equals("lada")){
                myCars.set(i,"lexus");
            }else if(myCars.get(i).equals("trabant")){
                myCars.set(i, "audi");
            }
        }
        System.out.println("after loop = " + myCars);


    }
}
