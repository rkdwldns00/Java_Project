package engine;

import java.awt.Image;
import javax.swing.ImageIcon;

public class SpriteRenderer extends Monobehavier{
	Image img;
	public float alpha = 1f;
	
	public SpriteRenderer(String root){
		img = new ImageIcon(Main.class.getResource(root)).getImage();
	}
	
	public SpriteRenderer(){
		this("");
	}
	
	public void setImg(String root) {
		img = new ImageIcon(Main.class.getResource(root)).getImage();
	}
}
