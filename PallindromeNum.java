// Program to check whether the number is pallindrome or not.

import java.util.Scanner;

public class PallindromeNum {
    
    public static int isPallindrome(int num){
        int rev = 0;

        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        return rev;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        int reverseNum = isPallindrome(num);

        if(reverseNum==num){
            System.out.println("THe number " + num + " is pallindrome.");
        }
        else{
            System.out.println("The number " + num + " is not a pallindrome.");
        }



    }
}
