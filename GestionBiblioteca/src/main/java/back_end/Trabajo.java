/*
Hugo Emmanuel Salcedo Alvarez
Juan Adrian Morales Escobar
 */
package back_end;

import java.util.Objects;


public class Trabajo {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Trabajo(String titulo, String autor, int anioPublicacion) {
        setTitulo(titulo);
        setAutor(autor);
        setAnioPublicacion(anioPublicacion);
    }

    // ---------- Validaciones reutilizables por las subclases ----------
    protected static String validarTexto(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo " + campo + " no puede estar vacío.");
        }
        return valor.trim();
    }

    protected static int validarEnteroPositivo(int valor, String campo) {
        if (valor <= 0) {
            throw new IllegalArgumentException("El campo " + campo + " debe ser un entero mayor a cero.");
        }
        return valor;
    }

    // ---------- Getters y setters ----------
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = validarTexto(titulo, "título");
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = validarTexto(autor, "autor");
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = validarEnteroPositivo(anioPublicacion, "año de publicación");
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anioPublicacion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Trabajo other = (Trabajo) obj;
        return anioPublicacion == other.anioPublicacion
                && Objects.equals(titulo, other.titulo)
                && Objects.equals(autor, other.autor);
    }

    @Override
    public String toString() {
        return "Trabajo{" + "titulo=" + titulo + ", autor=" + autor
                + ", anioPublicacion=" + anioPublicacion + '}';
    }
}
