import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
    public void anagram(String string1, String string2){
         string1 = string1.toLowerCase();
         string2 = string2.toLowerCase();

         if(string1.length() == string2.length()){

             char[] charsArray1 = string1.toCharArray();
             char[] charsArray2 = string2.toCharArray();

             //sort the char array
             Arrays.sort(charsArray1);
             Arrays.sort(charsArray2);

             boolean result = Arrays.equals(charsArray1,charsArray2);
             if(result) {
                 System.out.println(string1 + " and " + string2 + " are anagram.");
             }
                else {
                    System.out.println(string1 + " and " + string2 + " are not anagram.");
                }
         }
    }
    public static void main(String[] args) {
        AnagramDetection anagramProblem = new AnagramDetection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter here the two strings:");
        String string1 = scanner.next();
        String string2 = scanner.next();
        anagramProblem.anagram(string1,string2);
     }
}
