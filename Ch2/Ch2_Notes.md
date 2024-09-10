# EXAMPLE CALCULATION
int answer = 5/2 + 5/4.0;

*JAVA rounds down*

## when doing calculations, you have to use the same types (ie. double, float, int)

int answer = 2 + 5/4.0;

**in this next part Java will turn the 5(int) to a float to a double(5.0)**

int answer = 2 + 5.0/4.0
int answer = 2 + 1.25;

**next JAVA will turn the int(2) to a float to a double**

int answer = 2.0 + 1.25;
int answer = 3.25;

**lastly, Java will turn the final answer into the varibale type (in this case int)**

int answer = 3;


# Primitive data types - includes byte, short, int, long, float, double, boolean and char
# Non-primitive data types - such as String, Arrays and Classes 

## Casting

int first; second;

double average = ((double)(first + second)) / 2;

**example**
What will this example print?
int x=1, y;
System.out.println ("x = " + x);  
y = ++x   +   2;                  
System.out.println ("x = " + x);  
System.out.println ("y = " + y);
y = x++   +   2;                  
System.out.println ("x = " + x);
System.out.println ("y = " + y);

## Dialogue Boxes
-always import java pane first 
import javax.swing.JOptionPane
OR
import javax.swing.*

JOptionPane.showMessageDialog(null, "Invalid input");
 -message to display

JOptionPane.showConfirmDialog(null, "Do you want donuts for breakfast?", JOptionPane.YES_NO_OPTION)
-input is read as a string

if (answer ==JOptionPane.YES_OPTION) {
    //then do this
}

String answer = JOptionPane.showInputDialog (null, “How many donuts do you want?”);

**at the end put**
System.exit(0);
