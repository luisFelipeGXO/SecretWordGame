
public class Main {
    public static void main(String[] args) {

        SecretWord secretWord = new SecretWord("JAVA");
        Player player = new Player(6);

        while (player.getRemainingAttempts() > 0 && !secretWord.allLettersDiscovered("")) {
            System.out.println("Word: " + secretWord.getCurrentWord(""));
            System.out.println("Remaining attempts: " + player.getRemainingAttempts());

            char letter = player.makePlay();

            if(secretWord.containsLetter(letter)) {
                System.out.println("Correct letter!");
            } else {
                System.out.println("Incorrect.");
                player.reduceAttempts();
            }
        }

        String currentWord = secretWord.getCurrentWord("");

        if (secretWord.allLettersDiscovered("")) {
            System.out.println("Parabéns, você ganhou! A palavra é: " + secretWord.getCurrentWord(""));
        } else {
            System.out.println("Game over! A palavra era: " + secretWord);
        }
    }
}