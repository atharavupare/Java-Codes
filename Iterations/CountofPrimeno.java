package Iterations;
//You can remove above line "It give give error on other machine"


import java.util.Scanner;

public class CountofPrimeno {
    private static Scanner sc;

    public static void main(String args[])
    {
        sc = new Scanner(System.in);
        System.out.print("Enter the Starting Number:");
        int num1=sc.nextInt();
        System.out.println("Enter the last Number of the range:");
        int num2=sc.nextInt();
        int check,count=0;
        for(int i=num1;i<=num2;i ++)
        {
            check=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    check++;

                }
            }
                if(check==2)
                {
                    count++;
                }
            

        }
        System.out.print(count);
    }
    
}
