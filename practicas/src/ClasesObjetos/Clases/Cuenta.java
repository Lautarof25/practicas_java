package ClasesObjetos.Clases;

public class Cuenta {
    private String titularCta;
    private String numeroCta;
    private double saldoCta;

    public Cuenta(){}

    public Cuenta(Cuenta c){
        this.titularCta = c.titularCta;
        this.numeroCta = c.numeroCta;
        this.saldoCta = c.saldoCta;
    }
    public Cuenta(String titular, String numero, double saldo){
        this.titularCta = titular;
        this.numeroCta = numero;
        this.saldoCta = saldo;
    }

    public String getTitularCta() {
        return titularCta;
    }

    public void setTitularCta(String titularCta) {
        this.titularCta = titularCta;
    }

    public String getNumeroCta() {
        return numeroCta;
    }

    public void setNumeroCta(String numeroCta) {
        this.numeroCta = numeroCta;
    }

    public double getSaldoCta() {
        return saldoCta;
    }

    public void setSaldoCta(double saldoCta) {
        this.saldoCta = saldoCta;
    }

    @Override
    public String toString() {
        return "Datos de la cuenta" +
                "\nNombre del titular: " + titularCta +
                "\nNúmero de cuenta: " + numeroCta +
                "\nSaldo: " + saldoCta;
    }

    public boolean ingreso(double cantidad){
        if(cantidad > 0) {
            this.saldoCta += cantidad;
            return true;
        }
        return false;
    }
    public boolean reintegro(double cantidad){
        if(cantidad > 0 && this.saldoCta >= cantidad) {
            this.saldoCta -= cantidad;
            return true;
        }
        return false;
    }
    public boolean transferencia(Cuenta ctaDestino, double cantidad){
        if(reintegro(cantidad)) {
            ctaDestino.ingreso(cantidad);
            return true;
        }
        return false;
    }

}
