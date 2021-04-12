package ls3_classStructure;


import java.util.Random;

public class KennywoodRideTracker {
    // Member variables
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;

    // final class member variables, minimum rider heights
    final static int MIN_THRILL_HT = 58;
    final static int MIN_THEME_HT = 40;

    public static void main(String[] args) {
        printRiderStats();

        rideBlackWidow(5, 60);
        printRiderStats();

        rideMerryGoRound(10,44);
        printRiderStats();

        rideBlackWidow(6, 55);
        printRiderStats();

        rideMerryGoRound(9, 37);
        printRiderStats();
    }

    public static void rideBlackWidow(int riders, int avgHeight) {
        if (avgHeight >= MIN_THRILL_HT) {
            System.out.println("Now riding: Black Widow");
            System.out.println();
            // add black widow riders to total var, and turned away riders
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
        } else {
            System.out.println();
            System.out.println("Riders that did not meet the ride height: " + riders);
            System.out.println();
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }
    }

    public static void rideMerryGoRound(int riders, int avgHeight) {
        if (avgHeight >= MIN_THEME_HT) {
            System.out.println("Now riding: Merry Go Round");
            System.out.println();
            // add merry go round riders to total var, and turned away riders
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
        } else {
            System.out.println();
            System.out.println("Riders that did not meet the ride height: " + riders);
            System.out.println();
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }
    }

    public static void printRiderStats() {
        System.out.println("-- RIDER STATS --");
        System.out.println("Total # Riders: " + totalRiders);
        System.out.println("Total # Failed Ride Attempts: " + totalFailedRideAttempts);
        System.out.println("Total # Sick Riders: " + totalSickRiders);
        System.out.println("-- END RIDER STATS --");
    }
}
