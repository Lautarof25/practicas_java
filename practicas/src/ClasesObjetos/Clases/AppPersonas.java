package ClasesObjetos.Clases;

import java.util.Scanner;

public class AppPersonas {
    public static void main(String[] args) {

        Persona persona = new Persona();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = sc.next();
        persona.setNombre(nombre);
        System.out.println("Ingrese el primer apellido");
        String pApellido = sc.next();
        persona.setPrimerApellido(pApellido);
        System.out.println("Ingrese el segundo apellido");
        String sApellido = sc.next();
        persona.setSegundoApellido(sApellido);
        System.out.println("Ingrese el Dni");
        String dni = sc.next();
        persona.setDni(dni);
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        persona.setEdad(edad);

        System.out.println(persona.toString());

    }
}
