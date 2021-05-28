package day14_multi_branch_if_statment;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println(" Are you sure you want to delete this filer?" );
     char selection = 'y';
     boolean answer;
        if(selection== 'y'){
            System.out.println( "your file will be deleted");
            answer = true;
             }else {
            System.out.println("file deletion cancelled");
            answer = false;
        }
            System.out.println("Did file get deleted? " + answer);
    }
}
