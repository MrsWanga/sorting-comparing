package Sorts;
// Pierwszy element pozostaje na swoim miejscu.
// Następnie bierzemy drugi i sprawdzamy, w jakiej relacji jest on z pierwszym.
// Jeśli jest niemniejszy, to zostaje na drugim miejscu, w przeciwnym wypadku wędruje na pierwsze miejsce.
// Dalej sprawdzamy trzeci element (porównujemy go do dwóch pierwszych i wstawiamy w odpowiednie miejsce),
// czwarty (porównujemy z trzema pierwszymi), piąty itd.
public class InsertSort implements Sort{
    int tabSize;
    int[] tab;
    int compares;
    int swaps;
    public int getCompares() {return compares;}
    public int getSwaps() {
        return swaps;
    }

    public InsertSort(int[] tab) {
        this.tab = tab;
        tabSize =tab.length ;
        compares = 0;
        swaps = 0;
    }

    public int[] sortTabAscending() {
        int value, j;
        for (int i = 1; i < tab.length; i++) {
            j = i;
            value = tab[i];
            compares++;
            while (j > 0 && tab[j - 1] > value) {
                tab[j] = tab[j - 1];
                j--;
                compares++;
                swaps++;
            }
            tab[j] = value;
        }
        return tab;
    }

    public int[] sortTabDescending() {
        int value, j;
        for (int i = 1; i < tab.length; i++) {
            j = i;
            value = tab[i];
            compares++;
            while (j > 0 && tab[j - 1] < value) {
                tab[j] = tab[j - 1];
                j--;
                compares++;
                swaps++;
            }
            tab[j] = value;
        }
        return tab;
    }

    public String getTitle (){
        return"Sortowanie przez wstawianie:";
    }
    public String getTime (){
        return"Czas wykonania algorytmu sortującego przez wstawianie:";
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
