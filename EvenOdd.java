// Program to find even or odd number using if else

import java.util.Scanner;

public class EvenOdd {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("The number " + num + " is even.");
        }
        else{
            System.out.println("The number " + num + " is odd.");
        }
    }
}
