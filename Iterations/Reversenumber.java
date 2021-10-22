package Iterations;
//You can remove above line "It give give error on other machine"


import java.util.*;
public class Reversenumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=sc.nextInt();
        int rev=0,r;
        while(num!=0)
        {
            r=num%10;
            rev=rev*10+r;
            num/=10;

        }
        System.out.print(rev);
    }
}