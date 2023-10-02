public class Esercizio1 {
    public static void main(String[] args) {
        System.out.println("Il risultato è: " + moltiplica(2,3));
        System.out.println(concatena("ciao ", 1234));

        String[] array1 = {"primo", "secondo", "terzo", "quarto", "quinto"};
        String nuovaStringa = "sesto";
        String[] array2 = inserisciInArray(array1, nuovaStringa);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] + " ");
        }
    }
    public static int moltiplica (int num1, int num2) {
        return num1 * num2;
    }
    public  static  String concatena (String stringa, int num) {
        return stringa + num;
    }
    public  static String[] inserisciInArray (String[] array, String nuovaStringa) {
        String[] nuovoArray = new String[6];
        for (int i = 0; i < array.length; i++) {
            if (i < 3) {
                nuovoArray[i] = array[i];
            } else if (i == 3) {
                nuovoArray[i + 1] = array[i];
            } else {
                nuovoArray[i + 1] = array[i];
            }
        }
        nuovoArray[3] = nuovaStringa;
        return nuovoArray;
    }
}