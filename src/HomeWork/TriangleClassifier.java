package HomeWork;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Length ");
        int length1 = sc.nextInt();

        System.out.println("Enter the second Length ");
        int length2 = sc.nextInt();

        System.out.println("Enter the Third Length ");
        int length3 = sc.nextInt();

        if(length1==length2 && length1==length3 ){
            System.out.println("Triangle is equilateral ");
        }
        else if(length1==length2 ||length2==length3 ||length1==length3){
            System.out.println("Triangle is isosceles");
        }
        else {
            System.out.println("Triangle is scalene ");
        }

    }
}
