import java.util.Scanner;

public class IncomeCalulation {

    public static void Totalincome(int hr)
    {
        int perday=100*hr;
        int peryear=perday*365;
        System.out.println("Total income in a year:"+peryear);

    }
    public static void main(String args[])
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter no of hours worked in a day");
    int hours=input.nextInt();
    if(hours>=0 && hours<24)
    {
        Totalincome(hours);
    }
    else
    {
            System.out.println("Unable to Calculate Income");
    }

    }
    
}

