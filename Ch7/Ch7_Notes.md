# Arrays
**!! An array's length in java can not be changed. If you want to add to an array you have to make a new array.**
 
## **To declare an array, define the variable type with square brackets:**
### array of Strings example
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```
### array of Integers example
```
int[] myNum = {10, 20, 30, 40};
```
### accessing outputs of array
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```
### change array element
```
cars[0] = "Opel";
```
### get array length
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4
```
### Make a new array with different length 
```
   public static int[] addX(int n, int arr[], int x)
   {
       int i; //instantiate the index ALWAYS
 
       // create a new array of size n+1
       int newarr[] = new int[n + 1];
 
       // insert the elements from the old array into the new array
       // insert all elements till n
       // then insert x at n+1
       for (i = 0; i < n; i++)
           newarr[i] = arr[i];
 
       newarr[n] = x;
 
       return newarr;
   }
```
### for loop iteration example
```
for (int index = 0; index <temperature.length; index++)
{
   temperature[index] = keyboard.nextDouble();
   sum = sum + temperature[index];
}
```


### for each iteration example
```
for (int value : temperature)
{
    if (value < average)
        System.out.println(value + " below average.");
    else if (value > average)
        System.out.println(value + " above average.");
    else //value == average
        System.out.println(value + " the average.");
}
```

---

### Array lists
The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.

```
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

    System.out.println(cars);
  }
}
```
# Java StudyGuide

## Partially Filled Arrays

- **Definition**: Arrays are often created with a larger capacity than what is initially needed. A partially filled array uses only a portion of the allocated space.
- **Tracking Usage**: To keep track of the number of used elements, declare an `int` variable (commonly named `count` or `size`) that holds the number of elements currently in use.

    ```java
    int[] numbers = new int[10];
    int count = 0; // Tracks the number of used elements

    // Example: Adding elements and updating count
    numbers[count++] = 25;
    numbers[count++] = 50;
    ```

## Searching an Array

### Sequential (Linear) Search

- **Process**: A linear search checks each element in the array until it finds the target or reaches the end of the array.
- **Best for**: Small or unsorted arrays, but inefficient for large arrays.

    ```java
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Returns the index of the target
            }
        }
        return -1; // Target not found
    }
    ```

### Binary Search

- **Requirement**: The array must be sorted for binary search to work.
- **Process**: Binary search repeatedly divides the array in half, checking the middle element until the target is found or the range is exhausted.
- **Efficiency**: Faster than linear search, especially for large datasets, with time complexity \( O(\log n) \).

    ```java
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }
    ```

## Sorting an Array

### Selection Sort

- **Process**: Selection sort finds the smallest element in the array and places it at the beginning. It repeats this for each position in the array.
- **Efficiency**: Simple but inefficient for large arrays, with a time complexity of \( O(n^2) \).

    ```java
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the element at index i
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    ```

## Java’s `Arrays` Class

Java provides the `Arrays` class with built-in methods for array operations, making code simpler and more efficient:

- **`binarySearch`**: Searches for a value in a sorted array.
- **`copyOf`**: Copies the entire array or a portion to a new array.
- **`copyOfRange`**: Copies a specific range from an array.
- **`equals`**: Checks if two arrays are equal.
- **`fill`**: Fills an array with a specified value.
- **`sort`**: Sorts an array in ascending order.

    ```java
    import java.util.Arrays;

    int[] numbers = {3, 1, 4, 1, 5};
    Arrays.sort(numbers); // Sorts the array
    int index = Arrays.binarySearch(numbers, 4); // Searches for 4
    int[] newArray = Arrays.copyOf(numbers, 10); // Extends the array to 10 elements
    ```

## Two-Dimensional Arrays

- **Declaration**: A two-dimensional array can be visualized as a table with rows and columns.

    ```java
    int[][] matrix = new int[3][4]; // 3 rows, 4 columns

    // Assigning a value
    matrix[1][2] = 10;

    // Looping through a 2D array
    for (int i = 0; i < matrix.length; i++) {          // rows
        for (int j = 0; j < matrix[i].length; j++) {    // columns
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    ```

## Enumerated Types

- **Definition**: An `enum` is a data type that allows you to define a fixed set of constants. Enumerations are useful when a variable can only take one of a few predefined values (e.g., days of the week, directions).

    ```java
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    Day today = Day.WEDNESDAY;
    ```

## Named Constants

- **Definition**: A named constant is a variable whose value cannot change. In Java, we use `final` to declare constants, and they are typically written in uppercase.

    ```java
    public class TimeBook {
        public static final int MAX_HOURS = 40; // Named constant
        
        public void calculateOvertime(int hoursWorked) {
            if (hoursWorked > MAX_HOURS) {
                int overtime = hoursWorked - MAX_HOURS;
                // Overtime calculation
            }
        }
    }
    ```
