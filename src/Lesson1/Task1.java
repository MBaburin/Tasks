package Lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();

        if (a>0){
            System.out.println(a +"Положительное");
        } else{
            System.out.println(a +"Отрицательное");
        }

        if (a > 9 && a <100){
            System.out.println(a +"двузначное");
        } else if (a > 100){
            System.out.println(a +"трехзначное");
        } else if (a < 9){
            System.out.println(a +"однозначное");
        }



    }
}
