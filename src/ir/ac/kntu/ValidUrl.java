package ir.ac.kntu;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        scanner.close();
        String regex = "https?:\\/\\/[a-z]+(\\.[a-z]+){1,3}(\\/\\?|(\\/[a-z]+){0,5}\\?|(\\/[a-z]+){0,5}$)($|email=[a-zA-Z][a-zA-Z0-9.]+@[a-z]+\\.[a-z]+|mobile=09[0-9]{9}|stNo=(99|400|401|402)[0-9]{5,6}|\\w+=\\w+)(&(email=[a-zA-Z][a-zA-Z0-9.]+@[a-z]+\\.[a-z]+|mobile=09[0-9]{9}|stNo=(99|400|401|402)[0-9]{5,6}|\\w+=\\w+))*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        if(matcher.matches()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
