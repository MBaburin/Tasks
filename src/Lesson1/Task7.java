package Lesson1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a == 1){
            System.out.println(a + " программист");
        } else if (a >= 2 && a <= 4){
            System.out.println(a + " программиста");
        } else if (a > 4){
            System.out.println(a + " программистов");
        }
    }
}
