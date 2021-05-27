package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("---Starting ETSY Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        v();
        System.out.println("----Etsy Search Smoke Test completed - Pass -");
    }

    public static void openBrowser(){
        System.out.println("Launching Chrome browser");
    }

    public static void navigateToEtsyUrl(){
        System.out.println("Navigating to https://www.etsy.com/");
    }

    public static void searchForWoodenSpoon(){
        System.out.println("Pass: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search" );
    }

    public static void v(){
        System.out.println("Pass: Search results are successfully display");
    }
}
