package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        Count(5);
        Count(8);
        int num2 = 999;
        Count(num2);
        String word = "wooden spoon";
        Count(word.length());
        printAge(1984);
        printAge(1988);
        int birthYear = 2001;
        printAge(birthYear);

    }

    public static void Count(int num){
        for(int i = 0; i <= num; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAge(int year){
        int age = 2021 - year;
        System.out.println("Birth year: " + year +". Age: " +age);

    }
}
