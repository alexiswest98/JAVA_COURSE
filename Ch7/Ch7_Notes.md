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
