import java.util.Scanner;

public class PowerofFourDemo
{
    static Scanner sc=new Scanner(System.in);
    public int PowerofFour(int num)
    {
        //Scanner sc=new Scanner(System.in);
            if(num==0)
            return 0;
            while(num!=1)
            {
                if(num%4!=0)
                    return 0;
                num/=4;
            }
            return 1;

    }
    public static void main(String []args)
    {
        int n=sc.nextInt();
        PowerofFourDemo ref=new PowerofFourDemo();
        if(ref.PowerofFour(n)>0)
        {
            System.out.print(n+" is Power of four");
        }
        else
        {
            System.out.print(n+" is not Power of four");
        }
    }
}
