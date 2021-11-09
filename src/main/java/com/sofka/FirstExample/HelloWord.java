package com.sofka.FirstExample;

import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        String numeroStr = captura.nextLine();
        int numeroInt = Integer.parseInt(numeroStr);
        int i = numeroStr.length() - 1;
        int formaNumerica = 0,formaNumerica2 = 0;
        String formaString = "",formaString2 = "";




        while (i > -1) {
            //Forma 1: recorriendo String
            formaString = formaString + Character.getNumericValue(numeroStr.charAt(i));
            formaNumerica = formaNumerica + Character.getNumericValue(numeroStr.charAt(i));
            //Forma 2: Residuo
            formaString2 = formaString2 + numeroInt % 10;
            formaNumerica2 = formaNumerica2 + numeroInt % 10;
            numeroInt = numeroInt / 10;
            i--;
        }
        System.out.println("Forma 1: Recorriendo un String\n" +
                formaNumerica + "\n" +
                formaString2 + "\n" +
                "Forma 2: Tomando el residuo de un int\n" +
                formaNumerica2 + "\n" +
                formaString2
        );
    }
}
