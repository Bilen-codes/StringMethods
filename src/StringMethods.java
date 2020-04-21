/*This program will accpet a word and index number from the user,
* Then returns the length of the word along with the sublength word from the index.*/
import java.util.Scanner;
public class StringMethods {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String word;
        int lenSub;
        int lengthWord;
        String subString = "";
        System.out.println("Enter a word");
        word =  sc.next();

        System.out.println("Enter a number as an index");
        lenSub = sc.nextInt();

        lengthWord = word.length();

        //check the index will not give index out of bound.
        if (( lengthWord - 1) <lenSub){
            System.out.println("The index you put is too big ");
            System.exit(0);
        }
        else {
            subString = word.substring(0, lenSub );
        }

        System.out.println("The length of " + word+ " is: "+ lengthWord);
        System.out.println("The substring from 0 to " + lenSub + " is: " + subString);






    }
}
