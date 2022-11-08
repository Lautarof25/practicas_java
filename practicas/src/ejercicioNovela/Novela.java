package ejercicioNovela;

public class Novela {
    private String tituloLibro;
    private String autor;
    private int ejemplares;
    private int prestados;

    public Novela(){}

    public Novela(Novela n){
        this.tituloLibro = n.tituloLibro;
        this.autor = n.autor;
        this.ejemplares = n.ejemplares;
        this.prestados = n.prestados;
    }

    public Novela(String titulo, String autor, int ejemplares, int prestados){
        this.tituloLibro = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return "Datos del libro" +
                "\nTítulo: " + tituloLibro +
                "\nAutor: " + autor +
                "\nNº de ejemplares: " + ejemplares +
                "\nNº de pretados: " + prestados;
    }
    public boolean prestamo(){
        if( prestados < ejemplares) {
            prestados++;
            return true;
        }
        return false;
    }
    public boolean devolucion(){
        if( prestados > 0) {
            prestados--;
            return true;
        }
        return false;
    }

}
