package AuxiliarMethods;

import SortingAlgorithms.Sorter;

import java.io.FileWriter;
import java.io.IOException;

public class sortArrayWithAlgorithm {

    public <T extends Comparable<T>> sortArrayWithAlgorithm(T[] array, Sorter<T> sorter, String algorithmName, String arraySizeLabel) {
        // Call the sort method on the sorter instance
        T[] arrayCopy = array.clone();
//        for (T element : arrayCopy) {
//           System.out.print(element + " ");
//        }
        long start = System.nanoTime();
        sorter.sort(arrayCopy);
        long finish = System.nanoTime() - start;
        //System.out.println(finish);

        // Print the sorted array
//        System.out.print("Sorted array: ");
//        for (T element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();  // For new line
        String arrayType = array.getClass().getComponentType().getSimpleName();
        saveTimeToCSV(arraySizeLabel, algorithmName, finish, arrayType);


    }

    public sortArrayWithAlgorithm() {

    }

    private void saveTimeToCSV(String arraySizeLabel, String algorithmName, long timeTaken, String arrayType) {
        try (FileWriter writer = new FileWriter("./sorting_times.csv", true)) {  // Append mode
            writer.append(arrayType)
                    .append(",")
                    .append(arraySizeLabel)
                    .append(",")
                    .append(algorithmName)
                    .append(",")
                    .append(String.valueOf(timeTaken))
                    .append("\n");
        } catch (IOException e) {
            System.out.println("Error writing to CSV: " + e.getMessage());
        }
    }


    public void clearFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // This will create an empty file or overwrite the existing one.
            writer.write(""); // Clear the content
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
