package day34_void_methods;

public class EtsySearchTest4 {
    public static void main(String[] args) {
        System.out.println("******* Starting Etsy Search Test *********");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("********** Etsy Search Test Completed ************");

    }

    public static void openBrowser() {

        System.out.println("Lunching Chrome Browser!");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("Navigating to https://www.etsy.com/ ");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("Pass : Etsy Home Page");
        System.out.println("Search For Wooden Spoon");
    }

    public static void verifyResultsAreDisplayed() {
        System.out.println("Perfect Search Process");

    }
}