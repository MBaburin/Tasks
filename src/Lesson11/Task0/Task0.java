package Lesson11.Task0;

import java.io.*;

public class Task0 {
        public static void main(String[] args) throws IOException {
            StringBuilder sb;
            BufferedReader br = new BufferedReader(new FileReader("src/Lesson11/Task0/words.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/Lesson11/Task0/palindrome.txt"));
            String string;
            while ((string = br.readLine()) != null) {
                sb = new StringBuilder(string);
                if (sb.reverse().toString().equals(string)) {
                    bw.write(string + "\n");
                }
            }
            br.close();
            bw.close();
        }

}
