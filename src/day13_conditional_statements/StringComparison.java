package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")){
            System.out.println("It is LA");
        } else{
            System.out.println("It is not LA");
        }
        String weather = "sunny";
        if(weather.equals("sunny")){
//            if(weather == sunny), it works, not error, but avoid to using it.
            System.out.println("Lets go out and code java");
        } else{
            System.out.println("Lets stay indoors, and code java");
        }
    }
}
