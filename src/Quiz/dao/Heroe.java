package Quiz.dao;

import java.util.Scanner;

public class Heroe {
    private String nombre;
    //no se acerca de este
    private String animacion;
    private int vidas;
    private int puntuacion;
   /**se utiliza para definir la direccion del movimiento 
    * del personaje
    */
    private Casilla ubicacion; 

    public Heroe(String nombre, String animacion, int vidas, int puntuacion, char direccion) {
        this.nombre = nombre;
        this.animacion = animacion;
        this.vidas = vidas;
        this.puntuacion = puntuacion;
        /**
         * es la ubicacion actual del heroe
         */
        this.ubicacion = (Casilla) null;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAnimacion() {
        return animacion;
    }
    public void setAnimacion(String animacion) {
        this.animacion = animacion;
    }
    public int getVidas() {
        return vidas;
    }
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public Casilla getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(Casilla ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    //metodos a trabajar
     public void mover(){
    	Scanner move = new Scanner (System.in);
    	char walk = move.next().charAt(0);
    	switch (walk){
    	case 'w':
    		//arriba
    		break;
    	case 'a':
    		//izquierda
    		break;
    	case 's':
    		//abajo
    		break;
    	case 'd':
    		//derecha
    		break;
    	default:
    		break;
    	}
    }
}
