package JavaPrograms;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number to check Leap year or not");
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
        System.out.println("Entered Year is :"+n);

        if( n % 400== 0 || (n % 4 == 0) && (n %100 != 0) )
            System.out.println(+n+ " Year is Leap Year");
        else
            System.out.println(+n+" Year is not a Leap Year");

    }
}
