import java.util.*;

public class SecondClass {
    public static void main(String[] args) {
        String phrase = "Reverse Me If You Can";//
        reversewordsStack(phrase);

        System.out.print("\n");

        String[] reversedArray = reversewords(phrase);
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        // phrase = "Reverse Me If You Can";
        ArrayList<String> saperate = split(phrase);

        System.out.print("\n[");

        for (int i = 0; i < saperate.size(); i++) {
            System.out.print('"' + saperate.get(i) + '"');
            if (i < saperate.size() - 1) {
                System.out.print(',');
            }
        }
        System.out.print(']');

        ArrayList<String> parts = splitting(phrase);

        System.out.print("\n[");

        for (int i = 0; i < parts.size(); i++) {
            System.out.print('"' + parts.get(i) + '"');
            if (i < saperate.size() - 1) {
                System.out.print(',');
            }
        }

        System.out.print(']');

    }

    public static void reversewordsStack(String phrase) {
        String[] wordArray = phrase.split(" ");
        Stack<String> reverseWordsStack = new Stack<>();

        for (int i = 0; i < wordArray.length; i++) {
            reverseWordsStack.push(wordArray[i]);
        }
        while (!reverseWordsStack.empty()) {
            System.out.print(reverseWordsStack.pop() + " ");
        }
    }

    public static String[] reversewords(String phrase) {
        String[] wordArray = phrase.split(" ");
        String[] reversedArray = new String[wordArray.length];

        for (int i = wordArray.length - 1, j = 0; i >= 0; i--, j++) {
            // Add each element to the new array
            reversedArray[j] = wordArray[i];
        }

        return reversedArray;
    }

    public static ArrayList<String> split(String str) {
        ArrayList<String> parts = new ArrayList<>();
        int startIndex = 0;
        int endIndex;
        while ((endIndex = str.indexOf(" ", startIndex)) != -1) {
            parts.add(str.substring(startIndex, endIndex));
            startIndex = endIndex + 1;
        }
        parts.add(str.substring(startIndex));

        return parts;
    }

    public static ArrayList<String> splitting(String str) {
        ArrayList<String> parts = new ArrayList<>();

        char[] chars = str.toCharArray();
        int startIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                parts.add(new String(chars, startIndex, i - startIndex));
                startIndex = i + 1;
            }
        }
        parts.add(new String(chars, startIndex, chars.length - startIndex));
        return parts;
    }
}
