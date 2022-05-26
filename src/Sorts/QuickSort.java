package Sorts;

public class QuickSort implements Sort{
    int tabSize;
    int[] tab;
    int compares;
    int swaps;
    public int getCompares() {return compares;}
    public int getSwaps() {
        return swaps;
    }

    public QuickSort(int[] tab) {
        this.tab = tab;
        tabSize =tab.length ;
        compares = 0;
        swaps = 0;
    }

    public int[] sortTabAscending() {
        swaps = 0;
        compares = 0;
        quicksortUp(0, tabSize - 1);
        return tab;
    }
    public int[] sortTabDescending() {
        swaps = 0;
        compares = 0;
        quicksortDown(0, tabSize - 1);
        return tab;
    }

    private void quicksortUp(int low, int high) {
        int i = low, j = high;
        // Ustawienie pivota na środku
        int pivot = tab[low + (high - low) / 2];

        while (i <= j) {
            // Jeżeli wartość na lewo jest mniejsza od pivota, idź dalej
            while (tab[i] < pivot) {
                compares++;
                i++;
            }
            // Jeżeli wartość na prawo jest większa od pivota, idź dalej
            while (tab[j] > pivot) {
                compares++;
                j--;
            }
            //Jeżeli wartość na prawo jest mniejsza od pivota, lub wartość na lewo jest większa od pivota, to zamień
            if (i <= j) {
                compares++;
                swaps++;
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksortUp(low, j);
        if (i < high)
            quicksortUp(i, high);
    }

    private void quicksortDown(int low, int high) {
        int i = low, j = high;
        // Ustawienie pivota na środku
        int pivot = tab[low + (high - low) / 2];

        while (i <= j) {
            // Jeżeli wartość na lewo jest większa od pivota, idź dalej
            while (tab[i] > pivot) {
                compares++;
                i++;
            }
            // Jeżeli wartość na prawo jest mniejsza od pivota, idź dalej
            while (tab[j] < pivot) {
                compares++;
                j--;
            }
            //Jeżeli wartość na prawo jest większa od pivota, lub wartość na lewo jest mniejsza od pivota, to zamień
            if (i <= j) {
                compares++;
                swaps++;
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksortDown(low, j);
        if (i < high)
            quicksortDown(i, high);
    }

    private void exchange(int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
    public String getTitle (){
        return"Sortowanie szybkie:";
    }
    public String getTime (){
        return"Czas wykonania algorytmu sortowania szybkiego:";
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
