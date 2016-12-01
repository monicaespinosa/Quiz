
package juego;

import java.awt.*;
import javax.swing.*;

public class Juego extends JPanel{
    int x = 0;
	int y = 0;

	public void moveBall() {
		x = x + 10;
		y = y + 10;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);
	}
}
