package Sorts;

public interface Sort {
    public long getCompares() ;
    public long getSwaps();
    public int [] sortTabAscending();
    public int [] sortTabDescending();
    public String toString();
    public String getTitle();
    public String getTime();
    public void printStatistics();



}
