package Quiz.dao;
import java.util.ArrayList;
public class Objetivo {
    private String nombre;
    private int nObjetosNivel;
    private int valor;
    private ArrayList<Casilla> casillas;

    public Objetivo(String nombre, int nObjetosNivel, int valor, ArrayList<Casilla> casillas) {
        this.nombre = nombre;
        this.nObjetosNivel = nObjetosNivel;
        this.valor = valor;
        this.casillas = casillas;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getnObjetosNivel() {
        return nObjetosNivel;
    }
    public void setnObjetosNivel(int nObjetosNivel) {
        this.nObjetosNivel = nObjetosNivel;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }
    public void setCasillas(ArrayList<Casilla> casillas) {
        this.casillas = casillas;
    }

    
    
}
