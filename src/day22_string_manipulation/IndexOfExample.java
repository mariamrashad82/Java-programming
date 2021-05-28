package day22_string_manipulation;

public class IndexOfExample{
    public static void main(String[] args) {
        String Technology = "java, html, css, selenium, testng, maven, cucumber";
       // first comma
        System.out.println(Technology.indexOf(","));//4
        // second comma
        System.out.println(Technology.lastIndexOf(","));//40
// for middle one , we need to loop
        
        int indexOfJava = Technology.indexOf("java");
        System.out.println("indexOfJava = " + indexOfJava);
        
        int idxOfCss = Technology.indexOf("css");
        System.out.println("idxOfCss = " + idxOfCss);
        
        int indexOfCucumber = Technology.indexOf("cucumber");
        System.out.println("indexOfCucumber = " + indexOfCucumber);
        
        int indexOfSql = Technology.indexOf("Sql");
        System.out.println("indexOfSql = " + indexOfSql);


        if(Technology.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
        if(Technology.indexOf("maven") != -1){
            System.out.println("maven  , is present");
        }else {
            System.out.println("maven  , is not present");
        }


            }
        }




