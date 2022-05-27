package ejercicio_animales;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * [Clase padre la cual hereda a diferentes clases, con el fin de tener una palntilla adecuada,
 *              con atributos y elementos generales del reino animal]
 *
 * @version Version 1.0.0
 *
 * @author Miller Esteban Gallego Forero
 *         miller.gallegof@gmail.com
 *
 * @since [1.0.0]
 *
 */
public class Animal {
    Logger logger = Logger.getLogger(Animal.class.getName());
    private String raza;
    private String color;
    private String vivienda;
    private String reinoAnimal;
    private Boolean esVolador;


    /**
     * [metodo constructor el cual instancia el objeto con sus diferentes atributos]
     *
     *
     * @param raza dato de tipo string que indica la raza del animal
     * @param color dato de tipo String que indica el color del animal
     * @param vivienda dato de tipo string que indica donde vive el animal
     * @param reinoAnimal dato de tipo String que indica el reino del animal
     * @param esVolador dato de tipo boolean que indica si vuela
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
    public Animal(String raza, String color, String vivienda, String reinoAnimal, Boolean esVolador) {
        this.raza = raza;
        this.color = color;
        this.vivienda = vivienda;
        this.reinoAnimal = reinoAnimal;
        this.esVolador = esVolador;
    }

    /**
     * [metodo el cual imprime por panrtalla una accion especifica que hace el objeto hacer ruido]
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
    public void hacerRuido(){
        logger.log(Level.INFO, "el animal habla");
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVivienda() {
        return vivienda;
    }

    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    public String getReinoAnimal() {
        return reinoAnimal;
    }

    public void setReinoAnimal(String reinoAnimal) {
        this.reinoAnimal = reinoAnimal;
    }

    public Boolean getEsVolador() {
        return esVolador;
    }

    public void setEsVolador(Boolean esVolador) {
        this.esVolador = esVolador;
    }
}
