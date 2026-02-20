import java.util.ArrayList;

public class Main { //test test test
    public static void main(String[] args) {
        // Opret forskelligt repertoire til hvert band
        ArrayList<Song> songs1 = new ArrayList<>();
        songs1.add(new Song("Midnight moon"));
        songs1.add(new Song("Imagine"));
        songs1.add(new Song("Nightmare"));

        ArrayList<Song> songs2 = new ArrayList<>();
        songs2.add(new Song("Neon Lights"));
        songs2.add(new Song("Pulse Wave"));
        songs2.add(new Song("Synth Dreams"));

        // Opret to bands med forskellige startstats og repertoire
        System.out.println("                       * * * * START PROFILES * * * *");
        Band band1 = new Band("The Static Waves", 'R', 8500, 15000, 2, 3200, 4750.50, songs1);
        Band band2 = new Band("Neon Pulse", 'E', 6000, 12000, 1, 1000, 3000.0, songs2);

        // Print startprofiler
        band1.printProfile();
        band2.printProfile();

        // Simuler koncerter
        System.out.println("\n* * * * * * * *  CONCERTS * * * * * * * *");
        band1.playGig(500, 420);
        band2.playGig(500, 480);

        // Tilføj XP og levelUp
        System.out.println("\n* * * * * * * XP & LEVEL UP * * * * * * *");
        band1.addXP(2000);
        band1.levelUp();

        band2.addXP(1500);
        band2.levelUp();

        // Random events
        System.out.println("\n* * * * * * * RANDOM EVENTS * * * * * * *");
        band1.randomEvent();
        band2.randomEvent();

        // Endelige profiler
        System.out.println("\n                       * * * * * * * FINAL PROFILES * * * * * * *");
        band1.printProfile();
        band2.printProfile();

        // Sammenlign fans
        System.out.println("\n                       * * * * * * * FAN SHOWDOWN * * * * * * *");
        if (band1.fans > band2.fans) {
            System.out.println(band1.bandName + " has more fans!");
        }else if (band2.fans > band1.fans) {
            System.out.println(band2.bandName + " has more fans!");
        } else {
            System.out.println("Both bands have the same number of fans!");
        }
    }
}
