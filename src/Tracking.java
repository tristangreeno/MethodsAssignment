/**
 * Used for tracking the most frequently visited site, and the least frequently visited site.
 * The least frequent number and most number store the frequency for the for loop.
 */
public class Tracking {
    public String getMostFreqSite() {
        return mostFreqSite;
    }

    public void setMostFreqSite(String mostFreqSite) {
        this.mostFreqSite = mostFreqSite;
    }

    public String mostFreqSite;

    public String getLeastFreqSite() {
        return leastFreqSite;
    }

    public void setLeastFreqSite(String leastFreqSite) {
        this.leastFreqSite = leastFreqSite;
    }

    public String leastFreqSite;

    public int getLeastFreqNum() {
        return leastFreqNum;
    }

    public void setLeastFreqNum(int leastFreqNum) {
        this.leastFreqNum = leastFreqNum;
    }

    public int leastFreqNum;

    public int getMostFreqNum() {
        return mostFreqNum;
    }

    public void setMostFreqNum(int mostFreqNum) {
        this.mostFreqNum = mostFreqNum;
    }

    public int mostFreqNum;
}
