import java.io.FileNotFoundException;
import java.util.Random;

/** The purpose of these classes is to assimilate data concerning the browsing history of a
 * single user into useful information.
 * Main uses the classes as part of its method.
 * Main uses for loops and if/else to organize the data into arrays, arranging the browsing frequency from most visited
 * to least visited. Frequency and seconds are randomized using Math.nextInt().
 */

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Random randnum = new Random();
        BrowserHistory browserHistory = new BrowserHistory();
        Naming naming = new Naming();
        Tracking tracking = new Tracking();
        Averages averages = null;
        int[] avgSite = new int[5];

        // Need help on try/catch
        try {
            averages = new Averages(5);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        tracking.leastFreqNum = 0;
        tracking.mostFreqNum = 0;

        for(int i = 0; i < 5; ++i){
            browserHistory.siteName[i] = "Site " + (i + 1);
            browserHistory.seconds[i] = randnum.nextInt(99);
            browserHistory.frequency[i] = randnum.nextInt(99);

            if (browserHistory.frequency[i] < tracking.leastFreqNum){
                tracking.leastFreqNum = browserHistory.frequency[i];
                tracking.mostFreqSite = browserHistory.siteName[i];
            }

            else if (browserHistory.frequency[i] > tracking.mostFreqNum){
                tracking.mostFreqNum = browserHistory.frequency[i];
                tracking.mostFreqSite = browserHistory.siteName[i];
            }
        }

        for(int i = 0; i < 5; ++i){
            System.out.println("Site " + (i + 1) + " is " + naming.nameSite[i] + ", visited for " +
                    browserHistory.seconds[i] + " seconds, and " + browserHistory.frequency[i] + " times.");
            System.out.println("The world average for this site is: " + averages.avgSite[i] + ".");
        }

        System.out.println("The most visited site for the user is: " + tracking.mostFreqSite + ".");
    }
}

