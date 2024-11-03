package Arrays;

import AuxiliarMethods.fillArray;
import AuxiliarMethods.sortArrayWithAlgorithm;
import SortingAlgorithms.BubbleSortUntilNoChange;
import SortingAlgorithms.BubbleSortWhileNeeded;
import SortingAlgorithms.QuickSortGPT;
import SortingAlgorithms.SelectionSortGPT;

public class IArray {
    public static void run() {
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

        //System.out.println("Quicksort: ");
        new sortArrayWithAlgorithm(int_array_small, new QuickSortGPT<>(), "QuickSort", "Small");
        new sortArrayWithAlgorithm(int_array_medium, new QuickSortGPT<>(), "QuickSort", "Medium");
        new sortArrayWithAlgorithm(int_array_big, new QuickSortGPT<>(), "QuickSort", "Big");
        new sortArrayWithAlgorithm(int_array_huge, new QuickSortGPT<>(), "QuickSort", "Huge");
        new sortArrayWithAlgorithm(int_array_mid, new QuickSortGPT<>(), "QuickSort", "Mid");

        //System.out.println("Optimized BBSort: ");
        new sortArrayWithAlgorithm(int_array_small, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Small");
        new sortArrayWithAlgorithm(int_array_medium, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Medium");
        new sortArrayWithAlgorithm(int_array_big, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Big");
        new sortArrayWithAlgorithm(int_array_huge, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Huge");
        new sortArrayWithAlgorithm(int_array_mid, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Mid");

        //System.out.println("Normal BBSort: ");
        new sortArrayWithAlgorithm(int_array_small, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Small");
        new sortArrayWithAlgorithm(int_array_medium, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Medium");
        new sortArrayWithAlgorithm(int_array_big, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Big");
        new sortArrayWithAlgorithm(int_array_huge, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Huge");
        new sortArrayWithAlgorithm(int_array_mid, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Mid");

        //System.out.println("Selection Sort: ");
        new sortArrayWithAlgorithm(int_array_small, new SelectionSortGPT<>(), "SelectionSort", "Small");
        new sortArrayWithAlgorithm(int_array_medium, new SelectionSortGPT<>(), "SelectionSort", "Medium");
        new sortArrayWithAlgorithm(int_array_big, new SelectionSortGPT<>(), "SelectionSort", "Big");
        new sortArrayWithAlgorithm(int_array_huge, new SelectionSortGPT<>(), "SelectionSort", "Huge");
        new sortArrayWithAlgorithm(int_array_mid, new SelectionSortGPT<>(), "SelectionSort", "Mid");
    }
}
