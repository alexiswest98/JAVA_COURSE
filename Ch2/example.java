package Ch2;

//What will this example print?
public class example 
{
    public static void main(String[] args) 
    {
        int x=1, y;

        System.out.println ("x = " + x);  
        y = ++x   +   2;                  
        System.out.println ("x = " + x);  
        System.out.println ("y = " + y);
        y = x++   +   2;                  
        System.out.println ("x = " + x);
        System.out.println ("y = " + y);
    }
}
