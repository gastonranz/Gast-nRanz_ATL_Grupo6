//Genera un número aleatorio entre 1 y 10. Pídele al usuario que adivine el número.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessYourNumber {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        System.out.println("Try to guess a number between 1 & 10!\nType your number between 1 & 10:");
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);

        Double randomNum = GuessYourNumber.randomNumber();
        GuessYourNumber.result(num, randomNum);

    }
    private static Double randomNumber() {
        return Math.ceil(Math.random() * 3);
    }

    private static void result(Integer num, Double randomNum) {
        Integer finalNum = randomNum.intValue();

        if(num > 0 && num <= 10) {
            if(finalNum == num) {
                System.out.println("Congratulations! You've won!");
                System.out.println("\n--- The Random number was: " + randomNum.intValue() + " ---");
            } else {
                System.out.println("Sorry, you've lost. Try it again!");
                System.out.println("\n--- The Random number was: " + randomNum.intValue() + " ---");
            }
        } else if(num > 10) {
            System.out.println("Please, type a number between 1 & 10!");
        } else if(num == 0) {
            System.out.println("Please, type a number bigger than \"0\"!");
        } else {
            System.out.println("Please, type a positive number!");
        }
    }
}
