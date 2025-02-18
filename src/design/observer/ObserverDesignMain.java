package design.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObserverDesignMain {
    public static void main(String[] args) throws IOException {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        System.out.println("Uploding new video 1...");
        youtubeChannel.notifyChanges("Diana & Roma");
        Subscriber alok = new Subscriber("Alok");
        youtubeChannel.subscribe(alok);
        Subscriber adrika = new Subscriber("Adrika");
        youtubeChannel.subscribe(adrika);
        System.out.println("Uploding new video 2...");
        youtubeChannel.notifyChanges("Ashu's World");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("Press 1 for upload new video");
            System.out.println("Press 2 to subscribe channel");
            System.out.println("Press 3 to unsubscribe channel");
            System.out.println("Press 4 to exit");
            int input = Integer.parseInt(bufferedReader.readLine());
            switch (input) {
                case 1:
                    System.out.println("Upload video");
                    youtubeChannel.notifyChanges(bufferedReader.readLine());
                    break;
                case 2:
                    System.out.println("Subscribe channael");
                    youtubeChannel.subscribe(new Subscriber(bufferedReader.readLine()));
                    break;
                case 3:
                    System.out.println("Unsubscribe channael");
                    youtubeChannel.unsubscribe(new Subscriber(bufferedReader.readLine()));
                    break;
                default:
                    System.exit(0);
            }
        }

    }
}
