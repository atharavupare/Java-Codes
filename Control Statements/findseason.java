/* Reaya's teacher has asked her to prepare well for the lesson on seasons. When her teacher tells a month, she needs to say the season corresponding to that month. Write a program to solve the above task.

Spring - March to May,
Summer - June to August,
Autumn - September to November and,
Winter - December to February.
Month should be in the range 1 to 12.  If not the output should be "Invalid month".*/
import java.util.Scanner;

public class findseason {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the month");
        int month=input.nextInt();
        if(month>=1 && month<=12)
        {
            if(month>=3 && month<=5)
            {
                System.out.println("Season:Spring");
            }else if(month>=6 && month<=8)
            {
                System.out.println("Season:Summer");

            }else if(month>=9 && month<=11)
            {
                System.out.println("Season:Autumn");
            }
            else
            {
                System.out.println("Season:Winter");
            }
        }


        
        else{
            System.out.println("Invalid Month");
        }
    }
    
}
