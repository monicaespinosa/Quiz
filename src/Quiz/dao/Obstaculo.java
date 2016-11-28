package Quiz.dao;
public class Obstaculo {
    private String nombre;
    private String nObstaculosNivel;
    private Casilla casilla;

    public Obstaculo(String nombre, String nObstaculosNivel, Casilla casilla) {
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
    public String getnObstaculosNivel() {
        return nObstaculosNivel;
    }
    public void setnObstaculosNivel(String nObstaculosNivel) {
        this.nObstaculosNivel = nObstaculosNivel;
    }
    public Casilla getCasilla() {
        return casilla;
    }
    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }
    
}
