package Sorts;
// Sprawdzamy całą tablicę od początku, jeżeli trafimy na parę elementów,
// w której większy poprzedza mniejszy to zamieniamy je miejscami.
// Po przejściu całej tablicy znów zaczynamy przeszukiwać tą tablicę od początku.
// Czynność powtarzamy tak długo aż podczas sprawdzania całej tablicy,
// nie zajdzie ani jedna zamiana elementów. Realizuje się to najczęściej za pomocą zmiennej logicznej.
public class BubbleSort implements Sort{
    int tabSize;
    int[] tab;
    long compares;
    long swaps;
    public long getCompares() {return compares;}
    public long getSwaps() {
        return swaps;
    }

    public BubbleSort(int[] tab) {
        this.tab = tab;
        tabSize =tab.length ;
        compares = 0;
        swaps = 0;
    }
    public int[] sortTabAscending() {
        int A[] = tab;
        int temp;
        int zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < A.length - 1; i++) {
                compares++;
                if (A[i] > A[i + 1]) {
                    swaps++;
                    temp = A[i + 1];
                    A[i + 1] = A[i];
                    A[i] = temp;
                    zmiana++;
                }
            }
        }
        return A;
    }

    public int[] sortTabDescending() {
        int A[] = tab;
        int temp;
        int zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < A.length - 1; i++) {
                compares++;
                if (A[i] < A[i + 1]) {
                    swaps++;
                    temp = A[i + 1];
                    A[i + 1] = A[i];
                    A[i] = temp;
                    zmiana++;
                }
            }
        }
        return A;
    }
    public String getTitle (){
        return"Sortowanie bąbelkowe:";
    }
    public String getTime (){
        return"Czas wykonania algorytmu sortowania bąbelkowego:";
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
