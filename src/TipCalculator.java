//Pídele al usuario que ingrese el total de la cuenta en un restaurante.
//Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
//Calcula el monto de la propina utilizando la fórmula:
// propina = totalCuenta * (porcentajePropina / 100).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TipCalculator {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        System.out.println("You've finished your dinner in a restaurant, so you're just about to paying for it.\n" +
                "Type the total cost of your restaurant receipt:");
        String strNum = buffer.readLine();
        Double num = Double.parseDouble(strNum);
        Double receiptNum = TipCalculator.receiptNum(num);

        if(receiptNum > 0) {
            System.out.println("Type the percent of your tip you want to give to the waiter, just the number:");
            strNum = buffer.readLine();
            num = Double.parseDouble(strNum);

            Double tipNum = TipCalculator.tipNum(num);

            TipCalculator.paying(receiptNum, tipNum);
        }
    }

    private static Double receiptNum(Double num) {
        Double receipt = 0.0;
        if(num > 0) {
            receipt = num;
        } else if(num == 0) {
            System.out.println("Please, type a \"receipt\" number bigger than 0!");
        } else {
            System.out.println("Please, type a positive \"receipt\" number!");
        }
        return receipt;
    }

    private static Double tipNum(Double num2) {
        Double tip = 0.0;
        if(num2 > 0) {
            tip = num2;
        } else if(num2 == 0) {
            System.out.println("Please, type a \"tip\" number bigger than 0!");
        } else {
            System.out.println("Please, type a positive \"tip\" number!");
        }
        return tip;
    }

    private static void paying(Double receiptNum, Double tipNum) throws IOException {
        Double tip = receiptNum * (tipNum / 100);
        Double totalPurchase = receiptNum + (receiptNum * tipNum / 100);

        if(receiptNum > 0 && tipNum > 0) {
            InputStreamReader keyboardCapture = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(keyboardCapture);

            System.out.println("You've chosen a tip of: " + tipNum + "%. Your receipt dinner is: $" + receiptNum + " dollars.\n" +
                    "You must gave to the waiter: $" + tip + " dollars.\n---TOTAL PURCHASE---\n $" + totalPurchase + " dollars\n--------------------\n" +
                    "Press \"1\" to pay, press \"0\" to quit:");

            String strNum = buffer.readLine();
            Integer num = Integer.parseInt(strNum);

            if(num == 1) {
                System.out.println("Your receipt was payed successful!\nThank you for using this service.");
            } else if(num == 0) {
                System.out.println("Your payed was canceled.\nThank you for using this service.");
            } else {
                System.out.println(null + " value.");
            }
        }
    }
}
