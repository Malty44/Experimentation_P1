# Experiment to determine which algorithm is faster based on certain criteria

## All the code and documentation can be found and reused in this repo.

This repository contains all the code needed to recreate the experiment over and over again. The experiment is all about the performance of the algorithms taking into account the execution time of each and everyone of them ( in ms ).
All the necessary files and algorithms are structured logically in their respective folders to promote ease of understanding and readability.

The key parts of this algorithm are :

* The sorting algorithms ( BubbleSort `while` / no `while` needed  | Quicksort | SelectionSort ).
* The sorter interface 
* The multiple array classes that represent different data types to promote diversity and maleability.
* The actual method that fills the .CSV file with the data collected from the n runs did.


## How to use this repository to reproduce the experiment

1. Clone this repository in your desired location using `git clone your-path-here`
2. Open the repository in and IDE, preferably intelliJ since this was created using said IDE
3. Make sure that the path inside `P1_EXP>pyhton>main.py` matches your desired path.
4. Run the experiment from the `P1_EXP>src>Main.java` file.
5. Take the CSV file and add it to the python folder , then run the python code to visualize the data.

### IMPORTANT:
* The python code cannot run within intelliJ, thus you will have to open it inside a specialized IDE or VSCode and run it there.

## Known issues:
* We are aware of warnings from IDE's saying that some casts are not properly done, but it doesn't affect the performance nor the code, it will be fixed in a future commit.
* If there are any issues found please feel free to open an issue yourself describing the problem at hand.

# Extra information about the code found within the project

1. The project has/must be run from the specified `Main.java` file found within `P1_EXP>src>Main.java`. The file looks like this:
![Main file structure](P1_EXP/assets_for_readme/main.png)

2. All the array classes can be found within the folder called `Arrays` at `P1_EXP>src>Arrays`:
![Array Folder](P1_EXP/assets_for_readme/ArrayFolder.png)

3. All the array classes follow the same pattern, except the string class which is taking values from the `words.txt` file. The pattern is the following, and can be modified at will : 
![Array Class Structure](P1_EXP/assets_for_readme/arrayClassStructure.png)

4. All the arrays are filled with random values using this function found in `P1_EXP>src>AuxiliarMethods>fillArray.java`. <strong> IMPORTANT! </strong> If there is a need in the future for more data types, it is important to respect the structure of the project:
* Create a class for the appropriate array data type
* Extend the fillArray Class to fill the array with the new data type
* Call the class.run() method within the main file.
![How the array is filled](P1_EXP/assets_for_readme/filler.png)

5. The constructor for the sorting class that takes care of both timing the execution and saving the data into a CSV is found at `P1_EXP>src>Auxiliar>Methods`:
![Sorting Class + Constructor](P1_EXP/assets_for_readme/SortingClass.png)

6. The function that saves the data into a .CSV file is in the same location mentioned at point 3, but !<strong> MAKE SURE </strong> ! that the path of the .CSV file is where you desire it to be created. If you want to change it, make sure to delete the previous .CSV file!
![CSV saving method + Clear file](P1_EXP/assets_for_readme/CSVFileManipulation.png)

7. Lastly, within the python file, make sure that the data variable <strong> has the correct path to your .CSV file </strong> otherwise you won't be able to visualize the results of the experiment. Furthermore, the last plot can be either commented or deleted if there is no need to compare between two systems, otherwise fill the `your_path_here` with the correct path found on your machine.

![Comparison between systems](P1_EXP/assets_for_readme/comparisonBTNSystems.png)