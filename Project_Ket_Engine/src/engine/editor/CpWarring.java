package engine.editor;

import engine.*;

public class CpWarring extends Monobehavier{
	SpriteRenderer renderer;
	float timer = 0f;
	float countDown = 1f;
	
	@Override
	public void start() {
		renderer = gameObject.getComponent(new SpriteRenderer());
	}
	
	@Override
	public void update() {
		timer+=Time.deltaTime;
		if(timer <= 0.5f) {
			renderer.alpha = timer;
		}
		if(timer >= countDown) {
			die();
		}
	}
	
	protected void die() {
		gameObject.active = false;
	}
}
