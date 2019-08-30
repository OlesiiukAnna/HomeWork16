package home.Task_16;

public class Task_16_3 {
    public static void main(String[] args) {
        Task_16_3 instance = new Task_16_3();

        String[] words = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        System.out.println(instance.uniqueMorseRepresentations(words));
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                for (int i = 0; i < morseAlphabet.length; i++) {
                    if (letter == alphabet[i]) {
                        builder.append(morseAlphabet[i]);
                    }
                }
            }
            builder.append(" ");
        }

        String morseLine = builder.toString();
        String[] morseWords = morseLine.split("\\s");

        int result = 1;
        if (morseWords.length == 0) {
            result = 0;
        } else if (morseWords.length == 1) {
            return result;
        } else {
            for (int i = 0; i < morseWords.length - 1; i++) {
                if (!morseWords[i].equals(morseWords[i + 1])) {
                    result++;
                }
            }
        }
        return result;
    }
}
