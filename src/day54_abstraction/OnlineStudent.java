package day54_abstraction;

public class OnlineStudent extends Student{

    @Override
    public void attendClass(){
        System.out.println("Online student is attending class using Zoom");
    }
    //public abstract void askQUESTION(); error- abstract method can not be in normal class

}
