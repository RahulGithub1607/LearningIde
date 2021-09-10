package JavaPrograms;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number to find factorial:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Entered number is :"+n);
        int facto=n;
        for (int i=(n-1);i>1;i--)
        {
            facto=facto*i;
        }

        System.out.println("Factorial of number is :"+facto);
    }
}
