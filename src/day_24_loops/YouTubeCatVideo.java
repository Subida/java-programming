package day_24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat \uD83D\uDC08- BBC");
        int seconds = 0;
        while (seconds <= 117) {
            System.out.println("watching \uD83D\uDC08 at second: " + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching \uD83D\uDC08 video");
        System.out.println("lets start another one");
    }
}