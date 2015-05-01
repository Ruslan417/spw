package f2.spw;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Item extends Sprite{
	public static final int Y_TO_FADE = 400;
	public static final int Y_TO_DIE = 600;
	
	private int step = 50;
	private boolean alive = true;
	private Image pic;
	private int points = 0;
	public Item(int x, int y) {
		super(x, y, 5, 10);
		
	}
	
	@Override
	public void draw(Graphics2D g) {
		if(y < Y_TO_FADE)
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
		else{
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 
					(float)(Y_TO_DIE - y)/(Y_TO_DIE - Y_TO_FADE)));
		}
		
		if((int)(Math.random()*2) == 0)	
			g.setColor(Color.PINK);			
		else
			g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	
		
	}

	public void proceed(){
		y += step;
		if(y > Y_TO_DIE){
			points += 50;
		}
	}
	
	public boolean isAlive(){
		return alive;
	}
}
