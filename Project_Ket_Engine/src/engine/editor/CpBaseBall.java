package engine.editor;

import engine.*;

public class CpBaseBall extends Monobehavier{
	Vector2 dir;
	boolean isShoted;
	float timer;
	
	@Override
	public void start() {
		transform.position = new Vector2(getRandomFloat(-5, 5),getRandomInArray(new float[] {-5,5}));
		dir = Vector2.up.mul(-transform.position.y);
		instantiate(new OjWarring(), new Vector2(transform.position.x,0), new Vector2(1f,7));
	}
	
	@Override
	public void update() {
		if(isShoted) {
			transform.translate(dir.mul(Time.deltaTime * 3));
		}else {
			timer+=Time.deltaTime;
			if(timer>=0.9f) {
				isShoted = true;
			}
		}
	}
}
