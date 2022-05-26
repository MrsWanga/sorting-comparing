package Sorts;

public interface Sort {
    public int getCompares() ;
    public int getSwaps();
    public int [] sortTabAscending();
    public int [] sortTabDescending();
    public String toString();
    public String getTitle();
    public String getTime();
    public void printStatistics();



}
