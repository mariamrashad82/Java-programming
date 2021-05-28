package day20_string_mainpulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jonTitle = "";
        System.out.println(jonTitle.isEmpty());
        System.out.println(jonTitle.length());
        System.out.println(jonTitle.length()==0);

        if(jonTitle.isEmpty()){
            System.out.println("job title is missing, please resend");
        }else {
            System.out.println("job title looks good");
        }

            if(jonTitle.length()==0){;
            System.out.println("job title is empty");
        }else {
        System.out.println("job title is not empty");
        }

        System.out.println(jonTitle.equals(""));
            if("" . equals(jonTitle)){
                System.out.println("job title is  empty");
            }else{
                System.out.println("job title is not empty");
            }
            String word = " ";// space means 1  character so its not empty
        System.out.println(word.isEmpty());// false
        System.out.println(word.length()); // 1


        String veggie = "carrot";
        System.out.println(veggie.isEmpty());// false
        if(! veggie.isEmpty()){
            System.out.println("we have " + veggie);
        }
        String word2;
       // System.out.println(word2.isEmpty());// is wrong no value



    }

}
