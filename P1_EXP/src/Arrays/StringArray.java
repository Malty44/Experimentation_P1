package Arrays;

import AuxiliarMethods.sortArrayWithAlgorithm;
import SortingAlgorithms.BubbleSortUntilNoChange;
import SortingAlgorithms.BubbleSortWhileNeeded;
import SortingAlgorithms.QuickSortGPT;
import SortingAlgorithms.SelectionSortGPT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringArray {
    public static void run(){
        ArrayList<String> wordsList = new ArrayList<>();

        // Define the file path (make sure the file path is correct)
        String filePath = "C:\\Users\\patri\\OneDrive\\Desktop\\Experimentation_P1\\P1_EXP\\src\\Arrays\\words.txt"; // Replace with your file name

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Read words from the file
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordsList.add(word); // Add each word to the list
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        // Convert ArrayList to a String array
        String[] wordsArray = wordsList.toArray(new String[0]);
        //System.out.println("S_QuickSort: ");
        new sortArrayWithAlgorithm(wordsArray, new QuickSortGPT<>(), "QuickSort", "Big");
        //System.out.println("S_BBSNC: ");
        new sortArrayWithAlgorithm(wordsArray, new BubbleSortUntilNoChange<>(),"BubbleSortUntilNoChange", "Big");
        //System.out.println("S_BBSWN: ");
        new sortArrayWithAlgorithm(wordsArray, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Big");
        //System.out.println("S_SelectionSort: ");
        new sortArrayWithAlgorithm(wordsArray, new SelectionSortGPT<>(), "SelectionSort", "Big");
    }
}
