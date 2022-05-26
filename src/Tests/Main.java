package Tests;

import Tables.CreaterArray;
import Tables.PrinterArray;
import Sorts.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Wczytywanie wartości
        Random los = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Ile liczb chcesz posortować?");
        int count = in.nextInt();
        System.out.print("Minimalna wartość:");
        int min = in.nextInt();
        System.out.print("Maksymalna wartość:");
        int max = in.nextInt();

        //Tworzenie tablicy
        CreaterArray tab = new CreaterArray(min,max,count);
        int[] table = tab.CreationArray();
        int[] copyTab1=table.clone();
        int[] copyTab2=table.clone();
        int[] copyTab3=table.clone();
        int[] copyTab4=table.clone();
        int[] copyTab5=table.clone();
        int[] copyTab6=table.clone();
        int[] copyTab7=table.clone();
        int[] copyTab8=table.clone();


        System.out.println(PrinterArray.printArray(table));
        System.out.println();

        //Sortowanie rosnąco
        System.out.println("Sortowanie rosnąco");
        CountSort sampleCountingAsc = new CountSort (copyTab1);
        BubbleSort sampleBubleAsc = new BubbleSort (copyTab2);
        InsertSort sampleInsertAsc = new InsertSort (copyTab3);
        QuickSort sampleQuickAsc = new QuickSort (copyTab4);
        testAscending(sampleCountingAsc);
        testAscending(sampleBubleAsc);
        testAscending(sampleInsertAsc);
        testAscending(sampleQuickAsc);

        //Sortowanie malejąco
        System.out.println("Sortowanie malejące");
        CountSort sampleCountingDesc = new CountSort (copyTab5);
        BubbleSort sampleBubleDesc = new BubbleSort (copyTab6);
        InsertSort sampleInsertDesc = new InsertSort (copyTab7);
        QuickSort sampleQuickDesc = new QuickSort (copyTab8);
        testDescending(sampleCountingDesc);
        testDescending(sampleBubleDesc);
        testDescending(sampleInsertDesc);
        testDescending(sampleQuickDesc);
    }

    private static void testAscending(Sort sortType){
        long start=System.currentTimeMillis();
        System.out.println(sortType.getTitle());
        int[] SortedTab = sortType.sortTabAscending();
        System.out.println(PrinterArray.printArray(SortedTab));
        long stop=System.currentTimeMillis();
        System.out.println(sortType.getTime()+(stop-start));
        sortType.printStatistics();
        System.out.println();
    }

    private static void testDescending(Sort sortType){
        long start=System.currentTimeMillis();
        System.out.println(sortType.getTitle());
        int[] SortedTab = sortType.sortTabDescending();
        System.out.println(sortType);
        long stop=System.currentTimeMillis();
        System.out.println(sortType.getTime()+(stop-start));
        sortType.printStatistics();
        System.out.println();
    }
}
