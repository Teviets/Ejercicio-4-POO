/**
 * Esta clase es el main ejecuta todo el combate entre los personajes
 * @author Sebastian Estrada
 * @since 28/09/2021
 * @version 1.0
 */
class Controlador{
    public static void main(String[] args) {
        Vista vista = new Vista();
        String usuario = vista.nombreUs();
        System.out.println("antes de declaracion");
        CampoDeBatalla campito = new CampoDeBatalla(usuario);
        System.out.println("Despues de declaracion");
        campito.enfrentamiento1();
        int x = 0;
        double vidUs = campito.getVidaUser();
        double vidEne = campito.getVidaEnemies();
        double vidBos = campito.getVidaBoss();
        while ( vidUs>0 && vidEne>0 && vidBos>0){
            System.out.println("\nBienvenido a la ronda "+ x + "\n");
            if(x%2 != 0){
                int y = vista.turnoUser();
                while(y != 3){
                    switch (y) {
                        case 1:
                            campito.opcion1User();
                            y=3;
                            break;
                        case 2:
                            
                            boolean ver = campito.imprimirItems();
                            if (ver ==true){
                                int paInven = vista.seleccionNum();
                                campito.opcion2User(paInven);
                                ver = false;
                                y=3;
                            }else {
                                y=3;
                            }
                                
                            break;
                        
                        case 3:
                            //Se termina el turno
                            break;
                        default:
                            break;
                    }
                }
            }else if(x%2 == 0){
                campito.turnoRobot();
            }
            x++;
            campito.cambioDeRonda();
            campito.actualizarEnemigos();
            vidUs = campito.getVidaUser();;
            vidEne = campito.getVidaEnemies();
            vidBos = campito.getVidaBoss();
            campito.mostrarTodasLasVidasConEne();
        }
        campito.actualizarEnemigos();
        campito.enfrentamiento2();
        x = 0;
        vidUs = campito.getVidaUser();
        vidEne = campito.getVidaEnemies();
        vidBos = campito.getVidaBoss();
        
        while ( vidUs>0 && vidEne>0 && vidBos>0){
            System.out.println("\nBienvenido a la ronda "+ x + "\n");
            if(x%2 != 0){
                int y = vista.turnoUser();
                while(y != 3){
                    switch (y) {
                        case 1:
                            campito.opcion1User();
                            y=3;
                            break;
                        case 2:
                            
                            boolean ver = campito.imprimirItems();
                            if (ver ==true){
                                int paInven = vista.seleccionNum();
                                campito.opcion2User(paInven);
                            }else {
                                y=3;
                            }
                                
                            break;
                        
                        case 3:
                            //Se termina el turno
                            break;
                        default:
                            break;
                    }
                }
            }else if(x%2 == 0){
                campito.turnoRobot();
            }
            x++;
            campito.cambioDeRonda();
            campito.actualizarEnemigos();
            vidUs = campito.getVidaUser();;
            vidEne = campito.getVidaEnemies();
            vidBos = campito.getVidaBoss();
            campito.mostrarTodasLasVidasConEne();
        }
        campito.actualizarEnemigos();
        campito.enfrentamiento3();
        x = 0;
        vidUs = campito.getVidaUser();
        vidEne = campito.getVidaEnemies();
        vidBos = campito.getVidaBoss();
        while ( vidUs>0 && vidEne>0 && vidBos>0){
            System.out.println("\nBienvenido a la ronda "+ x + "\n");
            if(x%2 != 0){
                int y = vista.turnoUser();
                while(y != 3){
                    switch (y) {
                        case 1:
                            campito.opcion1User();
                            y=3;
                            break;
                        case 2:
                            
                            boolean ver = campito.imprimirItems();
                            if (ver ==true){
                                int paInven = vista.seleccionNum();
                                campito.opcion2User(paInven);
                            }else {
                                y=3;
                            }
                                
                            break;
                        
                        case 3:
                            //Se termina el turno
                            break;
                        default:
                            break;
                    }
                }
            }else if(x%2 == 0){
                campito.turnoRobot();
            }
            x++;
            campito.cambioDeRonda();
            campito.actualizarEnemigos();
            vidUs = campito.getVidaUser();;
            vidEne = campito.getVidaEnemies();
            vidBos = campito.getVidaBoss();
            campito.mostrarTodasLasVidasConEne();
        }
        campito.actualizarEnemigos();
        
        x = 0;
        vidUs = campito.getVidaUser();
        vidEne = campito.getVidaEnemies();
        vidBos = campito.getVidaBoss();
        while ( vidUs>0 && vidEne>0 && vidBos>0){
            System.out.println("\nBienvenido a la ronda "+ x + "\n");
            if(x%2 != 0){
                int y = vista.turnoUser();
                while(y != 3){
                    switch (y) {
                        case 1:
                            campito.opcion1User();
                            y=3;
                            break;
                        case 2:
                            
                            boolean ver = campito.imprimirItems();
                            if (ver ==true){
                                int paInven = vista.seleccionNum();
                                campito.opcion2User(paInven);
                            }else {
                                y=3;
                            }
                                
                            break;
                        
                        case 3:
                            //Se termina el turno
                            break;
                        default:
                            break;
                    }
                }
            }else if(x%2 == 0){
                campito.turnoBoss();
            }
            x++;
            campito.cambioDeRonda();
            campito.actualizarEnemigos();
            vidUs = campito.getVidaUser();
            vidBos = campito.getVidaBoss();
            campito.mostrarVidaConBoss();
        }

        
    }
}