/*
Hugo Emmanuel Salcedo Alvarez
Juan Adrian Morales Escobar
 */
package back_end;

/**
 * Contenedor estático (arreglo) de publicaciones. Admite cualquier subclase de
 * {@link Trabajo}. Las posiciones eliminadas quedan en null (sin recorrer
 * elementos).
 *
 * @param <T> tipo de publicación, acotado por Trabajo
 */
public class BibliotecaGenericaArreglo<T extends Trabajo> {

    public static final int CAPACIDAD_POR_DEFECTO = 5;

    private final T[] trabajos;
    private int cantidadActual; // número de celdas ocupadas

    public BibliotecaGenericaArreglo() {
        this(CAPACIDAD_POR_DEFECTO);
    }

    @SuppressWarnings("unchecked")
    public BibliotecaGenericaArreglo(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser un entero mayor a cero.");
        }
        // T se borra a Trabajo en tiempo de ejecución, por eso este arreglo es seguro
        this.trabajos = (T[]) new Trabajo[capacidad];
        this.cantidadActual = 0;
    }

    // ---------- Validaciones internas ----------
    private void validarPosicion(int posicion) {
        if (posicion < 0 || posicion >= trabajos.length) {
            throw new IndexOutOfBoundsException("La posición " + posicion
                    + " es inválida. Debe estar entre 0 y " + (trabajos.length - 1) + ".");
        }
    }

    private void validarExistente(int posicion) {
        validarPosicion(posicion);
        if (isEmpty()) {
            throw new IllegalStateException("La biblioteca está vacía.");
        }
        if (trabajos[posicion] == null) {
            throw new IllegalStateException("La posición " + posicion + " está vacía.");
        }
    }

    // ---------- Operaciones principales ----------
    /** Agrega un trabajo en una posición libre del arreglo. */
    public void agregarTrabajo(T trabajo, int posicion) {
        if (trabajo == null) {
            throw new IllegalArgumentException("El trabajo a agregar no puede ser nulo.");
        }
        validarPosicion(posicion);
        if (trabajos[posicion] != null) {
            throw new IllegalStateException("La posición " + posicion
                    + " ya está ocupada. Elimínala o usa 'Modificar trabajo' para reemplazarla.");
        }
        trabajos[posicion] = trabajo;
        cantidadActual++;
    }

    /** Reemplaza un trabajo existente (la confirmación la pide la interfaz). */
    public T reemplazarTrabajo(T trabajo, int posicion) {
        if (trabajo == null) {
            throw new IllegalArgumentException("El trabajo no puede ser nulo.");
        }
        validarExistente(posicion);
        T anterior = trabajos[posicion];
        trabajos[posicion] = trabajo;
        return anterior;
    }

    /** Elimina el trabajo de la posición indicada y deja la celda en null. */
    public T eliminarTrabajo(int posicion) {
        validarExistente(posicion);
        T eliminado = trabajos[posicion];
        trabajos[posicion] = null;
        cantidadActual--;
        return eliminado;
    }

    /** Devuelve el trabajo guardado en la posición indicada. */
    public T mostrarTrabajo(int posicion) {
        validarExistente(posicion);
        return trabajos[posicion];
    }

    /** Devuelve el listado completo (con su posición) de los trabajos guardados. */
    public String mostrarTodosTrabajos() {
        if (isEmpty()) {
            return "La biblioteca no tiene trabajos actualmente.\n";
        }
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < trabajos.length; i++) {
            if (trabajos[i] != null) {
                lista.append("[").append(i).append("] ").append(trabajos[i]).append("\n");
            }
        }
        return lista.toString();
    }

    /** Elimina todos los trabajos y deja la estructura lista para reutilizarse. */
    public void vaciarBiblioteca() {
        for (int i = 0; i < trabajos.length; i++) {
            trabajos[i] = null;
        }
        cantidadActual = 0;
    }

    public boolean isEmpty() {
        return cantidadActual == 0;
    }

    public int getCapacidad() {
        return trabajos.length;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
}
