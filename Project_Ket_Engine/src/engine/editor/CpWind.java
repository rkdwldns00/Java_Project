package engine.editor;

import engine.*;

public class CpWind extends Monobehavier{
	@Override
	public void start() {
		transform.position = new Vector2(-4,getRandomFloat(-2, 2));
	}
	
	@Override
	public void update() {
		transform.translate(Vector2.right.mul(Time.deltaTime));
	}
	
	@Override
	public <T extends Collider> void onCollision(T collision) {
		RigidBody rigid = collision.gameObject.getComponent(new RigidBody());
		if(rigid != null) {
			rigid.addForce(Vector2.right.mul(Time.deltaTime * 3));
		}
	}
}
