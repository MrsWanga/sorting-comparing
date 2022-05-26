package Tables;

public class PrinterArray {

    public static String printArray(int[] tab) {
        String toString = "";
        for ( int i =0 ; i < tab.length; i++){
            toString += (tab[i]+" ");
        }
        return toString;

    }
    public static String printArrayForCounting(int[] tab) {
        String toString = "";
        for ( int i =1 ; i < tab.length; i++){
            toString += (tab[i]+" ");
        }
        return toString;

    }

}
