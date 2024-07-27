package Ex_27th_July;

import java.util.Scanner;

public class Array002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int [] marks=new int[6];
//        System.out.println("Enter marks of sub1");
//        marks[0]= sc.nextInt();
//        System.out.println("Enter marks of sub2");
//        marks[1]= sc.nextInt();
//        System.out.println("Enter marks of sub3");
//        marks[2]= sc.nextInt();
//        System.out.println("Enter marks of sub4");
//        marks[3]= sc.nextInt();
//        System.out.println("Enter marks of sub5");
//        marks[4]= sc.nextInt();
//        System.out.println("Enter marks of sub6");
//        marks[5]= sc.nextInt();
        for(int i=0;i< marks.length;i++){
            System.out.println(" Marks of subject "+(i+1));
            marks[i]=sc.nextInt();
        }

        float avg=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5])/6;
        System.out.println("Avg is ->" +avg);

    }
}
