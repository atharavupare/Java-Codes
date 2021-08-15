import java.util.*;

public class Printdetalis
{
public static void main(String args[])

{

Scanner sc=new Scanner(System.in); System.out.print("Enter your name:"); String name=sc.nextLine();

System.out.print("Enter age: "); int age=sc.nextInt();

sc.nextLine();

System.out.print("Enter gender:"); String gen=sc.nextLine();

System.out.print("Hailing from: ");

String Hfrom=sc.nextLine(); 
System.out.println("Welcome, "+name);

System.out.println("Age: "+age);

System.out.println("Gender:" +gen);

System.out.println("City:" +Hfrom);
}
}
