/*Write a program to convert  Celsius to Farenheit.  Display the result correct to 1 decimal.

Create a class "CelsiusConversion.java" and write the main method.

Hint : 5 * (F – 32) = 9 * C,  F-Farenheit , C- Celsius */
import java.util.*;

public class CelsiusConversion

{
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);

float cel=sc.nextFloat();

float fare=((cel*9)/5)+32;

System.out.println(String.format("%.1f",fare));

}
}