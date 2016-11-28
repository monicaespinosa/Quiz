package Quiz.dao;
public class Objetivo {
    private String nombre;
    private String nObjetosNivel;
    private int valor;
    private Casilla casilla;

    public Objetivo(String nombre, String nObjetosNivel, int valor, Casilla casilla) {
        this.nombre = nombre;
        this.nObjetosNivel = nObjetosNivel;
        this.valor = valor;
        this.casilla = casilla;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getnObjetosNivel() {
        return nObjetosNivel;
    }
    public void setnObjetosNivel(String nObjetosNivel) {
        this.nObjetosNivel = nObjetosNivel;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Casilla getCasilla() {
        return casilla;
    }
    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    
    
}
