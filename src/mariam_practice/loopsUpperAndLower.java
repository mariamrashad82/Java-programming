package mariam_practice;

public class loopsUpperAndLower {
    public static void main(String[] args) {

        String str = "2jMp41GHFR4sdfg";
        int upper = 0;
        int lower = 0;
        int num = 0;
        for(int i = 0 ; i < str.length() ; i ++){
            char eachLetter = str.charAt(i);

            if(eachLetter >= 'A' && eachLetter <= 'Z'){
                upper++;
            }else if(eachLetter >= 'a' && eachLetter <= 'z' ){
                lower++;
            }else if(eachLetter >=  '0' && eachLetter <= '9'){
              num++;
            }

        }
        System.out.println("upper case :" + upper);
        System.out.println("lawer case :" + lower);
        System.out.println("number : " + num);

    }
    }
