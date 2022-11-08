package ClasesObjetos.Clases;

import ClasesObjetos.Clases.Cuenta;

public class EjercicioCuentaBancaria {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();

        c1.setTitularCta("Lautaro Fernández");
        c1.setNumeroCta("111222333");
        c1.setSaldoCta(500.25);
        System.out.println(c1);

        c2.setTitularCta("Exequiel Fernández");
        c2.setNumeroCta("9999999");
        c2.setSaldoCta(250.75);
        System.out.println(c2);

        c1.ingreso(499.75);
        System.out.println(c1);

        c1.transferencia(c2,500.00);
        System.out.println(c1);
        System.out.println(c2);

    }
}
