package Quiz.dao;
public class Casilla {
    private String nombreArchivo;
    private int nPosicion_x;
    private int nPosicion_y;

    public Casilla(String nombreArchivo, int nPosicion_x, int nPosicion_y) {
        this.nombreArchivo = nombreArchivo;
        this.nPosicion_x = nPosicion_x;
        this.nPosicion_y = nPosicion_y;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
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
    
}
