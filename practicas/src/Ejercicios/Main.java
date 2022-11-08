package Ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.checkedCollection;
import static java.util.Collections.reverseOrder;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ejercicio 1");
        System.out.println("Ingrese un número ");
        int num = scaner.nextInt();
        boolean resultado = num % 2 == 0;
        if (resultado)
            System.out.println(num + " Es divisible por dos");
        else
            System.out.println(num + " No es divisible por dos");
        System.out.println("Ejercicio 2");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        System.out.println("Ejercicio 3");
        for (int x = 1; x <= 100; x++)
            System.out.println(x);
        System.out.println("Ejercicio 4");
        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0 || x % 3 == 0)
                System.out.println(x);
        }
        System.out.println("Ejercicio 5");
        int num1 = 55;
        int num2 = 67;
        if (num1 > num2)
            System.out.println(num1 + " es mayor a " + num2);
        else if (num2 > num1)
            System.out.println(num2 + " es mayor a " + num1);
        else
            System.out.println("son iguales");

        System.out.println("Ejercicio 6");
        int numero;
        do {
            System.out.println("Ingrese un numero mayor o igual a 0");
            numero = scaner.nextInt();
        } while (numero < 0);
        System.out.println("El numero elegido es " + numero);
        System.out.println("Ejercicio 7");
        System.out.println("Ingrese un día");
        byte dia = scaner.nextByte();
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es un día laboral");
                break;
            case 6:
            case 7:
                System.out.println("No es un día laboral");
                break;
            default:
                System.out.println("Error");
        }
        System.out.println("Ejercicio 8");
        int entero_positivo;
        do {
            System.out.println("Ingresa un numero entero positivo");
            entero_positivo = scaner.nextInt();
        } while (entero_positivo < 0);
        String cifras = String.valueOf(entero_positivo);
        System.out.println("El numero " + entero_positivo + " tiene " + cifras.length() + " cifras");
        System.out.println("Ejercicio 9");
        int[] numeros = new int[100];
        int suma = 0;
        int promedio = 0;
        int y = 1;
        int z;
        for (z = 0; z < 100; z++) {
            numeros[z] = y;
            y = z + 1;
            suma += y;
        }
        promedio = suma / 100;
        System.out.println("La suma de todos los numero es " + suma);
        System.out.println("El promedio de todos los numero es " + promedio);
        System.out.println("Ejercicio 10");
        System.out.println("Ingrese una cadena");
        String frase = scaner.nextLine();

        char[] arrayChar = new char[frase.length()];
        for (int p = 0; p < frase.length();p++){
            arrayChar[p] = frase.charAt(p);
        }

        System.out.println("Ejercicio 11");
        int[] numeros_2 = {1,2,3,4,5};
        int[] numeros_copia = new int[5];

        for (int d = 0; d < numeros_2.length; d++){
            numeros_copia[d] = numeros_2[numeros_2.length-d-1];
        }
        System.out.println("Ejercicio 12");
        int[] num_arr = {5,6,2,10,1};
        Arrays.sort(num_arr);
        for (int j = 0; j < num_arr.length; j++) {
            System.out.println(num_arr[j]);
        }
        System.out.println("Ejercicio 13");
        int un_numero = 25;
        boolean esPar = un_numero % 2 == 0;
        if(esPar)
            System.out.println(un_numero+" es par");
        else
            System.out.println(un_numero+" NO es par");
        System.out.println("Ejercicio 14");
        un_numero = 45;
        boolean esMultiplo10 = un_numero % 10 == 0;
        if(esMultiplo10)
            System.out.println(un_numero+" es multiplo de 10");
        else
            System.out.println(un_numero+" NO es multiplo de 10");
        System.out.println("Ejercicio 15 - Es primo");
        do {
            System.out.println("Ingrese un numero del 1 al 30 ");
            un_numero = scaner.nextInt();
        }while (un_numero <= 0 || un_numero >= 30);
        boolean esPrimo = true;
        for (int j = 2; j < un_numero; j++) {
            if(un_numero % j == 0) {
                esPrimo = false;
                break;
            }
        }
        if(esPrimo)
            System.out.println(un_numero+" Es primo");
        else
            System.out.println(un_numero+" NO Es primo");

        System.out.println("Ejercicio 16 - dia semana");
        do {
            System.out.println("Ingrese un numero del 1 al 7");
            un_numero = scaner.nextInt();
        }while (un_numero <= 0 || un_numero >= 8);
        // El día de la semana comienza con 1 para lunes
        switch (un_numero){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miércoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sábado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
        }
        System.out.println("Ejercicio 17 - numeros menor a mayor");
        int[] seis_numeros = {12,42,36,99,-14,83};
        int chico = seis_numeros[0];
        int grande = seis_numeros[0];
        for (int j = 0; j < seis_numeros.length; j++) {
            if(seis_numeros[j] < chico ){
                chico = seis_numeros[j];
            }
            if(seis_numeros[j] > grande ){
                grande = seis_numeros[j];
            }
        }
        System.out.println("El numero más grande es "+ grande);
        System.out.println("El numero más chico es "+ chico);
        Arrays.sort(seis_numeros);
        for (int j: seis_numeros) {
            System.out.print(j+" ");
        }
        int[] numerosReversa = new int[6];
        for (int j = 0; j < seis_numeros.length; j++){
            numerosReversa[j] = seis_numeros[seis_numeros.length-j-1];
        }
        System.out.println();
        for (int n : numerosReversa){
            System.out.print(n+" ");
        }
        System.out.println("Ejercicio 18 ");
        num1 = 28;
        num2 = 14;
        int num3 = 2;
        boolean tercero_mult_1y2 = num1 * num2 == num3;
        boolean tercero_div_1y2 = num1 / num2 == num3;
        boolean tercero_mod_1y2 = num1 % num2 == num3;
        if(tercero_div_1y2){
            System.out.println("El tercero es igual a la división del primero y segundo");
        } else if (tercero_mult_1y2) {
            System.out.println("El tercero es igual a la multiplicación del primero y segundo");
        } else if (tercero_mod_1y2) {
            System.out.println("El tercero es igual al módulo del primero y segundo");
        }
        System.out.println("Ejercicio 19 ");
        System.out.println("KG a : \n 1- Hectogramos \n 2- Decagramos \n 3- Gramos \n 4- Decigramos \n 5- Centímgramos \n 6- Miligramos ");
        int conversion = scaner.nextInt();
        System.out.println("Ingrese los kilogramos");
        float kg = scaner.nextFloat();
        float total;
        switch (conversion){
            case 1:
                total = kg * 10;
                System.out.println(total+" hectogramos");
                break;
            case 2:
                total = kg * 100;
                System.out.println(total+" decagramos");
                break;
            case 3:
                total = kg * 1000;
                System.out.println(total+" gramos");
                break;
            case 4:
                total = kg * 10000;
                System.out.println(total+" decigramos");
                break;
            case 5:
                total = kg * 100000;
                System.out.println(total+" centigramos");
                break;
            case 6:
                total = kg * 1000000;
                System.out.println(total+" miligramos");
                break;
        }
        System.out.println("Ejercicio 20 ");

        String palabra = "Hola";
        for (char letra : palabra.toCharArray()){
            System.out.println(letra);
        }
        System.out.println("Ejercicio 21 ");
        int[][] bi = new int[10][10];
        int relleno = 1;
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                bi[j][k] = relleno;
                relleno++;
            }
        }
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.print(bi[j][k]+" ");
            }
            System.out.println("");
        }
        System.out.println("Ejercicio 22 ");
        System.out.println("Ingrese un numero para saber su cubo");
        int cubo = scaner.nextInt();
        System.out.println(Math.pow(cubo,3));
        System.out.println("Ejercicio 23 ");
        String texto;
        String nuevoTexto = "";
        do {
            System.out.println("Ingrese un texto ");
            texto = scaner.next();
            for (int j = texto.length()-1; j >= 0; j--){
                nuevoTexto+= texto.charAt(j);
            }
            if (!texto.equals("fin")) {
                System.out.println(nuevoTexto);
                nuevoTexto = "";
            }
        }while (!(texto.equals("fin")));
        System.out.println("Ejercicio 24 ");
        System.out.println("    *\n   ***\n  *****\n *******\n*********");
        System.out.println("Ejercicio 25 ");
        System.out.println("Ingrese la base de la escalera");
        int base = scaner.nextInt();
        String escalera = "";
        for (int j = 0; j < base; j++) {
            if(j % 2 == 0)
                escalera += "1 ";
            else
                escalera += "0 ";
            System.out.println(escalera);
        }
        System.out.println("Ejercicio 26 ");
        String password = "abc123";
        String confirmacion;
        boolean ok = false;
        int intentos = 0;
        do {
            System.out.println("Ingrese la contraseña");
            confirmacion = scaner.next();
            intentos++;
            if (confirmacion.equals(password))
                ok = true;
        }while (!(password.equals(confirmacion)) && intentos < 3);
        if(ok)
            System.out.println("Enhorabuena");


    }

}
