package POO.Herencia;

public class Empresa {
    public static void main(String[] args) {

        Empleado empleado = new Empleado();
        empleado.setAntiguedad(2);
        empleado.setPuesto("Administrativo");
        empleado.setSalario(500.50);
        empleado.setNombre("Lautaro");
        empleado.setPrimerApellido("Fernandez");
        empleado.setSegundoApellido("Tello");
        empleado.setDni("35174222");
        empleado.setEdad(32);
        System.out.println(empleado);

        empleado.actualizarSalario(150.00);
        System.out.println(empleado);

        
    }
}
