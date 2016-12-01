package Quiz.dao;
public class Casilla {
    private int nPosicion_x;
    private int nPosicion_y;
    private int tamano_x;
    private int tamano_y;

    public Casilla(int nPosicion_x, int nPosicion_y, int tamano_x, int tamano_y) {
        this.nPosicion_x = nPosicion_x;
        this.nPosicion_y = nPosicion_y;
        this.tamano_x = tamano_x;
        this.tamano_y = tamano_y;
    }
    /**
     * se manejan coordenadas 'x' y 'y' debido a que despues
     * facilita el movimiento del heroe.
     * @return
     */
    public int getnPosicion_x() {
        return nPosicion_x;
    }
    public void setnPosicion_x(int nPosicion_x) {
        this.nPosicion_x = nPosicion_x;
    }
    public int getnPosicion_y() {
        return nPosicion_y;
    }
    public void setnPosicion_y(int nPosicion_y) {
        this.nPosicion_y = nPosicion_y;
    }
    public int getTamano_x (int tamano_x){
    	return tamano_x;
    }
    public void setTamano_x(int tamano_x){
    	this.tamano_x = tamano_x;
    }
    public int getTamano_y(int tamano_y){
    	return tamano_y;
    }
    public void setTamano_y(int tamano_y){
    	this.tamano_y = tamano_y;
    }
    
}
