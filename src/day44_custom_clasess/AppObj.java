package day44_custom_clasess;
//this class to creat object from app class
public class AppObj {
    public static void main(String[] args) {
        App phone = new App();
      phone.name="Telegram ";
      phone.version=17.60;
      phone.open();

        App phoneV2 = new App();
        phoneV2.type ="I Phone";
        phoneV2.color = "Siliver";
        phoneV2.Giga = 256;
        phoneV2.model();



    }

}
