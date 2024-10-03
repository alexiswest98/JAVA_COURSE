# **Study Guide for Chapter 5**

## **Comparing Classes**
-need to make own equals method that will compare the values inside both objects and compare <br>
similar to comparing the values of strings... <br>

```
public boolean equals(Dog otherDog)
{
    return (breed.equals(otherDog.breed) &&
            name.equals(otherDog.name) &&
            age == otherDog.age);
}
```
