import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Work in progress. Need to fix problems with Static.
 * Meant to scan any file needed within the classes to avoid repetitive code and save time.
 */
public class ReadFile {

    private static int i = 0;
    public static int[] avgSite;
    public static String[] siteNames;

    public final static int[] READNUMS(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt() && i < fileName.length() && scanner.nextInt() > 0) avgSite[i++] = scanner.nextInt();
        i = 0;
        return avgSite;
    }

    public final static String[] READNAMES(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine() && i < fileName.length() && !(siteNames[i].contains(" "))) {
            siteNames[i++] = scanner.nextLine();

        }
        return siteNames;
    }
}
