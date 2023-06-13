/**
 * Esta clase contiene el metodo solicitar_libro y (si no fuera un ejercicio) más metodos serán incluidos en el futuro
 * @author Luz Serrano Díaz
 * @version 1.0
 * @see Libro
 */
public class Controlador {
    /**
     * Metodo para solicitar un libro, comprueba un array para ver si el libro con el id introducido existe dentro
     * @param idLibroSeleccionado id introducido para buscar libro
     * @param array el array donde se realizará la busqueda
     * @return regresa un valor de 1 (disponible), 0 (no disponible) o -1 (no existe en el array)
     */
    public static int solicitar_libro(int idLibroSeleccionado, Libro[] array){
        for (Libro i:array) {
            if (i.getId()==idLibroSeleccionado){
                if (i.getDisponible()){
                    System.out.println(i.getTitulo()+" Esta disponible");

                    return 1;
                }else {
                    System.out.println("Libro no disponible");
                    return 0;
                }
            }
        }
        System.out.println("Libro no existe");
        return -1;
    }
}
