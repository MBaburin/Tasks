package Lesson14;

import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args){
        System.out.println(Pattern.matches("[a-z1-9]{1,3}.[a-z1-9]{1,3}[@mail].[a-z]{1,3}","t1e.st@.ru"));
    }
}
