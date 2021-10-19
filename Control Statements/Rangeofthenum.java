/* Write a java program to find the range of the entered value.

a)If the entered value is greater than 0 and less than or equal to 100 then display "Range of the number <number> is 0 to 100"

b)If the entered value is greater than 100 and less than or equal to 200 then display "Range of the number <number> is 100 to 200"

c)If the entered value is greater than 200 and less than or equal to 500 then display "Range of the number <number> is 200 to 500"

If the given number is not in the above list then display "Entered number <number> is not in the expected range".*/
import java.util.Scanner; 

public class Rangeofthenum
{
    public static void main(String[] args) 
{ 
    Scanner sc=new Scanner(System.in);

//FL11 the code here. 
System.out.println("Enter the number");

int num=sc.nextInt(); 
if(num>0 && num<=100)
{
System.out.println("Range of the number "+num+" is 0 to 100");

}
else if(num>100 && num<=200)
{
System.out.println("Range of the number "+num+ "is 100 to 200");
}
else if(num>200 && num<=500) {

    System.out.println("Range of the number"+num+"is 200 to 500");
}

else if(num>500)
{ 
System.out.println("Entered number"+num+"  is not to the expected range");
}
}
}