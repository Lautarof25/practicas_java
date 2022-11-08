package Ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ejercicio 1");
        System.out.println("Ingrese un número ");
        int num = scaner.nextInt();
        boolean resultado = num % 2 == 0;
        if (resultado)
            System.out.println(num+" Es divisible por dos");
        else
            System.out.println(num+" No es divisible por dos");
        System.out.println("Ejercicio 2");
        int i = 1;
        while(i <= 100) {
            System.out.println(i);
            i++;
        }
        System.out.println("Ejercicio 3");
        for(int x = 1;x <= 100;x++)
            System.out.println(x);
        System.out.println("Ejercicio 4");
        for(int x = 1;x <= 100;x++) {
            if (x % 2 == 0 || x % 3 == 0)
                System.out.println(x);
        }
    }
}
