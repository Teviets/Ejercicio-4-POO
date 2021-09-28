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
    public void opcion1User(){
        int x = rand.nextInt(enemigos.size());
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
    }
    public void opcion2User(int paInven){
        if (user.getItems().get(paInven).getIntentos() == 0){
            System.out.println("\nEste item o habilidad se te acabo\n");
        }else{
            if(user.getItems().get(paInven).getNombre().equals("Granada") == true){
                // Granada
                for (int i=0; i<enemigos.size();i++){
                    double vid = enemigos.get(i).getVida();
                    enemigos.get(i).setVida(vid - user.getItems().get(paInven).getDamage());
                }
                user.getItems().get(paInven).setIntentos(user.getItems().get(paInven).getIntentos() - 1);
                System.out.println("A todos los robots les has hecho un daño de " + user.getItems().get(paInven).getDamage());
            }else if (user.getItems().get(paInven).getNombre().equals("Manual") == true){
                // manual
                double vida = user.getItems().get(paInven).getDamage();
                user.setVidas(user.getVidas()+vida);
            }else if (user.getItems().get(paInven).getNombre().equals("Virus") == true){
                // Virus
                int x = rand.nextInt(enemigos.size());
                if (x == 0){
                    enemigos.get(0).setVirus(user.getItems().get(paInven));
                }else if(x == 1){
                    enemigos.get(1).setVirus(user.getItems().get(paInven));
                }else if (x == 2){
                    enemigos.get(2).setVirus(user.getItems().get(paInven));
                }
                user.getItems().get(paInven).setIntentos(user.getItems().get(paInven).getIntentos() - 1);
                System.out.println("Le has aplicado un virus al " + x + " Robot");
            }else if(user.getItems().get(paInven).getNombre().equals("Hack") == true){
                // Hack
                int x = rand.nextInt(enemigos.size());
                if (x == 0){
                    enemigos.get(0).setDamage(enemigos.get(0).getDamage()-(user.getItems().get(paInven).getDamage()));
                }else if(x == 1){
                    enemigos.get(1).setDamage(enemigos.get(1).getDamage()-(user.getItems().get(paInven).getDamage()));
                }else if (x == 2){
                    enemigos.get(1).setDamage(enemigos.get(1).getDamage()-(user.getItems().get(paInven).getDamage()));
                }

            }else if(user.getItems().get(paInven).getNombre().equals("Misiles") == true){
                // Misiles
                for (int i = 0; i<enemigos.size(); i++){
                    enemigos.get(i).setVida(enemigos.get(i).getVida() - user.getItems().get(paInven).getDamage());
                }
            }
        }
        
    }
    public void turnoRobot(){
        
        for (int i = 0; i<enemigos.size(); i++){
            user.setVidas(user.getVidas() -((rand.nextInt(100))/100)*enemigos.get(i).getDamage());
            System.out.println("El Robot"+i+" te ha dañado");
        }
        
    }
    public void actualizarEnemigos(){
        for (int i = 0; i<enemigos.size()){
            if(enemigos.get(i).getVida()<=0){
                enemigos.remove(i);
                System.out.println("Has eliminado al enemigo " + i);
            }
        }
    } 
    
    
    
}