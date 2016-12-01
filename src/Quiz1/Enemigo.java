/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import java.awt.*;
import java.util.Random;

/**
 *
 * @author julia
 */
public class Enemigo {
    int x  ;
    int y ;
    int xa = 1;
    int ya = 1;
    private Game game;
    public Enemigo (Game game, int x, int y) {
	this.game= game;
        this.x=x;
        this.y=y;
    }
    void move() {
        if (x + xa < 0){
            xa = 1;
        }if (x + xa > game.getWidth() - 30){
            xa = -1;
        }if (y + ya < 0){
            ya = 1;
        }if (y + ya > game.getHeight() - 30){
            ya = -1;
        }
        Random rnd = new Random();
        x = x+ (int)(rnd.nextDouble()*10-5) + xa;
        y = y+ (int)(rnd.nextDouble()*10-5) + ya;
    }

    public void paint(Graphics2D g) {
	g.fillOval(x, y, 30, 30);
    }
}
