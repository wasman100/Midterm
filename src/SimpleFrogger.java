

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;




public class SimpleFrogger extends GraphicsProgram {
	

	private static final int SQUARE_SIZE = 75;
	private static final int NROWS = 4;
	private static final int NCOLUMNS = 7;

	private GImage frog; 
	private double frogx; 
	private double frogy; 
	public static final int APPLICATION_WIDTH = NCOLUMNS * SQUARE_SIZE;
	public static final int APPLICATION_HEIGHT = NROWS * SQUARE_SIZE;
	
	public void run() {
		frog = new GImage("C:\\Users\\wesmo\\eclipse-workspace\\Midterm\\images.jpg");
		frogx = (NCOLUMNS / 2 + 0.5) * SQUARE_SIZE;
		frogy = (NROWS - 0.5) * SQUARE_SIZE;
		add(frog, frogx - frog.getWidth() / 2, frogy - frog.getHeight() / 2);
		addMouseListeners();
	}


	public void mouseClicked(MouseEvent e) {
		double mx = e.getX();
		double my = e.getY();
		if (Math.abs(mx - frogx) > Math.abs(my - frogy)) {
			if (mx > frogx) {
				moveFrog(SQUARE_SIZE, 0);
			} else {
				moveFrog(-SQUARE_SIZE, 0);
			}
		} else {
			if (my > frogy) {
				moveFrog(0, SQUARE_SIZE);
			} else {
				moveFrog(0, -SQUARE_SIZE);
			}
		}
	}


	private void moveFrog(double dx, double dy) {
		if (insideFroggerWorld(frogx + dx, frogy + dy)) {
			frogx += dx;
			frogy += dy;
			frog.move(dx, dy);
		}
	}

	private boolean insideFroggerWorld(double x, double y) {
		return (x >= 0 && x <= NCOLUMNS * SQUARE_SIZE && y >= 0 && y <= NROWS * SQUARE_SIZE);
	}


}