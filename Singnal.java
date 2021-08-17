/*Write a java program to demonstrate the road signaling with default as 'prepare to go' operation.

Assume red for 'stop', green for 'go', and yellow for 'proceed with caution'. */

import java.util.Scanner;

public class Singnal{

public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);

//Fill the code here 
System.out.println("Enter the color");

String color=sc.nextLine();

switch(color)
{
case "red":
{
System.out.println("stop");

break;
}

case "green":
{
System.out.println("go");

break;
}
case "yellow":
{
System.out.println("proceed with caution");

break;
}
default:
{
    System.out.println("prepare to go");

break;
}
}
}
}
