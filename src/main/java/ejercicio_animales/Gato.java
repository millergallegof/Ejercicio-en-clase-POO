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
public class Gato extends Animal implements ComportamientoDomesticos {
    Logger loggerGato = Logger.getLogger(Gato.class.getName());
    private Boolean esRasgunador;

    /**
     * [metodo constructor el cual instancia el objeto con sus diferentes caracteristicas]
     *
     *
     * @param raza dato de tipo string que indica la raza del animal
     * @param color dato de tipo String que indica el color del animal
     * @param vivienda dato de tipo string que indica donde vive el animal
     * @param reinoAnimal dato de tipo String que indica el reino del animal
     * @param esVolador dato de tipo boolean que indica si vuela o no
     * @param esRasgunador dato de tipo boolean que indica si el animal rasguña o no
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
    public Gato(String raza, String color, String vivienda, String reinoAnimal, Boolean esVolador, Boolean esRasgunador) {
        super(raza, color, vivienda, reinoAnimal, esVolador);
        this.esRasgunador = esRasgunador;
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
        if (Boolean.TRUE.equals(this.esRasgunador)) {
            loggerGato.log(Level.INFO, "el gasto esta rasgunando");
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
        loggerGato.log(Level.INFO, "Miauuuuu, Miauuuuuu, Miauuuuuuu");
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
        loggerGato.log(Level.INFO, "el gato esta caminando");
    }


    public Boolean getEsRasgunador() {
        return esRasgunador;
    }

    public void setEsRasgunador(Boolean esRasgunador) {
        this.esRasgunador = esRasgunador;
    }


}
