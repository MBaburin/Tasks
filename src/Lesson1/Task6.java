package Lesson1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();

        if(a>b){
            System.out.println(a + "Больше");
        }else {
            System.out.println(b + "Больше");
        }
    }
}
