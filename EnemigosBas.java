import java.util.ArrayList;
/**
 * En esta clase se establece que enemigos existiran y sus propiedades, como la vida y el daño que hacen, como
 * tambien los items que pueden dropear
 * 
 * @author Sebastian Estrada
 * @since 27/09/2021
 */
class EnemigosBas{
    protected String tipo; // Guarda el tipo de enemigo que es
    protected String tipoDeDamage; // Guarda el tipo de daño que hace
    protected int vida; // Guarda la vida actual que tiene el enemigo
    protected int damage; // Guarda el daño que hace
    protected ArrayList<ItemoHabilidad> itemsOhabsDrop = new ArrayList<ItemoHabilidad>(); // Guarda los items que dropean

    /**
     * El metodo constructor solo settea el tipo de enemigo que es
     * @param tipito
     */
    public EnemigosBas(String tipito){
        tipo = tipito;
        verificador(tipo);
    }
    /**
     * Este metodo setea todas las propiedades del enemigo en base a su tipo
     * @param tip
     */
    private void verificador(String tip){
        if (tipo.equals("RAzul") == true){
            tipoDeDamage = "Granadas";
            vida = 50;
            damage = 2;
            itemsOhabsDrop.add(new ItemoHabilidad("Granada", "Fragmenta", 1, 1, 10));
            itemsOhabsDrop.add(new ItemoHabilidad("Manual", "Cura", 1, 1, 10));
        }else if(tipo.equals("RRojo") == true){
            tipoDeDamage = "Virus";
            vida = 30;
            damage = 15;
            itemsOhabsDrop.add(new ItemoHabilidad("Virus", "Por R", 1, 3, 5));
            itemsOhabsDrop.add(new ItemoHabilidad("Hack", "Reduccion", 1, 1, 5));
        }else if(tipo.equals("RGris") == true){
            tipoDeDamage = "Misiles";
            vida = 60;
            damage = 14;
            itemsOhabsDrop.add(new ItemoHabilidad("Misiles", "Explota", 2, 1, 15));
            itemsOhabsDrop.add(new ItemoHabilidad("Hack", "Reduccion", 1, 1, 5));
        }
    }
    /**
     * Este metodo imprime el mensaje de victoria de todos los enemigos
     */
    public void gana(){
        System.out.println("\n El mal triunfaraaaaa JAJAJAJAJA\n");
    }
    /**
     * Este metodo imprime el mensaje tras el robot haber sido eliminado
     */
    public void pierde(){
        System.out.println("\n NOOOOOOOO nos has vencidon\n");
    }
    /**
     * Este metodo seta la vida del enemigo
     * @param vid
     */
    public void setVida(int vid){
        vida = Integer.parseInt(Math.round(vid));
    }
    /**
     * Este metodo seta el daño del enemigo
     * @param damag
     */
    public void setDamage(int damag){
        damage = damag;
    }
    /**
     * Este metodo es un getter de la vida del enemigo
     * @return retorna un int 
     */
    public int getVida(){
        return vida;
    }
    /**
     * Este metodo es un getter del daño del enemigo
     * @return retorna un int
     */
    public int getDamage(){
        return damage;
    }
    /**
     * Este es un metodo getter del tipo de enemigo que es
     * @return retorna un String
     */
    public String getTipo(){
        return tipo;
    }
}