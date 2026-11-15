/*
Hugo Emmanuel Salcedo Alvarez
Juan Adrian Morales Escobar
 */
package back_end;

import java.util.Objects;

public class Revista extends Trabajo {

    private int numeroEdicion;

    public Revista(String titulo, String autor, int anioPublicacion, int numeroEdicion) {
        super(titulo, autor, anioPublicacion);
        setNumeroEdicion(numeroEdicion);
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = validarEnteroPositivo(numeroEdicion, "número de edición");
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroEdicion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        final Revista other = (Revista) obj;
        return numeroEdicion == other.numeroEdicion;
    }

    @Override
    public String toString() {
        return "Revista{" + "titulo=" + getTitulo() + ", autor=" + getAutor()
                + ", anioPublicacion=" + getAnioPublicacion()
                + ", numeroEdicion=" + numeroEdicion + '}';
    }
}
