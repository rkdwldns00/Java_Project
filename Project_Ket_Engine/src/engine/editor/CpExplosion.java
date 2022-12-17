package engine.editor;

import engine.*;

public class CpExplosion extends Monobehavier{
	float timer;
	SpriteRenderer renderer;
	
	@Override
	public void start() {
		renderer = gameObject.getComponent(new SpriteRenderer());
	}
	
	@Override
	public void update() {
		timer += Time.deltaTime;
		if(timer >= 1) {
			gameObject.active = false;
		}
		renderer.alpha = 1f - timer;
		transform.scale = transform.scale.mul(1+Time.deltaTime);
	}
}
