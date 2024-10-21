### **Key Concepts**
1. **Method Signature**: The name of the method, number of parameters, and their types.
2. **Return Types**: Methods can return values (e.g., `public int twice(int num)`) or perform tasks without returning anything (`void`).
3. **Parameters**: Variables passed into methods (e.g., `int num` in `twice(int num)`).
4. **Multiple Return Statements**: Avoid using multiple return statements in a method for clarity and maintainability.
5. **Void vs. Non-Void Methods**:
   - **Void Method**: Executes a task (e.g., printing).
   - **Non-Void Method**: Returns a value (e.g., calculating).
6. **Call by Value**: Method parameters in Java are passed by value, meaning the method receives a copy of the argument.

---

### **Object-Oriented Principles**
1. **Encapsulation**: Keeping objects’ data private and only accessible via methods.
2. **Inheritance**: Objects can inherit traits from other objects (e.g., a `Cat` class can inherit from an `Animal` class).
3. **Polymorphism**: An object can act in different ways depending on the context.

---
# STUDY GUIDE
### **Vocabulary**
1. **Class**: A blueprint for creating objects (e.g., `Dog` class).
2. **Instantiate**: Creating an instance (object) of a class using the `new` keyword.
3. **Method**: A procedure or function defined inside a class (e.g., `getName()`, `twice()`).
4. **Instance Variable (Attributes)**: Variables defined in a class for each object instance, representing characteristics of the object (e.g., `name`, `age` in `Dog` class).
5. **Accessor Methods (Getters)**: Methods that retrieve the value of an object's private field (e.g., `getName()`).
6. **Mutator Methods (Setters)**: Methods that modify the value of an object's private field (e.g., `setName(String newName)`).
7. **Encapsulation**: Wrapping data (variables) and code (methods) together in a single unit and restricting direct access to some of the object's components, also known as **Information Hiding**.
8. **Information Hiding**: The practice of restricting access to details of an object (usually by using private fields).
9. **Call by Value**: Passing a copy of the value to methods rather than passing the actual reference.
10. **Wrapper Class**: Classes that provide a way to use primitive data types (e.g., `int`, `double`) as objects (e.g., `Integer` for `int`).
11. **Overloading**: Defining multiple methods with the same name but different parameters.
12. **Reference**: Refers to the memory address of an object rather than the object itself.
13. **Constructor**: A special method called when an object is instantiated to initialize the object’s state.
14. **Void Method**: A method that performs an action but doesn't return a value (e.g., `printCurrency()`).
15. **Return Statement**: Used to return a value from a method.

---
### Pseudocode for Simple Situations
- Break down the problem into clear logical steps without worrying about syntax.
- Example: If you need to calculate the area of a rectangle:
  ```
  Method to calculate area:
  Get the length
  Get the width
  Multiply length by width
  Return the result
  ```

---
### Put the first character of a String into a char variable
- To get the first character of a String:
  ```java
  char firstChar = myString.charAt(0);
  ```

---
### Class vs. Object
- **Class**: A blueprint for creating objects (defines properties and behaviors).
- **Object**: An instance of a class (a concrete entity created based on the class).
---

### Instantiate a Class
```java
ClassName obj = new ClassName();
```
---

### Variables
- **Instance Variables**: Declared within a class but outside any method. They belong to each object of the class.
- **Local Variables**: Declared inside methods or blocks, and are only accessible within them.
```
public class Dog {

    // Instance variables (declared inside the class but outside any method)
    String name;
    int age;

    // Constructor to initialize instance variables
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method that uses both instance and local variables
    public void describeDog() {
        // Local variable (declared inside a method)
        String description;

        // Using instance variables to create the description
        description = "Dog's name is " + name + " and age is " + age + " years.";
        
        // Printing the description (local variable)
        System.out.println(description);
    }
}

```
---

### Accessor and Mutator Methods
- **Accessor**: Allows external code to get the value of a private field.
  ```java
  public String getName() {
      return name;
  }
  ```
- **Mutator**: Allows external code to set the value of a private field.
  ```java
  public void setName(String newName) {
      name = newName;
  }
  ```

**Why use them?**  
- They ensure controlled access to an object’s fields, promoting encapsulation and data validation.

---
### Methods
- **Calculating methods**: Perform a task and return a value (non-`void`).
  ```java
  public int add(int a, int b) {
      return a + b;
  }
  ```
- **Task methods**: Perform an action but do not return a value (`void`).
  ```java
  public void printMessage() {
      System.out.println("Hello");
  }
  ```

### **Class and Method Examples**
- **Dog Class**:
   - **Instance Variables**: `name`, `breed`, `age`.
   - **Accessor Methods**: `getName()`, `getBreed()`, `getAge()`.
   - **Mutator Methods**: `setName()`, `setBreed()`, `setAge()`.

### **Benefits of using methods**:
- Simplify code reuse
- simplify the coding process
- speed up the development process
- make testing easier
- make it easier for a team to design a large project

---

### Return Statement
- Non-void methods must have a return statement matching their return type:
  ```java
  public int getNumber() {
      return 5;
  }
  ```
- Void methods don’t need a return statement, but can use it to exit early:
  ```java
  public void doNothing() {
      //System.out.println("do nothing")
      return;
  }
  ```

---

### Information Hiding & Access
- Use `private` to hide fields and `public` for methods that allow controlled access.
- **Why is it valuable?**  
  It protects the internal state of an object from unintended changes and simplifies debugging.
- In general **methods should be public** and **variables should be private**

---
### Call by Value
- Call by value means when you pass a variable (like number) to a method, Java makes a copy of that variable and passes the copy to the method.
- The method only modifies its own copy of the variable, not the original one.

---
### Comparing Objects (e.g., Strings)
- Use `.equals()` to compare objects, not `==` (which compares references).
  ```java
  if (str1.equals(str2)) { 
      // Do something
  }
  ```

---

### UML Diagrams
- Unified Modeling Language (UML) diagrams are visual representations of a class's structure, showing class name, attributes (instance variables), and methods.
- **UML for Class Representation**:
   - **Top Box**: Class name.
   - **Middle Box**: Instance variables in reverse order (e.g., `name: String`).
   - **Bottom Box**: Methods with types in reverse order (e.g., `getName(): String`).


---

### Constructor
- A special method that initializes objects:
```
  public class Car {
    // Instance variables (attributes of a car)
    private String make;
    private String model;
    private int year;

    // Constructor to initialize the Car object
    //remember that it will have the same name as class 
    public Car(String make, String model, int year) {
        this.make = make;    
        this.model = model;  
        this.year = year;    
    }

    // Accessor methods (getters)
    public String getMake() {
        return make;
    }

    // Mutator methods (setters)
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Example method to display car details
    public void displayInfo() {
        System.out.println("Car: " + make + " " + model + " (" + year + ")");
    }
}
```
**example of using the class in an object**
```
public class Main {
    public static void main(String[] args) {
        // Creating a Car object using the constructor
        Car myCar = new Car("Toyota", "Corolla", 2020);
        
        // Display car details using a method
        myCar.displayInfo();  // Output: Car: Toyota Corolla (2020)
    }
}
```
---
### Static Variables and Methods
- **Static Variables**: Belong to the class, not to any particular object.
- **Static Methods**: Can only call other static methods or access static variables.

---

### Common Wrapper Classes
- Integer (for int)
- Double (for double)
- Character (for char)

---

### Overloading
- Example: `+` is overloaded to work for both number addition and String concatenation.
- Java determines the method to use based on method name and the number/types of arguments.
