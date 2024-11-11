import Arrays.CharArray;
import Arrays.*;
import SortingAlgorithms.*;
import AuxiliarMethods.*;

public class Main {
    public static void main(String[] args) {

        sortArrayWithAlgorithm clearer = new sortArrayWithAlgorithm();
        clearer.clearFile("sorting_times.csv");

        int TIMES_TO_REPEAT_RUNS = 30;

        for (int i = 0; i < TIMES_TO_REPEAT_RUNS; i++) {
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
///////


}