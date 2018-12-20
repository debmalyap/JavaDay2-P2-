import java.util.Scanner;

public class ReverseInputPalindromeDemo
{
    public void Check()
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String reverse=new StringBuffer(s).reverse().toString();
        if(s.equals(reverse))
        {
            System.out.print("Palindrome "+reverse);
        }
        else
        {
            System.out.print("Not Palindrome "+reverse);
        }
    }
    public static void main(String []args)
    {
        ReverseInputPalindromeDemo ref=new ReverseInputPalindromeDemo();
        ref.Check();
    }
}
