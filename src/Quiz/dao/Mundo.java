package Quiz.dao;
import java.util.ArrayList;
public class Mundo {
    private int numero;
    private int alto;
    private int ancho;
    private ArrayList<Enemigos> enemigos;
    private ArrayList<Objetivo> objetos;
    private ArrayList<Obstaculo> obstaculos;
    
    public ArrayList<Enemigos> getEnemigos() {
        return enemigos;
    }
    public void setEnemigos(ArrayList<Enemigos> enemigos) {
        this.enemigos = enemigos;
    }
    public ArrayList<Objetivo> getObjetos() {
        return objetos;
    }
    public void setObjetos(ArrayList<Objetivo> objetos) {
        this.objetos = objetos;
    }
    public ArrayList<Obstaculo> getObstaculos() {
        return obstaculos;
    }
    public void setObstaculos(ArrayList<Obstaculo> obstaculos) {
        this.obstaculos = obstaculos;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getAlto() {
        return alto;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    
}
