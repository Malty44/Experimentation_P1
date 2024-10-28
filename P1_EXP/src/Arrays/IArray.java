package Arrays;
import AuxiliarMethods.*;
import SortingAlgorithms.*;

public class IArray {
    public static void run(){
        fillArray filler = new fillArray();


        Integer[] int_array_small = new Integer[10];
        Integer[] int_array_medium = new Integer[100];
        Integer[] int_array_big = new Integer[1000];
        Integer[] int_array_huge = new Integer[10000];
        Integer[] int_array_mid = new Integer[5000];

        filler.fill(int_array_small);
        filler.fill(int_array_medium);
        filler.fill(int_array_big);
        filler.fill(int_array_huge);
        filler.fill(int_array_mid);

        System.out.println("Quicksort: ");
        new sortArrayWithAlgorithm(int_array_small, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(int_array_medium, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(int_array_big, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(int_array_huge, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(int_array_mid, new QuickSortGPT<>());


        System.out.println("Optimized BBSort: ");
        new sortArrayWithAlgorithm(int_array_small, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(int_array_medium, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(int_array_big, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(int_array_huge, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(int_array_mid, new BubbleSortWhileNeeded<>());

        System.out.println("Normal BBSort: ");
        new sortArrayWithAlgorithm(int_array_small, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(int_array_medium, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(int_array_big, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(int_array_huge, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(int_array_mid, new BubbleSortUntilNoChange<>());

        System.out.println("Selection Sort: ");
        new sortArrayWithAlgorithm(int_array_small, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(int_array_medium, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(int_array_big, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(int_array_huge, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(int_array_mid, new SelectionSortGPT<>());


    }
}
