package ClasesObjetos.Clases;

import java.util.Objects;

public class Persona {
    // Atributos
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String dni;
    private int edad;
    // Constructores
    public Persona(){}
    public Persona(Persona p){
        this.nombre = p.nombre;
        this.primerApellido = p.primerApellido;
        this.segundoApellido = p.segundoApellido;
        this.dni = p.dni;
        this.edad = p.edad;
    }
    public Persona(String nombre, String pApellido, String sApellido, String dni, int edad){
        this.nombre = nombre;
        this.primerApellido = pApellido;
        this.segundoApellido = sApellido;
        this.dni = dni;
        this.edad = edad;
    }
    // Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
