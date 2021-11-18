package day04.hangman;

import java.util.Scanner;

public class HangmanMain {

    private String wordToFind = "alma";
    private String wordFound = "_".repeat(wordToFind.length());
    private int chances = 8;

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        do {
            printMainText();
            String guess = getGuessFromUser();

            if ((guess.length() == 1) && (wordToFind.contains(guess))) {
                System.out.println("Jó tipp!");
                wordFound = updateWordFound(wordToFind, wordFound, guess);
            } else {
                System.out.println("Rossz válasz!");
                chances--;
            }
        } while (!wordToFind.equals(wordFound) && chances > 0);

        printResult();
    }

    private void printMainText() {
        StringBuilder text = new StringBuilder("");
        text.append("Itt tartasz: ").append(wordFound).append("\n");
        text.append("Ennyi tipped van hátra: ").append(chances).append("\n");
        text.append("Mi a következő tipped?");
        System.out.println(text);
    }

    private String getGuessFromUser() {
        Scanner sc = new Scanner(System.in);
        String guess = sc.nextLine();
        return guess;
    }

    private void printResult () {
        if (wordToFind.equals(wordFound)) {
            System.out.println("Nyert!");
        } else
            System.out.println("Vesztetél!");
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }
}

