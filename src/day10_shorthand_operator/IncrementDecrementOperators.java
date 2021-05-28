package day10_shorthand_operator;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;//1
        System.out.println("i = " + i);
       
        //i = i + 1;
        // i += 1;
       
        i ++;//1
        System.out.println("i = " + i);
        i++;//1
        i++;//1
        ++i;//1
        ++i;//1
        System.out.println("i = " + i + "\n");
        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        // 4 ways increase 1  
        linesOfCode = linesOfCode + 1;
        linesOfCode += 1;
        linesOfCode++;
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode + "\n");
        // 4 ways decrease 1
        // linesOfCode = 19
        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        linesOfCode--;
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode + "\n");
        char letter = 'a';
        System.out.println("letter = " + letter+ "\n");
        letter++;
        System.out.println("letter = " + letter+"\n");
        ++letter;
        letter++;
        System.out.println("letter = " + letter+"\n");
        letter--;
        System.out.println("letter = " + letter+"\n");
        --letter;letter--;--letter;
        System.out.println("letter = " + letter+"\n");
        ++letter;letter++;++letter;++letter;
        System.out.println("letter = " + letter+"\n");
        
        
       
    }
}
