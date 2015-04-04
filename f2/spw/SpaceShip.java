package f2.spw;

import java.awt.Color;
import java.awt.Graphics2D;

public class SpaceShip extends Sprite{

	int step = 15;
	
	public SpaceShip(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
		
	}

	public void move(int direction){
		x += (step * direction);
		if(x < 0)
			x = 0;
		if(x > 500 - width)
			x = 500 - width;
			
			
		y += (step * direction);
		if(y < 0)
			y = 0;
		if(y > 800 - height)
			y = 800 - height;
	}

}
