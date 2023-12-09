/*
 * Author: Luís Felipe
 * Objective: This class has the objective to create a word and verify if each
 * letter called by the user is in the word.
 */

public class SecretWord {
    private String word;

    public SecretWord(String word) {
        this.word = word.toUpperCase();
    }

    public boolean containsLetter(char letter) {
        return word.indexOf(letter) != -1;
    }

    public String getCurrentWord(String discoveredLetters) {
        StringBuilder currentWord = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (discoveredLetters.indexOf(c) != -1) {
                currentWord.append(c);
            } else {
                currentWord.append("_");
            }
        }
        return currentWord.toString();
    }

    public boolean allLettersDiscovered(String discoveredLetters) {
        for (char c : word.toCharArray()) {
            if (discoveredLetters.indexOf(c) == -1 && c != ' ') {
                return false;
            }
        }
        return true;
    }
}
