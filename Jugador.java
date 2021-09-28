import java.util.ArrayList;
/**
 *  Esta clase establece todas las propiedades que un jugador tiene y que puede controlar
 * 
 * @author Sebastian Estrada
 * @since 27/09/2021
 * @version 0.1
 */
class Jugador{
    private String nombre;// Guarda el nombre que le dio el usuario a su jugador
    private int damageBas; // Guarda los puntos de daño de sus basicos
    private int vida;// Guarda los puntos de vida restante o total
    private ArrayList<ItemoHabilidad> itemsOHabls= new ArrayList<ItemoHabilidad>();// Este es el inventario del jugador
    
    /**
     * Este es el metodo constructor y establece la mayoria de sus propiedades 
     * @param nom
     * @param damag
     * @param vid
     */
    public Jugador(String nom,int damag, int vid){
        nombre = nom;
        damageBas = damag;
        vida = vid;
    }
    /**
     * Este metodo imprime el mensaje de victoria
     */
    public void gana(){
        System.out.println("\n He ganado, vamoooos por la victoria\n");
    }
    /**
     * Este metodo imprime el mensaje de game over
     */
    public void pierde(){
        System.out.println("\n NOOOOO, estoy muriendo\n---***GameOver***---");
    }
    /**
     * Este metodo imprime todo el inventario del usuario
     */
    public void inventario(){
        if (itemsOHabls.size()>0){
            for (int i = 0; i< itemsOHabls.size(); i++ ){
                System.out.println("\n"+i + " "+ itemsOHabls.get(i).getNombre());
            }
        }else{
            System.out.println("\n No tienes ni items ni habilidades\n");
        }
    }
    /**
     * Este metodo setea la vida
     * @param vid
     */
    public void setVidas(int vid){
        vida = Integer.parseInt(Math.round(vid));
    }
    /**
     * Este metodo setea el daño basico del jugador
     * @param damg
     */
    public void setDama(int damg){
        damageBas = damg;
    }
    /**
     * Este metodo agrega un item al inventario
     * @param itemoHab
     */
    public void nuevoItemoHab(ItemoHabilidad itemoHab){
        itemsOHabls.add(itemoHab);
    }
    /**
     * Este metodo chequea si los items ya no tienen otro intento
     */
    public void revisionDeItems(){
        for (int i = 0; i<itemsOHabls.size(); i++){
            if (itemsOHabls.get(i).getIntentos() == 0){
                itemsOHabls.remove(i);
            }
        }
    }
    /**
     * Este es un metodo es un getter del daño basico
     * @return retorna un int
     */
    public int getDamageBas(){
        return damageBas;
    }
    /**
     * Este es un getter de las vidas
     * @return retorna un int
     */
    public int getVidas(){
        return vida;
    }
    /**
     * Este es un metodo getter del inventario
     * @return retorna un ArrayList de itemoHabilidad
     */
    public ArrayList<ItemoHabilidad> getItems(){
        return itemsOHabls;
    }
}