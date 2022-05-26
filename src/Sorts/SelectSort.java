package Sorts;

public class SelectSort implements Sort{
    int tabSize;
    int[] tab;
    int compares;
    int swaps;
    public int getCompares() {return compares;}
    public int getSwaps() {
        return swaps;
    }

    public SelectSort(int[] tab) {
        this.tab = tab;
        tabSize =tab.length ;
        compares = 0;
        swaps = 0;
    }

    public int[] sortTabAscending() {
        int[] sortedTab = new int [tabSize];
        for(int i =0; i<sortedTab.length; i++){
            sortedTab[i] = tab [i];
        }
        int min;
        int temp1 = 0;
        int temp2 = 0;

        for (int j = 0; j < tabSize-1; j++) {
            min = sortedTab[j];
            for (int i = j; i < tabSize; i++) {
                compares++;
                if (sortedTab[i] < min) {
                    swaps++;
                    min = sortedTab[i];
                    temp2 = i;
                }
            }
            temp1 = sortedTab[j];
            sortedTab[j] = min;
            sortedTab[temp2] = temp1;
        }

        return sortedTab;
    }

    public int[] sortTabDescending() {
        int[] sortedTab = tab;
        int max = tab[0];
        int temp1 = 0;
        int temp2 = 0;

        for (int j = 0; j < tabSize; j++) {
            max = sortedTab[j];
            for (int i = j; i < tabSize; i++) {
                compares++;
                if (sortedTab[i] > max) {
                    swaps++;
                    max = sortedTab[i];
                    temp2 = i;
                }
            }
            temp1 = sortedTab[j];
            sortedTab[j] = max;
            sortedTab[temp2] = temp1;
        }

        return sortedTab;
    }

    public String getTitle (){
        return"Sortowanie przez wybór:";
    }
    public String getTime (){
        return"Czas wykonania algorytmu sortującego przez wybór:";
    }
    public void printStatistics (){
        System.out.println("Porównań: " + compares + " Zamian: " + swaps);
    }
    public String toString() {
        String toString = "";
        for (int i = 0; i < tabSize; i++) {
            toString += tab[i] + " ";
        }
        return toString;
    }
}
