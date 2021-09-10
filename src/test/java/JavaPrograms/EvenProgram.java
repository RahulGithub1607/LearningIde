package JavaPrograms;

import java.util.Scanner;

public class EvenProgram {
    public static void main(String[] args) {
        //Take input from user import from the Input Array from user

        System.out.println("Please enter the the max limit of input:");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The limit of input array is  :"+a);

        int[] array= new int[10];
        System.out.println("Enter the array:");
        for (int i=1;i<=a;i++)
        {
            //reading elements from the user
            array[i]=sc.nextInt();
        }
        //Accessing elemnts using the for loop
        System.out.println("Array elements are");
        for (int i=1;i<=a;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Check the odd and even number");
        for (int i=1 ;i<=a;i++)
        {
            if(array[i] %2 == 0)
                System.out.println("This is even number: "+array[i]);
                else
                System.out.println("This is odd number : "+array[i]);

        }
        sc.close();

            }
}