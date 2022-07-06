package Lesson1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if (a>0){
            System.out.println(a+1);
        } else if (a < 0){
            System.out.println(a-2);
        } else if (a == 0){
            System.out.println(a + 10);
        }
    }
}
