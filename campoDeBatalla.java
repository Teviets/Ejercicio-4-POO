import java.util.ArrayList;
import java.util.Random;

class CampoDeBatalla{
    private int rondas;
    private Jugador user;
    private ArrayList<EnemigosBas> enemigos = new ArrayList<EnemigosBas>();
    private FinalBoss boss;
    private Random rand;

    public CampoDeBatalla(String nomUs){
        user = new Jugador(nomUs, 15+rand.nextInt(5), 50+rand.nextInt(50));
    }
    public void enfrentamiento1(){
        enemigos.add(new EnemigosBas("RAzul"));
        enemigos.add(new EnemigosBas("RAzul"));
        enemigos.add(new EnemigosBas("RAzul"));
    }
    public void enfrentamiento2(){
        enemigos.add(new EnemigosBas("RRojo"));
        enemigos.add(new EnemigosBas("RRojo"));
        enemigos.add(new EnemigosBas("RRojo"));
    }
    public void enfrentamiento3(){
        enemigos.add(new EnemigosBas("RGris"));
        enemigos.add(new EnemigosBas("RGris"));
        enemigos.add(new EnemigosBas("RGris"));
    }
    
    public void turnoUser(int i, int paInven){
        switch (i) {
            case 1:// Ataque Basico
                int x = rand.nextInt(2);
                if(x==0 ){
                    enemigos.get(0).setVida(enemigos.get(0).getVida() - (Math.random()*1)*user.getDamageBas());
                    System.out.println("\nHas dañado al robot1, ahora su vida es: " + enemigos.get(0).getVida());
                }else if(x == 1){
                    enemigos.get(1).setVida(enemigos.get(1).getVida() - (Math.random()*1)*user.getDamageBas());
                    System.out.println("\nHas dañado al robot2, ahora su vida es: " + enemigos.get(1).getVida());
                }else if(x ==2){
                    enemigos.get(2).setVida(enemigos.get(2).getVida() - (Math.random()*1)*user.getDamageBas());
                    System.out.println("\nHas dañado al robot3, ahora su vida es: " + enemigos.get(2).getVida());
                }
            case 2:
                if(user.getItems().get(paInven).getNombre().equals("Granada") == true){
                    // Granada
                }else if (user.getItems().get(paInven).getNombre().equals("Manual") == true){
                    // manual
                }else if (user.getItems().get(paInven).getNombre().equals("Virus") == true){
                    // Virus
                }else if(user.getItems().get(paInven).getNombre().equals("Hack") == true){
                    // Hack
                }else if(user.getItems().get(paInven).getNombre().equals("Misiles") == true){
                    // Misiles
                }
                
                break;
        
            default:
                // se termina su turno
                break;
        }
    }
    public turnoRobot(){
        
        for (int i = 0; i<enemigos.size(); i++){
            user.setVidas((Math.random()*1)*enemigos.get(i).getDamage());
            System.out.println("El Robot"+i+" te ha dañado");
        }
        
    }
    
    public void reinicioEnemigos(){
        for (int i = 0; i<enemigos.size();i++){
            enemigos.remove(i);
        }
    }
    
}