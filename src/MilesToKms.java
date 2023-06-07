//Pídele al usuario que ingrese una distancia en millas.
//Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
//Muestra la distancia en kilómetros al usuario.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MilesToKms {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        System.out.println("Let's convert a distance in \"miles\" to \"kms\"!\nPlease, type a distance in Miles:");
        String strNum = buffer.readLine();
        Double num = Double.parseDouble(strNum);

        MilesToKms.milesToKms(num);

    }

    private static void milesToKms(Double num) {
        if(num > 0) {
            System.out.println(num + " miles equals: " + (num * 1.60934) + " kms.");
        } else if(num == 0) {
            System.out.println("Please, type a number bigger than \"0\"!");
        } else {
            System.out.println("Please, type a positive number!");
        }
    }
}
