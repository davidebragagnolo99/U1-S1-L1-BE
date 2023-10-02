import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
       // perimetroRettangolo();
       // pariDispari();
    }
    public static void perimetroRettangolo() {
        Scanner userCalc = new Scanner(System.in);
        System.out.println("Inserisci un numero!");
        double num1 = userCalc.nextDouble();
        System.out.println("Inserisci un altro numero!");
        double num2 = userCalc.nextDouble();
        double resultDouble = (num1+num2)*2;
        System.out.println("Il perimetro del rettangolo è: " + resultDouble);
        userCalc.close();
    }

    public static void pariDispari() {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int numero = in.nextInt();
        if (numero % 2 == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        in.close();
    }
}
