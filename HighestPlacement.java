/*SRV college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

Note : If any input is negative, the output should be "Input is invalid".  If all department has equal number of placements, the output should be "None of the department has got the highest placement". */
import java.util.Scanner;


public class HighestPlacement {

    public static void main(String args[])
    {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of Student placed in CSE:");
        int cse=input.nextInt();
        System.out.println("Enter the no of Student placed in ECE:");
        int ece=input.nextInt();

        System.out.println("Enter the no of Student placed in MECH:");
        int mech=input.nextInt();
         if( cse<0 && ece<0 && mech<0)
         {
             System.out.println("Invalid input");

         }
         else if(cse==ece && ece==mech  )      
         {  
             System.out.print("None of the department has got the highest placement");
     
         }
         else if(cse==ece && mech<cse)
         {
             System.out.println("Highest Placement");
             System.out.println("CSE");
             System.out.println("ECE");
         
         }
         else if(cse==mech && ece<mech)
         {
             System.out.println("Highest Placement");
             System.out.println("CSE");
             System.out.println("Mech");
         
         }else if(ece==mech && cse<mech)
         {
             System.out.println("Highest Placement");
             System.out.println("Mech");
             System.out.println("ECE");
         
         } 
         else if(cse>ece && cse>mech)
            {
                System.out.println("Highest Placement");
                System.out.println("CSE");
         }
         else if(ece>cse && ece>mech)
         {
             System.out.println("Highest Placement");
             System.out.println("ECE");
      } else if(mech>ece && mech>cse)
      {
          System.out.println("Highest Placement");
          System.out.println("MECH");
   }

    }
    
}
