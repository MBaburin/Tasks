package Lesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();
        int c;
        c = sc.nextInt();

        if(c > (a+b)){
            System.out.println("Не Существует");
        } else if (a > (c+b)){
            System.out.println("Не Существует");
        } else if (b > (a+b)){
            System.out.println("Не Существует");
        } else {
            System.out.println("Существует");
        }
    }
}

