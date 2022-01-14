package homework.task15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class task15 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Palindrome");
        String text = reader.readLine();
        text = text.replace(" ","");

        String reverse = "";
        for (int i = text.length() - 1; i >= 0 ; i--) {
            reverse += text.charAt(i);
            System.out.println(reverse);
        }
        boolean palindrome = true;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }

        if(palindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }



    }
}
