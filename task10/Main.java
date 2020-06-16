package task10;

import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner str = new Scanner(System.in);
        System.out.println("Enter a string to operate with: ");
		String s = str.next();

        /*
         * Check if the entered string is a palindrome.
         */
        if(s.length() != 5){
			String mess = "The word has to consist of 5 letters only";
            try {
                throw new CountOfPalindromeWord(mess);
            } catch (CountOfPalindromeWord countOfPalindromeWord) {
                countOfPalindromeWord.printStackTrace();
            }
        }else {
			Palindrome.palindromeString(s);
		}

        /*
         * Replacing vowels using two ways.
         */
		FindVowel fv = new FindVowel();

		fv.charReplaceThroughBuffer(s);

		fv.charReplaceThroughCharArray(s);

		str.close();

        /*
         * This text has to be used for two tasks:
         * @see{CountChars: class} count of word in the text
         *
         * @see{RepeatedWords: class} count the repeated words in the text.
         *
         */
        String text = "Це зручний інструмент для макетів. Це допомагає намітити візуальні елементи в документ або презентацію, наприклад, друкарня, шрифт, або макет. Lorem Ipsum в основному частиною латинського тексту за класичною автор і філософа Цицерона. Це слова і букви були змінені додаванням або видаленням, так навмисно роблять його зміст безглуздо, це не є справжньою, правильно чи зрозумілою Латинської більше.";

        // Count words in string.
        CountWords cw = new CountWords();
        cw.cw(text);

        // Find repeated words.
        RepeatedWords rw = new RepeatedWords();
		rw.repWord(text);

    }
}
