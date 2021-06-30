package day52_inheritance.discordusers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Suleyman");
        user1.setRole("Student");
        //User > Admin
        Admin admin1 = new Admin();
        admin1.setId(43145);
        admin1.setName("Burak Kara");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2 = new Admin("Gullia", 4138);
        System.out.println(admin2.toString());
    }
}
