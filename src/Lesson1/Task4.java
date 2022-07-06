package Lesson1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int a;
        a = sc.nextInt();
        if (a > 0){
            counter++;
        }
        int b;
        b = sc.nextInt();
        if (b > 0){
            counter++;
        }
        int c;
        c = sc.nextInt();
        if (c > 0){
            counter++;
        }
        System.out.println(counter + " Положительных");
    }
}
