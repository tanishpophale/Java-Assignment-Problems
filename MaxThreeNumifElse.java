// Program to find max of three numbers using if else

import java.util.Scanner;

public class MaxThreeNumifElse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first no: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second no: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third no: ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("The largest number is: " + num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("The largest number is: " + num2);
        }
        else{
            System.out.println("The largest number is: " + num3);
        }
    }
}
