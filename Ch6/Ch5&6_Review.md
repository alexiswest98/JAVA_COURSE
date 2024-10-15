### Vocabulary
1. **Instantiate**: Creating an instance (object) of a class using the `new` keyword.
2. **Encapsulation**: Wrapping data (variables) and code (methods) together in a single unit, restricting direct access to some of the object's components.
3. **Wrapper class**: Classes that provide a way to use primitive data types (int, double, etc.) as objects (e.g., Integer for int).
4. **Accessor method**: A method that retrieves (gets) the value of an object's private field, typically named with `get` (e.g., `getName()`).
5. **Call by value**: Passing a copy of the value to methods rather than passing the actual reference.
6. **Overloading**: Defining multiple methods with the same name but different parameters.
7. **Mutator method**: A method that modifies (sets) the value of an object's private field, typically named with `set` (e.g., `setName()`).
8. **Reference**: Refers to the memory address of an object rather than the object itself.
9. **Information hiding**: The practice of restricting access to details of an object (usually by using private fields).
10. **Constructor**: A special method called when an object is instantiated to initialize the object’s state.

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

### Working with Strings
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

**Benefits of using methods**:
- Simplify code reuse, debugging, team collaboration, and testing.

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
      return;
  }
  ```

---

### Information Hiding & Access
- Use `private` to hide fields and `public` for methods that allow controlled access.
- **Why is it valuable?**  
  It protects the internal state of an object from unintended changes and simplifies debugging.

---

### Call by Value
- In Java, arguments passed to methods are copied. Changes made to the parameters inside the method don’t affect the original variables.

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

---

### Constructor
- A special method that initializes objects:
  ```java
  public ClassName() {
      // initialization code
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

---
