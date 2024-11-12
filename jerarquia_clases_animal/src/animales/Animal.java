package animales;

/**
 * Esta clase abstracta denominada Animal modela un animal genérico
 * que cuenta con atributos como un sonido, alimentos que consume,
 * un hábitat y un nombre científico.
 * 
 */

public abstract class Animal {
    protected String sonido; // identifica el sonido emitido por un animal
    protected String alimentos; // identifica los alimentos que consume un animal
    protected String habitad; // Atributo que identifica el hábitat de un animal
    protected String nombreCientifico; // identifica el nombre científico de un animal

    /**
     * Método abstracto que permite obtener el nombre científico del animal
     * @return El nombre científico del animal
     */
    public abstract String getNombreCientifico();

    /**
     * Método abstracto que permite obtener el sonido producido por el animal
     * @return El sonido producido por el animal
     */
    public abstract String getSonido();

    /**
     * Método abstracto que permite obtener los alimentos que consume un animal
     * @return Los alimentos que consume el animal
     */
    public abstract String getAlimentos();

    /**
     * Método abstracto que permite obtener el hábitat de un animal
     * @return El hábitat del animal
     */
    public abstract String getHabitat();
}
