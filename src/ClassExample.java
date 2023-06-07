import java.util.Scanner;

public class ClassExample {
    public static void main(String[] args) {
        System.out.println("Type you Age:");
        //Scanner edad = new Scanner(System.in);
        //String strNum = edad.nextLine();
        String strNum = new Scanner(System.in).nextLine();
        Integer  num = Integer.parseInt(strNum);
        Integer edad = 30;

        if(edad >= 18) {
            System.out.println("Es mayor de edad");
        } else if (edad > 18 && edad <=30) {
            System.out.println("Adulto Joven");
        } else {
            System.out.println("Es menor de edad");
        }

        Integer edad2 = 24;
        boolean esMayor = edad2 >= 18 && edad >= 70;
        boolean esMayor2 = ! (edad2 < 18 || edad2 >= 70);
        System.out.println(edad2);

        //Mayor a 30 -> obesidad.
        //25 y 30 -> sobrepeso.
        //entre 18.5 y 25 -> normal.
        //menor a 18.6 -> debajo de lo normal.
    }
}