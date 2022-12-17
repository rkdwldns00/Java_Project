package engine.editor;

import engine.*;

public class CpEnemyExplosion extends CpExplosion {
	Collider col;
	
	int frameCount;
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		col = gameObject.getComponent(new Collider());
	}
	
	@Override
	public void update() {
		super.update();
		frameCount++;
		if(frameCount==2) {
			col.active = false;
		}
	}
}
