
/*
Write a java program to calculate the EB-Bill based on the usage 

a)No charge, if usage is less than or equal to 20 units. 

b)Rs.3.50 per unit, if usage is greater than 20 units and less than 100 units.

c)Rs.5.00 per unit, if usage is greater than or equal to 100 units.


*/ 
import java.util.Scanner;

public class Billusage
{

public static void main(String[] args) {

Scanner sc=new Scanner(System.in); 

System.out.println("Enter the units consumed");

int units=sc.nextInt();

if(units<=20)
{
System.out.println("No Charge");

}

else if(units>20 && units<100) 
{
    double a=(units*3.50);

System.out.println("You have to pay Rs."+a);

}
else if(units>=100) 
{

double b=(units*5.00); 
System.out.println("You have to pay Rs."+b);
}

//Fill the code here

}

}