//Pídele al usuario que ingrese la edad de su perro.
//Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DogAge {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        System.out.println("Let's calculate your dog's age as a human being!\nType your pet age:");
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);

        DogAge.dogAge(num);

    }

    private static void dogAge(Integer num) {
        Integer humanAge = 7;
        if(num > 0) {
            System.out.println("Your dog's age as a human being is \"" + num * humanAge + "\" years old.");
        } else if(num == 0) {
            System.out.println("Please, type a value bigger than \"0\"!");
        } else {
            System.out.println("Please, type a positive number!");
        }
    }
}
