package MariamMethods;

public class recursiveMethod_Ro {
    public static void main(String[] args) {
        printNums(1);
    }
        public static void printNums(int num) {
            System.out.println(num+ " ,");

            if(num<100){
                num++;
                printNums(num);

            }

        }
    }

