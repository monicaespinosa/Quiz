package Quiz.dao;
import Quiz.vista.Pantalla;

public class Laberinto extends Juego implements Runnable{
    //configurar la "composicion" que no se como hacerla exactamente
    private int tiempo;
    private Mundo mundos;
    private Heroe heroes;
    private Pantalla pantalla;
    private char estado;

    //posibles cambios en este constructor
    public Laberinto(int tiempo, Mundo mundos, Heroe heroes, Pantalla pantalla, String titulo, String descripcion, String autor, char estado) {
        //definido aca
        super(titulo, descripcion, autor);
        this.tiempo = tiempo;
        this.mundos = mundos;
        this.heroes = heroes;
        this.pantalla = pantalla;
        this.estado = 0;
    }
    
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public Mundo getMundos() {
        return mundos;
    }
    public void setMundos(Mundo mundos) {
        this.mundos = mundos;
    }
    public Heroe getHeroes() {
        return heroes;
    }
    public void setHeroes(Heroe heroes) {
        this.heroes = heroes;
    }
    public Pantalla getPantalla() {
        return pantalla;
    }
    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }
    
    public void colision(){
    	int hero_x = heroes.getUbicacion().getnPosicion_x();
    	int hero_y = heroes.getUbicacion().getnPosicion_y();
    	for(int i = 0; i<getMundos().getEnemigos().size(); i++){
    		int enemy_x = getMundos().getEnemigos().get(i).getCasilla().getnPosicion_x();
    		int enemy_y = getMundos().getEnemigos().get(i).getCasilla().getnPosicion_y();
    		int obstacle_x = getMundos().getObstaculos().get(i).getCasilla().getnPosicion_x();
    		int obstacle_y = getMundos().getObstaculos().get(i).getCasilla().getnPosicion_y();
    		int objective_x = getMundos().getObjetos().get(i).getCasilla().getnPosicion_x();
    		int objective_y = getMundos().getObjetos().get(i).getCasilla().getnPosicion_y();
    		if(hero_x == enemy_x && hero_y == enemy_y){
    			heroes.setVidas(heroes.getVidas()-1); 
    		}
    		if(hero_x == obstacle_x && hero_y == obstacle_y){
    			/**
    			 * 
    			 */
    		}
    		if(hero_x == objective_x && hero_y == objective_y){
    			/**
    			 * 
    			 */
    		}
    	}    	
    }
    
    public void setEstado(){
    	if (heroes.getVidas()<0){
    		estado = derrota;
    	}else if (mundos.getObjetos().size() == 0){
    		estado = victoria;
    	}else{
    		estado = enJuego;
    	}
    }
    
    public char getEstado(){
    	return estado;
    }
    /**
     * actualiza el estado constantemente.
     */
    public void run(){
    	for(int i = 0; i < getMundos().getEnemigos().size(); i++){
    		/**
    		 * inicializar heroes, enemigos, objetivos y obstaculos
    		 */
    	}
    	while(estado == enJuego){
    		try {
				Thread.sleep(34);
				setEstado();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}
