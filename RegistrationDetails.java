
/*
Steeve is currently working in a job portal. His mode of work is, store the registration details like name, qualification, age, phone number, email id and no of years of experience if any of a job seeker. The system will register all the details given and save it in the portal. Implement the scenario and display the output as shown in the sample.

*/import java.util.*;

public class RegistrationDetails
{
public static void main (String[] args)

{

Scanner sc=new Scanner(System.in);

System.out.println("Enter your name:");

String name=sc.nextLine(); 
System.out.println("Enter your age:");

int age=sc.nextInt();

System.out.println("Enter your phoneno: ");

Long number=sc.nextLong();

sc.nextLine();

System.out.println("Enter your qualification:");

String qualification=sc.nextLine();


System.out.println("Enter your email id[Please provide valid id, after registering your registration id will be mailed]: ");

String email=sc.nextLine(); 
System.out.println("Enter your noofexperience[if any]:");

float nofoexp=sc.nextFloat();



System.out.println("Dear "+name+", Thanks for registering in our portal, registration id will be mailed to "+email+" within 2 working days ");
}
}
