package Iterations;
//You can remove above line "It give give error on other machine"


import java.util.Scanner;

public class DisplayString {
 public static void main(String args[])
 {
     Scanner in=new Scanner(System.in);
     System.out.print("Enter the String:");
     String S=in.nextLine();
     System.out.print("Enter the Number :");
     int num=in.nextInt();
     if(num<0)
     {
         System.out.println(num+" is not a valid Number..!");
     }
     else{
     for(int i=0;i<num;i++)
     {
         System.out.println(S);
     }
    }

 }   
}