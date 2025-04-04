package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Store store = new Store();
        store.menu();
        opcion = scanner.nextInt();

        Imprenta imprenta = ImprentaFactory.getImprenta(opcion);
        System.out.println(imprenta);
    }
}