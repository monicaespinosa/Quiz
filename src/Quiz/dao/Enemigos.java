package Quiz.dao;
public class Enemigos {
    private String nombre;
    /**
     * animacion es el movimiento del personaje
     */
    private String animacion;
    private String nEnemigosNivel;
    private String nVelocidad;
    private Casilla casilla;

    public Enemigos(String nombre, String animacion, String nEnemigosNivel, String nVelocidad, Casilla casilla) {
        this.nombre = nombre;
        this.animacion = animacion;
        this.nEnemigosNivel = nEnemigosNivel;
        this.nVelocidad = nVelocidad;
        this.casilla = casilla;
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
    public String getnEnemigosNivel() {
        return nEnemigosNivel;
    }
    public Casilla getCasilla() {
        return casilla;
    }
    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }
    public void setnEnemigosNivel(String nEnemigosNivel) {
        this.nEnemigosNivel = nEnemigosNivel;
    }
    public String getnVelocidad() {
        return nVelocidad;
    }
    public void setnVelocidad(String nVelocidad) {
        this.nVelocidad = nVelocidad;
    }
    
    //no estoy seguro porque este lo cubre todo
    public void moverAtacar(){
        
    }
    
    
}
