import java.util.Scanner;

public class StudentGrade
{
    static Scanner sc=new Scanner(System.in);
    public void evaluation()
    {
        System.out.print("Enter the number of students:");
        int no_of_studs=sc.nextInt(),sum=0;
        int ar[]=new int[no_of_studs];
        for(int i=0;i<ar.length;i++)
        {
            System.out.print("Enter the grade for student "+(i+1)+" :");
            ar[i]=sc.nextInt();
        }
        //find out the average mark
        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
        }
        double avg=sum/no_of_studs;
        System.out.print("The average is "+avg);
        //find out the minimum mark
        int minimum=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]<minimum)
            {
                minimum=ar[i];
            }
        }
        System.out.println();
        System.out.print("The minimum is: "+minimum);

        //find out the maximum mark
        int maximum=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]>maximum)
            {
                maximum=ar[i];
            }
        }
        System.out.println();
        System.out.print("The maximum is: "+maximum);

    }


    public static void main(String []args)
    {
        StudentGrade ref=new StudentGrade();
        ref.evaluation();
    }
}
