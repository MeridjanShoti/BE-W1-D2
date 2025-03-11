package it.epicode.esercizio1;

import java.util.Scanner;

public class Esercizio1 {
    static boolean pariDispari(String str) {
        if (str.length() % 2 == 0) return true;
        else return false;
    }

    static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) return true;
                else return false;
            } else return true;
        }else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una stringa per verificare se ha un numero di lettere è pari");
        String str = scanner.nextLine();
        System.out.println("pari? "+pariDispari(str));
        System.out.println("inserisci un anno per verificare se è bisestile");
        int anno = scanner.nextInt();
        System.out.println("bisestile? "+annoBisestile(anno));


    }
}
