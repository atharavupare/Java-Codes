import java.util.Scanner;

/*Tom went to a movie with his friends in a multiplex theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 

Rs.100/pizza
Rs.20/puffs
Rs.10/cool drink
Generate a bill for What Tom has bought.

*/
public class BillGeneration
{
     public static void total(int pizza,int puffs,int cd)
     {
         int a=100*pizza;
         int b=20*puffs;
         int c=10*cd;
         int d=a+b+c;
         System.out.println("Total Price:"+d);

     }
     public static void main(String args[])
     {
         Scanner input=new Scanner(System.in);
         
         System.out.println("Enter the number of pizzas bought:");
         int noofpizza=input.nextInt();
         System.out.println("Enter the number of puffs bought:");
        int nofopuffs=input.nextInt();
         System.out.println("Enter the number of Cool drinks bought:");
         int noofcd=input.nextInt();
         total(noofpizza,nofopuffs,noofcd);
         System.out.println("Enjoy the Show!!!");


     }
}