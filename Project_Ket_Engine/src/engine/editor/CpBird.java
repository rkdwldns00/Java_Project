package engine.editor;

import java.util.Random;

import engine.*;

public class CpBird extends Monobehavier{
	Vector2 rot;
	@Override
	public void start() {
		transform.position = new Vector2((getRandomBinary() - 0.5f) * 10,getRandomFloat(-3, 3));
		rot = new Vector2((new Random().nextInt() % 2 - 0.5f) * 6,(new Random().nextFloat() - 0.5f) * 4).sub(transform.position);
		if(rot.x < 0f) {
			gameObject.getComponent(new SpriteRenderer()).setImg("/image/bird2.png");
		}
	}
	
	@Override
	public void update() {
		transform.translate(rot.mul(Time.deltaTime));
	}
}
