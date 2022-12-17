package engine.editor;

import engine.*;

public class CpFlash extends Monobehavier {
	float timer;
	SpriteRenderer renderer;
	
	@Override
	public void start() {
		renderer = gameObject.getComponent(new SpriteRenderer());
	}
	
	
	@Override
	public void update() {
		timer+=Time.deltaTime;
		if(timer>=1f) {
			gameObject.active = false;
		}
		renderer.alpha = 1 - timer;
	}
}
