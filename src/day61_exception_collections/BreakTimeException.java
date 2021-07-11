package day61_exception_collections;

public class BreakTimeException extends RuntimeException{

   public BreakTimeException(){

   }
   public BreakTimeException(String message) {
       super(message);// call to parent class
   }



}
