import java.util.*;
import java.time.Year;

public class leapyear {
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Year:");
        int year=input.nextInt();
        if(year<1000 && year>9999)
        {
            System.out.println("Invalid Year");

        }
        else
        {
            if((year%4 != 0) && (year%100 == 0) || (year%400 > 0))
            {
                System.out.println("leap year");

            }
            else
            {
                System.out.println("Not a leap Year");

            }
        }
    }
}
