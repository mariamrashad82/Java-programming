package officeHours;

public class favoriteMovie {
    public static void main(String[] args) {
        String welcome = "**** WELCOME TO THE CINEMA ****";
        String movieName = "SING";
        String genre = "Computer_animated";
        double duration = 110;
        String releaseDate = "25/05/2021";
        char charRating = 'R';
        boolean isASequels = false;
        boolean isOnDvd = true;
        String rating = "%96";
        System.out.println(   welcome + "\n\n"+ "Tonight we are streaming :\t\t\t\t"+"\"" + movieName +"\""+
                "\n"+ "This genre movie is:\t\t\t\t\t"+ genre+"\n"+ "It runs for:\t\t\t\t\t\t\t"+ duration + " minutes"+"\n"+
                "Which was released on:\t\t\t\t\t"+ releaseDate+ "\n"+ "Rating on Rotten Tomatoes:\t\t\t\t"+ rating +"\n"
        +"The rating is:\t\t\t\t\t\t\t" +charRating+"\n"+"SING movie is a sequels:\t\t\t\t"+isASequels+"\n" +"SING movie is DVD:\t\t\t\t\t\t"+ isOnDvd );


    }
}
