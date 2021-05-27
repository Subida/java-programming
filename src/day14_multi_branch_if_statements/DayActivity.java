package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "warm";
        if (weather.equals("sunny")){
            System.out.println(weather+" - go to park, hiking, and code java");
        } else if (weather.equals("rainy")){
            System.out.println(weather+" - stay home, drink tea, and code java");
        } else if (weather.equals("snowy")){
            System.out.println(weather + " - clean the car and build snowman");
        } else if(weather.equals("windy")){
            System.out.println(weather + " - get ready for the power loss, fly a kite");
        } else{
            System.out.println("keep coding java");
        }
    }
}
