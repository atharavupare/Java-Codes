// Jeffy, who is going to complete the higher education in this year needs to create a simple application which accept the name of a person and welcome them with a message along with their name. She wants to read the data using the class "Scanner". Implement this scenario using Java

import java.util.Scanner;

public class PrintString  
{
    public static void main(String args[])
    {
     System.out.println("Enter the Name:");
     Scanner sc= new Scanner(System.in);
     String Name=sc.nextLine();
     System.out.println("Welcome"+Name);
        
    }
}