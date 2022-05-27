package ejercicio_animales;

import ejercicio_animales.inteface.ComportamientoDomesticos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase que extiende de Animal e implementa de comportamientoDomestico, la cual crea un objeto con atributos especificos
 *          su objetivo principal es hacer diferentes acciones]
 *
 * @version Version 1.0.0
 *
 * @author Miller Esteban Gallego Forero
 *         miller.gallegof@gmail.com
 *
 * @since [1.0.0]
 *
 */
public class Perro extends Animal implements ComportamientoDomesticos {
    Logger loggerPerro = Logger.getLogger(Perro.class.getName());
    private Boolean esMordelon;
    private Boolean esDomestico;

    /**
     * [metodo constructor el cual instancia el objeto con sus diferentes atributos]
     *
     *
     * @param raza dato de tipo string que indica la raza del animal
     * @param color dato de tipo String que indica el color del animal
     * @param vivienda dato de tipo string que indica donde vive el animal
     * @param reinoAnimal dato de tipo String que indica el reino del animal
     * @param esVolador dato de tipo boolean que indica si vuela
     * @param esMordelon dato de tipo boolean que indica si el animal muerde
     * @param esDomestico dato de tipo boolean que indica si el animal es domestico
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
    public Perro(String raza, String color, String vivienda, String reinoAnimal, Boolean esVolador, Boolean esMordelon, Boolean esDomestico) {
        super(raza, color, vivienda, reinoAnimal, esVolador);
        this.esMordelon = esMordelon;
        this.esDomestico = esDomestico;
    }

    /**
     * [metodo el cual imprime por panrtalla una accion especifica que hace el objeto atacar]
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
    public void atacar() {
        if (Boolean.TRUE.equals(this.esDomestico) && Boolean.TRUE.equals(this.esMordelon)) {
            loggerPerro.log(Level.INFO, "El perro lo agarro el dueño");
        } else {
            loggerPerro.log(Level.INFO, "corra que lo van a morder");
        }
    }

    /**
     * [metodo el cual imprime por panrtalla una accion especifica que hace el objeto hablar]
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
    @Override
    public void hablar() {
        loggerPerro.log(Level.INFO, "Guauuuuuuuuuu, Guauuuuuuuuuu, Guauuuuuuuuu");
    }

    /**
     * [metodo el cual imprime por panrtalla una accion especifica que hace el objeto caminar]
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
    @Override
    public void caminar() {
        loggerPerro.log(Level.INFO, "el perro esta caminando");
    }

    public Boolean getEsMordelon() {
        return esMordelon;
    }

    public void setEsMordelon(Boolean esMordelon) {
        this.esMordelon = esMordelon;
    }

    public Boolean getEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(Boolean esDomestico) {
        this.esDomestico = esDomestico;
    }
}
