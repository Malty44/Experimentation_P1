import Arrays.CharArray;
import Arrays.*;
import SortingAlgorithms.*;
import AuxiliarMethods.*;

public class Main {
    public static void main(String[] args) {

        sortArrayWithAlgorithm clearer = new sortArrayWithAlgorithm();
        clearer.clearFile("sorting_times.csv");
        for (int i = 0; i < 10; i++) {
            System.out.println("Run number: " + i);
            IArray.run();

            CharArray.run();

            ByteArray.run();

            FloatArray.run();

            DoubleArray.run();

            LongArray.run();

            StringArray.run();

        }

    }
//


}