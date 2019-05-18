package com.sda.algorytmy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int i = 1;
        int suma = 0;


        while (i <= x / 2) {
            if (x % i == 0) {
                suma += i;
            }
            i++;
        }
        if ( suma == x){
            System.out.println(x + " jest liczba doskonala");
        }else {
            System.out.println(x + " nie jest liczba dsokonala");
        }
    }
}

