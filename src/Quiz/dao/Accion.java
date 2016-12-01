package Quiz.dao;
public class Accion {
    private String mover;
    private Casilla casilla;

    public Accion(String mover, Casilla casilla) {
        this.mover = mover;
        this.casilla = casilla;
    }
    public String getMover() {
        return mover;
    }
    public void setMover(String mover) {
    	/**
    	 * 
    	 */
        this.mover = mover;
    }
    public Casilla getCasilla() {
        return casilla;
    }
    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }
    
}
 