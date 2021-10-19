
/*Write a program to get the details about a car as specified in the sample input and display it. 

Hint: Store the price in double. Print the price correct to two decimal places.

*/import java.util.*; 
public class CarDetails
{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
 System.out.println("Enter the car name:"); 
 String carname=sc.nextLine();
  System.out.println("Enter the car no: "); 
  int carno=sc.nextInt(); 
  System.out.println("Enter the price:"); 
  double price=sc.nextDouble();
   System.out.println("Carname: "+carname); 
   System.out.println("Carno: "+carno);
    System.out.println("Price: "+String.format("%.2f",price)+" rs only");

}
}