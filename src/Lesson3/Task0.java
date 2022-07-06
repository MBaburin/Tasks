package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int a = sc.nextInt();
        int mass[] = new int[a];

        for (int i = 1; i < a; i++) {
            mass[i] = r.nextInt();
            System.out.println(mass[i]);
        }

    }
}