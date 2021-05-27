package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java";//create in String pool
        String word2 = "java";//reuse from string pool
        String word3 = new String("java");//create in heap, outside string pool
        String word4 = new String("java");//create new object in heap, outside string pool

        System.out.println(word1 == word2);//true - point to same object in pool
        System.out.println(word1 == word3);//false- point to different object in heap and pool
        System.out.println(word3 == word4);//false-> point to different objects in heap

        System.out.println((word1.equals(word2)));//true- comparing values
        System.out.println(word1.equals(word3));//true- comparing values
        System.out.println(word3.equals(word4));//true- comparing values
    }
}
