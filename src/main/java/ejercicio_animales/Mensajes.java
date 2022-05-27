package ejercicio_animales;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase encargada de mostrar diferentes mensajes a usuario en pantalla]
 *
 * @version Version 1.0.0
 *
 * @author Miller Esteban Gallego Forero
 *         miller.gallegof@gmail.com
 *
 * @since [1.0.0]
 *
 */
public class Mensajes {
    Logger logger = Logger.getLogger(Mensajes.class.getName());

    /**
     * [metodo constructor el cual instancia el objeto en este caso sin ningun atributo]
     *
     *
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero
     *          miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     */
    public Mensajes() {
        // Do nothing because of X and Y.
    }

    /**
     * [metodo el cual imprime por panrtalla un mensaje de bienvenida por la consola]
     *
     *
     *
     *
     *
     * @author Miller Esteban Gallego Forero
     *          miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     */
    public void bienvenida() {
        logger.log(Level.INFO, "su animal esta haciendo: ");
    }

    /**
     * [metodo el cual imprime por panrtalla un mensaje de accion en la consola]
     *
     *
     * @param animal elemento de tipo String que indica que tipo de objeto se esta implementando
     *
     *
     * @author Miller Esteban Gallego Forero
     *          miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     */
    public void mensajeAtaque(String animal) {
        logger.log(Level.INFO, "el {0} lo va atacar :", animal);
    }

}
