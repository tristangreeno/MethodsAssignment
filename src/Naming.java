import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Reveals the names of each site visited, and the date that each was created.
 */
public class Naming {
    public String[] nameSite;
    public int[] dateSite = new int[]{2010, 2008, 2004, 2002, 2011};
    private int i = 0;

    public void setNameSite(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine() && i < fileName.length()) {
            nameSite[i++] = scanner.nextLine();
        }
    }

    public String[] getNameSite(){
        return nameSite;
    }
}
