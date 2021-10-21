package com.company;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj) {
        int suma = 0;
        do {
            suma += broj%10;
            broj /= 10;
        } while(broj > 0);
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
     Scanner unos = new Scanner(System.in);
     int n = unos.nextInt();
     for(int i = 1; i <= n; i++) {
         if(i%sumaCifara(i) == 0) System.out.printf("%d ", i);
     }

    }
}
