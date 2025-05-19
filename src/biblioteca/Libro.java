package examen;
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, int anoPublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" ya esta prestado.");
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no esta prestado.");
        }
    }
    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor + " | Año: " + anoPublicacion + " | Prestado: " + (prestado ? "Si" : "No");
    }
}


