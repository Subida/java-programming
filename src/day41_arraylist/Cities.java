package day41_arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
//declare arraylist. alt/option+ enter
        ArrayList<String> cities =new ArrayList<>();
        //add cities to arraylist ->add methods
        cities.add("Washington DC");//index 0
        cities.add("New York");///index 1
        cities.add("Vienna");// index 2
        cities.add("Adana");// index 3
        cities.add("LA");// index 4
        //add Ashgabat to first index
        cities.add(0, "Ashgabat");
        //print all values in same line
        System.out.println(cities);
        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        //find last index using size() -1;
        System.out.println("last city = " + cities.get(cities.size()-1));
        //print count of items in arraylist
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size + "cities in the list");

        //for loop and print all values in same line
        for(int i = 0; i < cities.size(); i++){
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();
        //for each loop
        for(String city : cities){
            System.out.print(city + " ");
        }
        System.out.println();
// delete item from arraylist
        //1) remove using index, delete value at index of 3
        cities.remove(3);
        //2) remove using objet/value
        cities.remove("New York");

        System.out.println("After remove = " + cities);

        // delete /remove all values from list
        cities.clear();
        // make sure it is clear
        //1) print/spit it out
        System.out.println("cities = " + cities);

        //2)using isEmpty
        if(cities.isEmpty()){
            System.out.println("list is empty");
        }

        //3) check size() ==0
        if(cities.size() == 0){
            System.out.println("list is empty");
        }
    }
}
