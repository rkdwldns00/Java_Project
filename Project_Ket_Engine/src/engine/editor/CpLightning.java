package engine.editor;

import engine.*;

public class CpLightning extends Monobehavier {
	float timer;
	float his = 1;
	Collider col;
	
	@Override
	public void start() {
		transform.position = new Vector2(getRandomFloat(-5, 5),0);
		instantiate(new OjWarring(), transform.position, transform.scale);
		col = gameObject.getComponent(new Collider());
		col.active = false;
	}
	
	@Override
	public void update() {
		timer+=Time.deltaTime;
		if(timer >= 1.3f) {
			gameObject.active = false;
		}
		else if(timer >= his) {
			col.active = true;
			his+=0.05f;
			instantiate(new OjLightningModel(), transform.position.add(Vector2.right.mul(getRandomFloat(-0.2f, 0.2f))), transform.scale);
		}
	}
}
