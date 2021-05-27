package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));// ture
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o")); //true
        System.out.println(company.contains("j")); //false

        //if company contains space, print "company name with multiple words"
        //else "single word company name
        if(company.contains(" ")){
            System.out.println("multiple words company name");
        } else{
            System.out.println("single word company name");
        }

        String etsyTitle= "Wooden Spoon | Etsy";
        //check if " | " is in etsyTitle
        if(etsyTitle.contains(" | ")){
            System.out.println("pass- title check passed");
        } else{
            System.out.println("Fail- title check failed");
        }

        String firstName = "Ahmed";
        //check if firstName contains "a" and "e" at same time.
        if(firstName.contains("a")&& firstName.contains("e")){
            System.out.println("both a && e are present");
        } else{
            System.out.println("a || e not present");
        }

        String email = "subidareyimujiang@gmail.com";
        //check if email contains "@" and ends with ".com
        if(email.contains("@")&& email.endsWith(".com")){
            System.out.println("valid email");
        }else{
            System.out.println("invalid email");
        }

        //case insensitive contains
        if(email.toLowerCase().contains("d")){
            System.out.println("d is present");
        }
    }
}
