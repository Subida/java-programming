package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("Nadir", "Fanniema");
        buildEmail("John Ward III", "verizon");
    }

    public static void buildEmail(String name, String domain){
        name = name.replace(" ", "_").toLowerCase();
        String email = name + "@" + domain + ".com";
        System.out.println(email);

    }
}
