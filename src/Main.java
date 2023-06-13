/**
 * Esta clase contiene el metodo inicializarLibros y main
 * @author Luz Serrano Díaz
 * @version 1.0
 * @see Libro
 */

public class Main {
    public static Libro[] libros = new Libro[6];
    /**
     * Metodo creador de un array para usar de ejemplo
     */
    public static void inicializarLibros(){
        Libro l1 = new Libro(1,"woa",true);
        Libro l2 = new Libro(2,"una",false);
        Libro l3 = new Libro(3,"base",true);
        Libro l4 = new Libro(4,"de",true);
        Libro l5 = new Libro(5,"datos",false);
        Libro l6 = new Libro(6,"hola",true);
        libros[0]=l1;
        libros[1]=l2;
        libros[2]=l3;
        libros[3]=l4;
        libros[4]=l5;
        libros[5]=l6;
    }

    /**
     * Metodo main
     * @param args
     */
    public static void main(String[] args) {
        inicializarLibros();
        Controlador.solicitar_libro(1,libros);
    }
}