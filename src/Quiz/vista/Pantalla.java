package Quiz.vista;
import Quiz.dao.*;
//no se si deberia ir es su paquete al tratarse de la interface visual
public class Pantalla {
    private int alto;
    private int largo;
    private int bloquePixel;
    private int bloqueX;
    private int bloqueY;

    public Pantalla(int alto, int largo, int bloquePixel, int bloqueX, int bloqueY) {
        this.alto = alto;
        this.largo = largo;
        this.bloquePixel = bloquePixel;
        this.bloqueX = bloqueX;
        this.bloqueY = bloqueY;
    }

    public int getAlto() {
        return alto;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
    public int getBloquePixel() {
        return bloquePixel;
    }
    public void setBloquePixel(int bloquePixel) {
        this.bloquePixel = bloquePixel;
    }
    public int getBloqueX() {
        return bloqueX;
    }
    public void setBloqueX(int bloqueX) {
        this.bloqueX = bloqueX;
    }
    public int getBloqueY() {
        return bloqueY;
    }
    public void setBloqueY(int bloqueY) {
        this.bloqueY = bloqueY;
    }
    
    
}
