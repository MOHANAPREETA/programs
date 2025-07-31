package first;
import java.util.*;
public class availableanagram {

	public static void main(String[] args) {
		String sentence = "I am Lord Voldemort Tom Marvolo Riddle";
        findAnagrams(sentence);
    }

    public static void findAnagrams(String sentence) {
        // Remove punctuation and convert to lowercase
        sentence = sentence.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isAnagram(words[i], words[j])) {
                    System.out.println("Anagrams: " + words[i] + " and " + words[j]);
                }
            }
        }
    }

    public static boolean isAnagram(String word1, String word2) {
        // Check if both words have the same length
        if (word1.length() != word2.length()) {
            return false;
        }

        // Sort the characters in both words
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }






		

	}


