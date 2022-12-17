package engine.editor;

import engine.*;

public class CpGas extends Monobehavier{
	float timer;
	Collider col;
	SpriteRenderer renderer;
	
	@Override
	public void start() {
		col=gameObject.getComponent(new Collider());
		renderer = gameObject.getComponent(new SpriteRenderer());
		renderer.alpha = 0f;
		col.active = false;
		transform.position = new Vector2(getRandomFloat(-2, 2),getRandomFloat(-2, 2));
		instantiate(new OjWarring(), transform.position, transform.scale);
	}
	
	@Override
	public void update() {
		timer+=Time.deltaTime;
		if(timer >= 9) {
			gameObject.active = false;
		}if(timer >= 8) {
			col.active = false;
			renderer.alpha = 9-timer;
		}else if(timer >= 2f) {
			renderer.alpha = 1f;
			col.active = true;
		}else if(timer >= 1f){
			renderer.alpha = timer - 1;
		}
	}
}
