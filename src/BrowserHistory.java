import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Tracks the names of the sites entered to the data, and uses the seconds spent on the site, as well as the number of
 * of times visited (frequency).
 */
public class BrowserHistory {

    private Scanner scanner = new Scanner(new File("/Users/tristangreeno/WorkSpace/txtFiles/methods.txt"));

    public BrowserHistory() throws FileNotFoundException {
    }

    public String[] getSiteName() {
        return siteName;
    }

    public void setSiteName(String[] siteName) {
        int i = 0;
        while(scanner.hasNextLine()) {
            this.siteName[i++] = siteName[i];
        }
    }



    public String[] siteName = new String[5];

    public int[] getSeconds() {
        return seconds;
    }

    public void setSeconds(int[] seconds) {
        int i = 0;
        while(scanner.hasNextInt()) {
            this.seconds[i++] = seconds[i];
        }
    }

    public int[] seconds = new int[5];

    public int[] getFrequency() {
        return frequency;
    }

    public void setFrequency(int[] frequency) {
        int i = 0;
        while(scanner.hasNextInt()) {
            this.frequency[i] = frequency[i];
        }
    }

    public int[] frequency = new int[5];
}
