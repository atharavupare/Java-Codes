import java.util.Scanner;

public class CheckBudget{

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter the cost of the mobile");

int budget=sc.nextInt(); 

if(budget<=13000)
{
System.out.println("Mobile chosen is within the budget");

}else if(budget>13000)
{
    System.out.println("Mobile chosen is beyond the budget");
}
}
}