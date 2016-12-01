package Quiz1;

import java.awt.Graphics2D;
import java.util.Random;

public class Enemigos {
    int x[];
    int y[];
    int xa[];
    int ya[];
    int tamano;
    private Game game;

    public Enemigos(int[] x, int[] y, Game game, int tamano) {
        this.tamano=tamano;
        this.x = new int[tamano];
        this.y = new int [tamano];
        this.xa= new int[tamano];
        this.ya= new int [tamano];
        this.game = game;
        for (int i = 0; i < tamano; i++) {
            this.x[i]=x[i];
            this.y[i]=y[i];
            this.xa[i]=1;
            this.ya[i]=1;
        }      
        
    }
    
    void move() {
        for (int i = 0; i < tamano; i++) {
            if (x[i] + xa[i] < 0){
                xa[i] = 1;
            }if (x[i] + xa[i] > game.getWidth() - 30){
                xa[i] = -1;
            }if (y[i] + ya[i] < 0){
                ya[i] = 1;
            }if (y[i] + ya[i] > game.getHeight() - 30){
                ya[i] = -1;
            }
            Random rnd = new Random();
            x[i] = x[i]+ (int)(rnd.nextDouble()*10-5) + xa[i];
            y[i] = y[i]+ (int)(rnd.nextDouble()*10-5) + ya[i];
        }
            
    }
    public void paint(Graphics2D g) {
	for (int i = 0; i < 10; i++) {
            g.fillOval(x[i], y[i], 30, 30);
        }
        
    }
    
}
