package JavaPrograms;

import java.util.Scanner;


public class InputArrayFromUser {
    public static void main(String[] args) {

        System.out.println("Please enter the the max limit of input:");
       Scanner sc=new Scanner(System.in);
       int a = sc.nextInt();
      System.out.println("The limit of input array is  :"+a);

        int[] array= new int[10];
        System.out.println("Enter the array:");
        for (int i=0;i<a;i++)
        {
          //reading elements from the user
          array[i]=sc.nextInt();
        }
        //Accessing elemnts using the for loop
        System.out.println("Array elements are");
        for (int i=0;i<a;i++)
        {
            System.out.println(array[i]);
        }

        sc.close();

        }
    }
