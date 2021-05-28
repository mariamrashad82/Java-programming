package day24_loops;

public class youTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat 🐈- BBC");
        int seconds = 0;
        while(seconds>=117) {
            System.out.println(" Watching cat 🐈- BBC YouTube video: at second: " + seconds++);
            Thread.sleep(1000);
        }
        System.out.println("Finished Watching cat 🐈- BBC YouTube video ");
        System.out.println("Lets start another one !");

    }
    }

