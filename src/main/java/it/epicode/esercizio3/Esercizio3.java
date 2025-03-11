package it.epicode.esercizio3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("inserisci una stringa");
            String str = scanner.nextLine();
            if(!str.equals(":q")) {
                System.out.println();
                for(int i = 0; i<str.length()-1; i++) {
                    System.out.print(str.charAt(i) + ", ");
                }
                System.out.println(str.charAt(str.length()-1));
            }else {
                run = false;
            }
        }
        scanner.close();
    }
}
