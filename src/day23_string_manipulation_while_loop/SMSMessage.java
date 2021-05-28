package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        // first way

        //String message = "Sender: [Nadir] From Number<2223334444> Message:{Hello, let's code some Java}";
        //String sender = message.substring(message.indexOf("N"), message.indexOf("]"));
        //String text = message.substring(message.indexOf("H"), message.indexOf("}"));

        //System.out.println(sender);
        //System.out.println(text);

        //second way

        //String message = "Sender : [Nadir] From Number <2223334455> Message :{Hello,lets code some java}";

        //String sender = message.substring(message.indexOf("[")+1, message.indexOf("]"));
        //String phoneNumber = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        //String messageBody =  message.substring(message.indexOf("{")+1, message.indexOf("}"));

        //System.out.println("sender = " + sender);
        //System.out.println("phoneNumber = " + phoneNumber);
       // System.out.println("messageBody = " + messageBody);



        //third way
        String message = "Sender : [Nadir] From Number <2223334455> Message :{Hello,lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start +1,end));
        String sender = message.substring(start +1,end);
        System.out.println("sender = " + sender);
        String mobil = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobil = " + mobil);
        String text = message.substring(message.indexOf("H"),message.indexOf("}"));
        System.out.println("text = " + text);
        System.out.println(" Fikret ".trim());
        sender = sender.trim();
        if(sender.equals("Nadir")) {
            System.out.println("Message from Nadir about quiz");
        }else {
            System.out.println("Someone else message");


        }
        // trim() remove all spaces from right and left only
        String word = "  java  ";
        System.out.println(word.trim());
        String word2 = " j a v a ";
        System.out.println(word2.trim());
        //only replace use to remove space from inside
        System.out.println(word2.replace(" ",""));


    }

}
