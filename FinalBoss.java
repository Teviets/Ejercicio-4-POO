/**
 * Esta clase hereda de EnemigosBas y establece todas las propiedades que tiene un enemigo
 * se overridean los metodos gana y pierde.
 * 
 * @author Sebastian Estrada Tuch
 * @since 27/09/2021
 * @version 0.1
 */
class FinalBoss extends EnemigosBas{
    /**
     * Este es el metodo constructor y establece el super necesario para establecer tipo de enemigo que es
     */
    public FinalBoss(){
        super("BOSS");
        
        tipoDeDamage = "Todos";
        damage = 22;
        vida = 100;
        itemsOhabsDrop.add(new ItemoHabilidad("Corona", "Nada", 999,999,999));
    }
    /**
     * Este metodo se overridea el metodo gana y cambia el mensaje que se imprime
     */
    @Override
    public void gana(){
        System.out.println("\n No eres capaz de ganarmeeeee, JAJAJAJAJAJJAJA\n");
    }
    /**
     * Este metodo se overridea, el metodo pierde cambia el mensaje que se imprime
     */
    @Override
    public void pierde(){
        System.out.println("\n NOOOOOOOOOOOOOOOOOOO, como osas vencerme");
    }
}