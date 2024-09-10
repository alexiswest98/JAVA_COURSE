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
