import java.util.Scanner;

public class EvenNumTest
{
    static Scanner sc=new Scanner(System.in);
    public static boolean isEven(int number)
    {
        if(number%2==0)
            return true;
        else
            return false;
    }
    public static void main(String []args)
    {
        //EvenNumTest ref=new EvenNumTest();
        int nm=sc.nextInt();
        if(isEven(nm)==true)
        {
            System.out.print("Even Number");
        }
        else
        {
            System.out.print("Odd Number");
        }

    }
}
