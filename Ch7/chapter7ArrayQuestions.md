# What is the value of using arrays?
- Arrays are a smart way to store data that eliminates the need to write repetitive code. It also is easier to manage items in your array and add/delete.

# What is the first index for an array element?
- 0

# For each part, write a Java statement
## Declare an array named counts that can hold 100 integers.
- int count = new int[100]

## Declare an array named prices that can hold 1000 double precision numbers.
- double prices = new double[1000]

## Print the first three elements of the array counts.
- System.out.print(prices[0], prices[1], prices[2])

## Add 6 to the last element in the array counts. 
```
public static int[] addSix(int n, counts)
{
    int i;

    //create a new array with size + 1
    int newArray = new int[n+1];

    //insert 6 
    for(i=0; i < n; i++) 
        newArray[i] = counts[i];
    
    newArray[n] = 6;
    return newArray;
}
```

## Test if the last element in counts is greater than zero.
- System.out.println(counts[counts.length - 1] > 0)
