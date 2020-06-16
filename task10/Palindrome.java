package task10;

public class Palindrome{

    public static void palindromeString(String s){

        String palindrome = new StringBuffer(s).reverse().toString();

        if(s.equalsIgnoreCase(palindrome)){
            System.out.println(s + " is a palindrome");
        }else{
            System.out.println(s + " is not a palindrome");
        }
    }
 }