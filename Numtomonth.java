/*Ram is very weak in converting the numbers into months. But his friends often tease him by asking him to do that. To solve his problem a close friend of him, suggested to meet IIT students, who were very good at programming. Help ram to resolve his problem.



Note : 
Range of inputs is 1 to 12.
If the input given is beyond the range display error message as given in the sample output.*/
import java.util.Scanner;

public class Numtomonth {
    
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number of month");
        int choice=input.nextInt();
        switch(choice)
    {
        case 1:
         System.out.println("January");
         break;
        
         case 2:
         System.out.println("February");
         break;
         case 3:
         System.out.println("March");
         break;
         case 4:
         System.out.println("April");
         break;
         case 5:
         System.out.println("May");
         break;
         case 6:
         System.out.println("June");
         break;
         case 7:
         System.out.println("July");
         break;
         case 8:
         System.out.println("August");
         break;
         case 9:
         System.out.println("September");
         break;
         case 10:
         System.out.println("October");
         break;
         case 11:
         System.out.println("November");
         break;
         case 12:
         System.out.println("December");
         break;
         default:
         System.out.println("No Month for the number");
        
        
    }

    }
}
