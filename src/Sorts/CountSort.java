package Sorts;

public class CountSort implements Sort{
    int tabSize;
    int[] tab;
    long compares;
    long swaps;
    public long getCompares() {return compares;}
    public long getSwaps() {
        return swaps;
    }

    public CountSort(int[] tab) {
        this.tab = tab;
        tabSize =tab.length ;
        compares = 0;
        swaps = 0;
    }

    public int[] sortTabAscending() {
        int[] A = tab;
        int max = A[0];
        this.swaps = 0;
        this.compares = 0;
        //szukanie największej wartości w tablicy
        for (int i = 0; i < tabSize; i++) {
            if (A[i] > max) max = A[i];
            compares++;
        }
        //stworzenie tablicy B o długości max, z samymi zerami
        int[] B = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            B[i] = 0;
            compares++;
        }
        //zliczanie poszczególnych wartości z tablicy A
        for (int i = 0; i < tabSize; i++) {
            B[A[i]]++;
            compares++;
        }
        //dodawanie elementów niewiększych niż i (w tablicy B)
        for (int i = 1; i <= max; i++) {
            B[i] = B[i] + B[i - 1];
            compares++;
        }
        //tworzenie posortowanej tablicy
        int[] C = new int[tabSize + 1];
        for (int i = 0; i < tabSize; i++) {
            C[B[A[i]]] = A[i];
            B[A[i]]--;
            swaps++;
            compares++;
        }
        tab=C;
        return C;

    }

    public int[] sortTabDescending() {
        int[] A = tab;
        int max = A[0];
        this.swaps = 0;
        this.compares = 0;
        //szukanie największej wartości w tablicy
        for (int i = 0; i < tabSize; i++) {
            if (A[i] > max) max = A[i];
            compares++;
        }
        //stworzenie tablicy B o długości max, z samymi zerami
        int[] B = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            B[i] = 0;
            compares++;
        }
        //zliczanie poszczególnych wartości z tablicy A
        for (int i = 0; i < tabSize; i++) {
            B[A[i]]++;
            compares++;
        }
        //dodawanie elementów niewiększych niż i (w tablicy B)
        for (int i = 1; i <= max; i++) {
            B[i] = B[i] + B[i - 1];
            compares++;
        }

        //tworzenie posortowanej tablicy
        int[] C = new int[tabSize + 1];
        for (int i = 0; i < tabSize; i++) {
            C[1+(tabSize-B[A[i]])] = A[i];
            B[A[i]]--;
            compares++;
            swaps++;
        }
        tab=C;
        return C;

    }
    public String getTitle (){
        return"Sortowanie przez zliczanie:";
    }
    public String getTime (){
        return"Czas wykonania algorytmu sortującego przez zliczanie:";
    }
    public void printStatistics (){
        System.out.println("Porównań: " + compares + " Zamian: " + swaps);
    }

    public String toString() {
        String toString = "";
        for (int i = 1; tabSize >= i; i++) {
            toString += tab[i] + " ";
        }
        return toString;
    }
}
