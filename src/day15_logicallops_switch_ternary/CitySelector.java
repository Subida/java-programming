package day15_logicallops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "Saim";
        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is a java class with " + teacher);
        } else{
            System.out.println("Soft skill class with " + teacher);
        }

        teacher = "Murodil";
        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("java class with " + teacher);
        } else if (teacher.equals("Nadir")){
            System.out.println("soft skill class with "+ teacher);
        } else {
            System.out.println("Some other class with "+ teacher);
        }

//        company - "Google", "salary >= 100k
        String company = "NadirTech";
        double salary = 105_000.0;
         if (company.equals("Google") || salary >= 100_000){
             System.out.println("Accepting offer from " + company);
         } else {
             System.out.println("Rejecting offer from " + company);
         }
    }
}
