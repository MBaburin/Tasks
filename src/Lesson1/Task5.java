package Lesson1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();
        int c;
        c = sc.nextInt();
        int counter1 = 0;
        int counter2 = 0;

        if (a >0){
            counter1++;
        } else {
            counter2++;
        }

        if (b >0){
            counter1++;
        } else {
            counter2++;
        }

        if (c >0){
            counter1++;
        } else {
            counter2++;
        }

        System.out.println(counter1 + " Положительных");
        System.out.println(counter2 + " Отрицателоьных");
    }
}
