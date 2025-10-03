package Task14;

        //Дана строка s, состоящая из слов и пробелов. Верните длину последнего слова в строке.
        //Слово — это максимальная подстрока, состоящая только из символов, не являющихся пробелами.

import java.util.regex.*;

public class Task14 {

    public static void main (String[] args){
        String input = "Hello world! Alloha Grodno!";

        Pattern p = Pattern.compile("[^\s]+$");
        Matcher m = p.matcher(input);

        if (m.find()) {
            System.out.println("Последнее слово: " + m.group());
        }

    }
}
