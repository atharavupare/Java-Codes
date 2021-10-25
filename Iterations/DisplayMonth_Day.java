//You can remove above line "It give give error on other machine"
package Iterations;

import java.util.Scanner;

public class DisplayMonth_Day {
    private static Scanner sc;

    public static void main(String args[])
    {sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Display the Months");
            System.out.println("2.Display the Days");
            System.out.println("3.Exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("1.January ");

                System.out.print("2.February");

                
                    System.out.print("3.March");
                
                    System.out.print(" 4.April");
                
                    System.out.print(" 5.May");
                
                    System.out.print("6.June");
                
                    System.out.print("7.July");
                 
                    System.out.print("8.August");
                
                    System.out.print("9.September");
                
                    System.out.print("10.October");
                    System.out.print("11.November");
                
                    System.out.print("12.December");
                    break;

        case 2:

                System.out.print("1.Monday");

                System.out.print("2.Tuesday");
                
                System.out.print("3.Wednesday");
                
                System.out.print("4.Thursday");
                
                System.out.print("5.Friday");
                
                System.out.print("6.Saturday");
                
                System.out.print("7.Sunday");
                
                break;
                case 3:
                 System.exit(0);
            break;
          default:
                 System.exit(0);
                 
                
                
            }
        

        }
        

    }

    
}
