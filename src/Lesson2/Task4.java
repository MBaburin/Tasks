package Lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] src){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =0;

        for(int i =1; i<=a; i++){
            c = c+=b;
            System.out.println(c);
        }
    }
}
