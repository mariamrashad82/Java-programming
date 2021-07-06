package day59_polymorphism_exceptions;

public class WebElementUtil {


    public static void clickElement(WebElement element){
        System.out.println(" Clicking on Element ");
        element.click();
    }
    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link with txt = " + txt);
        return new Link();
    }

}
