package Ex_20th_July;

import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a score");
        int score=sc.nextInt();

        char grade='F';
        // 2. Basic Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or orint grade - B
        // else if score <=79 && score >= 70 -> return or orint grade - C

        if(score>=90 && score<=100){
            grade ='A';
        } else if(score <=89 && score >=80){
            grade = 'B';
        }else if(score <= 79 && score >=70){
            grade = 'C';
        }else{
            grade = 'F';
        }
        System.out.println("your grade is "+grade);
    }
}
