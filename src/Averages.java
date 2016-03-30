import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * These are the world averages for frequency of visiting the sites.
 */
public class Averages {

    public Averages(int number) throws FileNotFoundException {
        if(isValidNum(numLines)) {
            this.numLines = number;
        }
        else {
            System.out.println("Warning: Please enter a valid number of lines");
        }
    }

    public int numLines;

    //ReadFile.


    private File file = new File("/Users/tristangreeno/WorkSpace/txtFiles/methods.txt");
    private Scanner scanner = new Scanner(file);
    private int i = 0;

    // Need explanation of exception handling


    public int[] getAvgSite() {
        return avgSite;
    }

    public void setAvgSite(int[] avgSite) {
        while(scanner.hasNextInt() && i < numLines && scanner.nextInt() > 0){
            avgSite[i++] = scanner.nextInt();
        }
        this.avgSite = avgSite;
    }

    public int[] avgSite = new int[5];


    private boolean isValidNum(int num){
        return num > 0 && num < 26;
    }

}
