package day35_methods_with_param;

public class Email25 {
    public static void main(String[] args) {

                buildEmail("Nadir","FannieMae");
                buildEmail("John Ward III", "verizon");
            }

            public static void buildEmail(String name, String domain) {
                name = name.replace(" ","_").toLowerCase();
                domain = domain.toLowerCase();
                String email = name + "@" + domain + ".com";
                System.out.println(email);
            }
        }


