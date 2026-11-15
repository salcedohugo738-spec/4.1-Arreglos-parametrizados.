/*
Hugo Emmanuel Salcedo Alvarez
Juan Adrian Morales Escobar
 */
package back_end;

import java.util.Objects;

public class Libro extends Trabajo {

    private int numeroPaginas;

    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas) {
        super(titulo, autor, anioPublicacion);
        setNumeroPaginas(numeroPaginas);
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = validarEnteroPositivo(numeroPaginas, "número de páginas");
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroPaginas);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false; // incluye la comparación de clase
        }
        final Libro other = (Libro) obj;
        return numeroPaginas == other.numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + getTitulo() + ", autor=" + getAutor()
                + ", anioPublicacion=" + getAnioPublicacion()
                + ", numeroPaginas=" + numeroPaginas + '}';
    }
}
