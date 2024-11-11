import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        run();
    }

    private static String getWord(String wordNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + wordNumber + ": ");
        return scanner.nextLine();
    }

    private static int vowelIndex(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }

    private static void run() {
        String word1 = getWord("Word 1");
        String word2 = getWord("Word 2");

        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

        if (index1 <= 0 || index2 <= 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            String spoonerizedWord1 = word2.substring(0, index2) + word1.substring(index1);
            String spoonerizedWord2 = word1.substring(0, index1) + word2.substring(index2);

            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
    }
}
