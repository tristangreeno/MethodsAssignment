import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Tracks the first date that the user visited the website, and then the last date.
 */
public class WebsiteDates {
    private String[] firstMonth = new String[5];
    private int[] firstDay = new int[5];
    private int i = 0;
    private int j = 0;
    private Scanner scanner = new Scanner(new File("/Users/tristangreeno/WorkSpace/txtFiles/methods.txt"));

    public WebsiteDates() throws FileNotFoundException {
    }

    public String[] getFirstMonth() {
        return firstMonth;
    }

    public int[] getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(int[] days){
        while(scanner.hasNextLine()) {
                this.firstDay[j] = days[j];
        }
    }

    public void setFirstMonth(String[] firstMonth){
        while(scanner.hasNextLine()) {
            if (noNums(firstMonth, i))
                this.firstMonth[i++] = firstMonth[i];
        }
    }

    private final String[] lastMonth = new String[5];
    private final int[] lastDay = new int[5];

    private boolean noNums(String[] firstMonth, int line){
        return firstMonth[line].contains(" ");
    }


}
