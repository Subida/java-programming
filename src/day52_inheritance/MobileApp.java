package day52_inheritance;

public class MobileApp {
    String name;
    double version;

    protected void download(){
        System.out.println("App: " + name+ " version: " + version + " is downloaded");
    }

    public void useTheApp(int minutes){
        System.out.println("Using " + name + " app for " + minutes + " minutes");
    }
}
