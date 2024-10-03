// Alexis West
// Richard Sutor
// Carlos John Escala
// Khaing Phyo Zaw

public class CreatingMethods 
{
    public int twice(int num) 
    {
        return num * 2;
    }

    public boolean isBig(int num)
    {
        return (num > 10000);
    }

    public void printResult(int num)
    {
        System.out.println(num);
    }

    public boolean inOrder(int num1, int num2)
    {
        return num1 < num2;
    }

    public int addOne(int num)
    {
        return num + 1;
    }

    public double halfDouble(double num) 
    {
        return num / 2;
    }

    public int addTwo(int num1, int num2)
    {
        return num1 + num2;
    }

    public void printArg(boolean fido)
    {
        System.out.println(fido);
    }

    public void setNameAge(String name, int age)
    {
        System.out.println(name + age);
    }

    public void printsLine(int num)
    {
        System.out.println("The answer is " + num);
    }

}  
