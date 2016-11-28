package Quiz.dao;
public class Obstaculo {
    private String nombre;
    private int nObstaculosNivel;
    private Casilla casilla;

    public Obstaculo(String nombre, int nObstaculosNivel, Casilla casilla) {
        this.nombre = nombre;
        this.nObstaculosNivel = nObstaculosNivel;
        this.casilla = casilla;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getnObstaculosNivel() {
        return nObstaculosNivel;
    }
    public void setnObstaculosNivel(int nObstaculosNivel) {
        this.nObstaculosNivel = nObstaculosNivel;
    }
    public Casilla getCasilla() {
        return casilla;
    }
    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }
    
}
