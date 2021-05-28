package day37_methods_overloading;

public class MethodPractice2 {
    public static void main(String[] args) {
        //add new class MethodPractice
        //
        //add new method:
        //    repeatString
        //
        //params:
        //    String word, int times, char delimiter
        //
        //it builds the string and returns
        //
        //repeatString("java", 3, '|');
        //    => "java|java|java"
        //
        //repeatString("hi", 5, '~');
        //    => "hi~hi~hi~hi~hi"
        //You do not have permission to send messages in this channel.

                System.out.println(repeatString("hi", 3, '|'));
                System.out.println(repeatString("I can do it!", 10, '-'));
            }

            public static String repeatString(String word, int times, char delimiter) {
                String retValue = "";
                for(int i = 1; i <= times; i++) {
                    //take care of last delimiter:
                    if(i == times) { //if last iteration
                        retValue += word; //add only word by itself
                    } else {
                        retValue += word + delimiter; //add with delimiter
                    }
                }
                return retValue;
            }
        }





