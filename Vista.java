import java.util.Scanner;

class Vista{
    Scanner scan;
    int num;
    String txt;

    public Vista(){
        scan = new Scanner(System.in);
    }
    public void instrucciones(){
        System.out.println("\n Bienvenido a Future Dangerous\n"+
                           "Future Dangerous es un juego de rol por niveles\n"+
                           "Al eleiminar los distintos enemigos dropearan neuvos items\n"+
                           "Estos items te ayudaran a vencer a los enemigos mas complicados\n"+
                           "Pero cuidado los robots se defenderan...");
    }
    public String nombreUs(){
        System.out.println("\nPor favor ingrese el nombre de su personaje\n");
        scan = new Scanner(System.in);
        txt = scan.nextLine();
        return txt;
    }
    public int turnoUser(){
        System.out.println("1. Atacar a basicos\n"+
                           "2. Usar item o habilidad de tu inventario\n"+
                           "3. Saltar tu turno\n");
        scan = new Scanner(System.in);
        num = scan.nextInt();
        return num;
    }
    public int seleccionNum(){
        scan = new Scanner(System.in);
        num = scan.nextInt();
        return num;
    }
}