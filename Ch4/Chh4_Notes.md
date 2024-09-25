
### **Study Guide for Chapter 4 Exam**

#### 1. **Basic `if` Statements**
- **`if` statements** are used to make decisions in Java.
- Syntax:
  ```java
  if (condition) {
      // code to execute if the condition is true
  }
  ```
- Example:
  ```java
  int x = 10;
  if (x > 5) {
      System.out.println("x is greater than 5");
  }
  ```

- **Understanding `if` logic**:
  - The condition inside the parentheses is evaluated.
  - If the condition is `true`, the code inside the block is executed.
  - If the condition is `false`, the block is skipped.

#### 2. **`if-else` and Nested `if` Statements**
- **`if-else`** allows handling two possible outcomes:
  ```java
  if (condition) {
      // code to execute if condition is true
  } else {
      // code to execute if condition is false
  }
  ```

- **Nested `if`**: When an `if` statement is placed inside another `if`:
  ```java
  if (condition1) {
      if (condition2) {
          // both conditions are true
      }
  }
  ```

#### 3. **Multi-Way `if` (with `else if`)**
- Used when you have multiple conditions to check.
  ```java
  if (condition1) {
      // code if condition1 is true
  } else if (condition2) {
      // code if condition2 is true
  } else {
      // code if none of the above conditions are true
  }
  ```

#### 4. **Logical Operators (`&&` for AND, `||` for OR)**
- **`&&` (AND)**: Both conditions must be `true` for the entire expression to be `true`.
  ```java
  if (a > 5 && b < 10) {
      // both a > 5 and b < 10 must be true
  }
  ```

- **`||` (OR)**: At least one condition must be `true` for the entire expression to be `true`.
  ```java
  if (a > 5 || b < 10) {
      // either a > 5 or b < 10 must be true
  }
  ```

#### 5. **Switch Statements**
- **`switch`** provides a cleaner way to handle multiple conditions based on a single variable's value.
  ```java
  switch (variable) {
      case value1:
          // code for value1
          break;
      case value2:
          // code for value2
          break;
      default:
          // code if none of the above cases match
  }
  ```

#### 6. **Boolean Operators and Data Types**
- **Boolean operators**: `>`, `<`, `>=`, `<=`, `==`, `!=` are used for comparisons in `if` conditions.
- **Boolean data type**: `boolean` is used to store `true` or `false`.
  ```java
  boolean isValid = (a > b); // isValid will be true if a is greater than b
  ```

#### 7. **Short Circuit Evaluation**
- **Short circuit evaluation** means that Java stops evaluating a logical expression as soon as the outcome is determined.
  ```java
  if (a > 5 && b < 10) { 
      // if a > 5 is false, Java won't even check b < 10
  }
  ```

#### 8. **Loops (`for`, `while`, `do/while`)**
- **`for` loop**: </br>
-`for` (Initializing_Action; Boolean_Expression; Update_Action) 
  ```java
  for (int i = 0; i < 10; i++) {
      // code that runs 10 times
  }
  ```

- **`while` loop**:
  ```java
  while (condition) {
      // code that runs as long as condition is true
  }
  ```

- **`do/while` loop** (executes at least once):</br>
    -example of a post-test loop
  ```java
  do {
      // code
  } while (condition);
  ```

#### 9. **Algorithm and Pseudocode**
- **Algorithm**: A step-by-step procedure for solving a problem.
- **Pseudocode**: A way to write out the logic of an algorithm using plain language and structured steps. It's not actual code but helps in planning.

---

### **Code Answers**

#### **Question 1: What is in the variable `extra` after this code executes?**
```java
int count = 6, extra;
if (count > 5)
    extra = count - 5;
else
    extra = 0;
```
- **Answer**: 
  - `count = 6`, so `count > 5` is `true`.
  - Therefore, the `if` block executes: `extra = count - 5;`, which results in `extra = 1`.

---

#### **Question 2: Write Java code to print “Between limits” if `inputValue` is between 10 and 20, or “Outside limits” if `inputValue` is not between 10 and 20.**
```java
if (inputValue >= 10 && inputValue <= 20) {
    System.out.println("Between limits");
} else {
    System.out.println("Outside limits");
}
```
- **Explanation**: The `if` condition checks if `inputValue` is between 10 and 20 using `>=` and `<=`. If `true`, it prints "Between limits", otherwise, it prints "Outside limits."

---

### **Extra Notes and Examples**

#### **Indentation and Code Style**
- Always properly indent your code inside `if` and `else` blocks for readability.
- Example:
  ```java
  if (x > 5) {
      System.out.println("x is greater than 5");
  } else {
      System.out.println("x is not greater than 5");
  }
  ```

#### **Using Braces in `if` Blocks**
- If there’s more than one statement in an `if` or `else` block, always use braces `{}`.
  ```java
  if (x > 5) {
      System.out.println("x is greater than 5");
      x = 0;
  }
  ```

#### **Short Circuit with `&&` and `||`**
- **Example of short-circuit evaluation**:
  ```java
  if (a > 5 && b < 10) {
      // if a > 5 is false, b < 10 is never checked
  }
  ```

#### **Correcting Bad Solutions**
- **Bad Solution One**:
  ```java
  int speakerVolume;
  if (intVolume > 10)
      System.out.println("Volume is too high");
  ```
  - **Problem**: `speakerVolume` is never initialized, leading to an error.

- **Bad Solution Two**:
  ```java
  int speakerVolume = 13;
  if (intVolume > 10)
      System.out.println("Volume is too high");
  ```
  - **Problem**: The condition is pointless because you already know `speakerVolume = 13`.

- **Correct Solution**:
  ```java
  if (speakerVolume > 10) {
      System.out.println("Volume is too high");
  }
  ```

---

### **Loops Follows**
- **a WHILE LOOP** <br>
    Test is done before iterating. 
- **a DO, WHILE LOOP** <br>
    Test is done after iterating. 
- **a FOR LOOP** <br>
    Test is done before iterating.

---

### **Structured Programming has 3 structures**
• Sequence <br>
• Decision<br>
•Repetition<br>

---

### **A priming read is a read that gets initial data**
