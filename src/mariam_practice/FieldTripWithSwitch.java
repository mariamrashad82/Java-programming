package mariam_practice;

public class FieldTripWithSwitch {
    public static void main(String[] args) {
        int grade =1;
        switch (grade){
            case 1:
                System.out.println("Location - Apple orchard" + "\n" + "Group Number - 3" + "\n"+ "Teacher - Ms.Smith");
                break;
            case 2:
                System.out.println("location - Zoo\n" + "number of groups - 7\n" +"teacher in charge - Mr. Lee");
             break;
            case 3:
                System.out.println("location - Aquarium\n" +" number of groups - 5\n" +" teacher in charge - Ms. Wilson\n");
            break;
            case 4:
                System.out.println("location - Movie theater  \n" + "number of groups - 2\n" + " teacher in charge - Ms. Reyes\n");
            break;
            case 5:
                System.out.println("location - Museum \n" +"number of groups - 5\n" +"teacher in charge - Ms. Lela \n");
            break;
            case 6:
                System.out.println("location - Six Flags\n" +"number of groups - 8\n" +"teacher in charge - Mr. Watt\n");
            break;
            default:
                System.out.println("Invalid Grade");
            break;








        }
    }
}
