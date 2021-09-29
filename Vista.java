import java.util.Scanner;
/**
 * Esta clase muestra ciertos aspectos que se le muestran al usuario y escanean sus decisiones
 * @author Sebastian Estrada
 * @since 28/09/2021
 * @version 1.0
 */
class Vista{
    private Scanner scan;// Este es el scanner para leer lo que el usuario contasta
    private int num;// Esta variable guarda los ints que coloque el usuario
    private String txt;// Esta variable guarda todos los Strings que el usuario coloque

    /**
     * Este metodo solo instancia el scan
     */
    public Vista(){
        scan = new Scanner(System.in);
    }
    /**
     * Este metodo da la bienvenida y muestra ciertas instrucciones
     */
    public void instrucciones(){
        System.out.println("\n Bienvenido a Future Dangerous\n"+
                           "Future Dangerous es un juego de rol por niveles\n"+
                           "Al eleiminar los distintos enemigos dropearan neuvos items\n"+
                           "Estos items te ayudaran a vencer a los enemigos mas complicados\n"+
                           "Pero cuidado los robots se defenderan...");
    }
    /**
     * Este metodo pregunta al usuario el nombre que el usuario que quiere para su personaje
     * @return retorna un String
     */
    public String nombreUs(){
        System.out.println("\nPor favor ingrese el nombre de su personaje\n");
        scan = new Scanner(System.in);
        txt = scan.nextLine();
        return txt;
    }
    /**
     * Este metodo pregunta al usuario que accion quiere que tome su personaje
     * @return retorna un int
     */
    public int turnoUser(){
        System.out.println("1. Atacar a basicos\n"+
                           "2. Usar item o habilidad de tu inventario\n"+
                           "3. Saltar tu turno\n");
        scan = new Scanner(System.in);
        num = scan.nextInt();
        return num;
    }
    /**
     * Este metodo solo escanea un int 
     * @return retorna un int
     */
    public int seleccionNum(){
        scan = new Scanner(System.in);
        num = scan.nextInt();
        return num;
    }
}