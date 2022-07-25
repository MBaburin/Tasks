package Lesson14;

import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args){
        System.out.println(Pattern.matches("\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}","255.255.255.0"));
    }
}
