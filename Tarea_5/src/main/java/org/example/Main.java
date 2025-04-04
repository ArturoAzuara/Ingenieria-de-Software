package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int opcion = 0;
        Store store = new Store();
        store.menu();
        opcion = key.nextInt();

        Imprenta imprenta = ImprentaFactory.getImprenta(opcion);
        System.out.println(imprenta);
    }
}