package Ex_20th_July;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number1");
        int num1=sc.nextInt();
        System.out.println("Enter a number2");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println("greater number is " +num1);
        }else{
            System.out.println("greater num1 is " +num2);
        }
    }
}
