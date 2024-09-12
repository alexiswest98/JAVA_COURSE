## Not Demorgan's Law
if(!(userAge > 0 && userAge < 125>))
is the same as 
if(userAge < 0 && userAge > 125>)

## testing if two strings are equal
s1.equals(s2) <br>
s2.equals(s1) <br>
- u can also use
if ("Hello".equalsIgnoreCase("hello"))
     System.out.println("Equal");
for case sensitivity parameters

## using .compareTo
**s1.compareTo(s2)** <br>
A negative number if s1 comes before s2
Zero if the two strings are equal
A positive number if s1 comes after s2

```
if (s1.compareTo(s2) < 0)
   System.out.println(s1 + " precedes " + s2 "+"
                      "in lexicographic ordering");
else if (s1.compareTo(s2) > 0)
   System.out.println(s1 + " follows " + s2 "+"
                      "in lexicographic ordering");
else//s1.compareTo(s2) == 0
   System.out.println(s1 + " equals " + s2);
```
## enumerated types
**EXAMPLE**
```
// Defining an enum for days of the week
public enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

// Using the enum in a class
public class EnumExample {
    public static void main(String[] args) {
        // Assigning an enum value to a variable
        Day today = Day.WEDNESDAY;

        // Using the enum in a switch statement
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case WEDNESDAY:
                System.out.println("Midweek already!");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;
            default:
                System.out.println("Another day of the week.");
                break;
        }
    }
}

```
