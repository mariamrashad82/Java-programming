package day59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);

       WebElement username = new InputField();
       username.sendKeys("Wooden spoon");
       username.click();

       WebElementUtil.clickElement(loginLink);
       WebElementUtil.clickElement(username);
      //  WebElementUtil.clickElement("hello");string is not child

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();


    }
}
