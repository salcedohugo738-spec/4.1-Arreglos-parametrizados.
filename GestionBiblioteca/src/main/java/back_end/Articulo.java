/*
Hugo Emmanuel Salcedo Alvarez
Juan Adrian Morales Escobar
 */
package back_end;

import java.util.Objects;

public class Articulo extends Trabajo {

    private String nombreConferencia;

    public Articulo(String titulo, String autor, int anioPublicacion, String nombreConferencia) {
        super(titulo, autor, anioPublicacion);
        setNombreConferencia(nombreConferencia);
    }

    public String getNombreConferencia() {
        return nombreConferencia;
    }

    public void setNombreConferencia(String nombreConferencia) {
        this.nombreConferencia = validarTexto(nombreConferencia, "nombre de la conferencia");
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombreConferencia);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        final Articulo other = (Articulo) obj;
        return Objects.equals(nombreConferencia, other.nombreConferencia);
    }

    @Override
    public String toString() {
        return "Articulo{" + "titulo=" + getTitulo() + ", autor=" + getAutor()
                + ", anioPublicacion=" + getAnioPublicacion()
                + ", nombreConferencia=" + nombreConferencia + '}';
    }
}
