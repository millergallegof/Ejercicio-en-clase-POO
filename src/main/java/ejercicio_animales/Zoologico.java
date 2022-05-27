package ejercicio_animales;

/**
 * [Clase principal, en la cual tenemos el metodo main, su objetivo principal es mostrar por
 *              pantalla el mensaje al usuario y las diferentes acciones que peude hacer el mismo]
 *
 * @version Version 1.0.0
 *
 * @author Miller Esteban Gallego Forero
 *         miller.gallegof@gmail.com
 *
 * @since [1.0.0]
 *
 */
public class Zoologico {

    /**
     * [metodo principal de salida de la aplicacion]
     *
     * @param args parametros pro defecto del metodo main
     *
     *
     *
     * @author Miller Esteban Gallego Forero
     *          miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     */
    public static void main(String[] args) {
        String reinoAnimal = "Animal";

        Mensajes mensajes = new Mensajes();
        Perro perroCallejero = new Perro("criollo", "cafe", "ciudad", reinoAnimal, false, true, false);
        Perro perroCasero = new Perro("Pastor Aleman", "negro", "campo", reinoAnimal, false, false, true);

        Gato gatoDomestico = new Gato("Persa", "Dorado", "ciudad", reinoAnimal, false, true);


        mensajes.bienvenida();
        perroCallejero.hablar();
        perroCallejero.caminar();

        mensajes.bienvenida();
        mensajes.mensajeAtaque("perro");
        perroCasero.atacar();
        perroCasero.hacerRuido();

        mensajes.mensajeAtaque("gato");
        gatoDomestico.atacar();


    }
}
