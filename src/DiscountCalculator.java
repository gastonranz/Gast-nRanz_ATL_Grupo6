//Pídele al usuario que ingrese el precio original de un producto.
//Pídele al usuario que ingrese el porcentaje de descuento.
//Calcula el precio final después de aplicar el descuento utilizando la fórmula:
//precioFinal = precioOriginal - (precioOriginal * descuento / 100).
//Muestra el precio final al usuario.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiscountCalculator {
     public static void main(String[] args) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        System.out.println("You're just about buying a new product.\nPlease, type its price:");
        String strNum = buffer.readLine();
        Double num = Double.parseDouble(strNum);

        Double finalNum = DiscountCalculator.positiveNum(num);

        if(finalNum > 0) {
            System.out.println("Great! Now type the discount you want on this product:");
            String strNum2 = buffer.readLine();
            Integer num2 = Integer.parseInt(strNum2);

            Integer finalNum2 = DiscountCalculator.positiveNum2(num2);

            DiscountCalculator.finalPrice(finalNum, finalNum2);
        }
    }
    private static Double positiveNum(Double num) {
         Double finalNum = 0.0;

        if(num > 0) {
            finalNum = num;
        } else if(num == 0) {
            System.out.println("Please, type a \"product price\" number bigger than 0!");
        } else {
            System.out.println("Please type a positive \"product price\" number!");
        }
        return finalNum;
    }
    private static Integer positiveNum2(Integer num2) {
        Integer finalNum2 = 0;

        if(num2 > 0) {
            finalNum2 = num2;
        } else if(num2 == 0) {
            System.out.println("Please, type a \"discount\" number bigger than 0!");
        } else {
            System.out.println("Please, type a positive \"discount\" number!");
        }
        return finalNum2;
    }

    private static void finalPrice(Double finalNum, Integer finalNum2) {
        if(finalNum > 0 && finalNum2 > 0) {
            System.out.println("Your product is: $" + finalNum + " dollars. Your discount is " + finalNum2 + "%.\nYour final price is: $" +
                    (finalNum - (finalNum * finalNum2 / 100)) + " dollars.\n----Thank you!----");
        }
    }
}
