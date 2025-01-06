// Program to reverse a num

import java.util.Scanner;

public class ReverseNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be reversed: ");
        int num = sc.nextInt();

        int rev = 0;

        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        System.out.println("The reverse of a number  is " + rev);
    }
}
