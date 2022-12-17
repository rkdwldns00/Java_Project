package engine;

import java.util.HashMap;

public class RigidBody extends Monobehavier{
	public Vector2 velocity = Vector2.zero;
	public float drag = 0.05f;
	public float mass = 1f;
	public boolean useGravity = true;
	public static HashMap<String, String> ignoreTag = new HashMap<String, String>();
	
	@Override
	public void fixedUpdate() {
		if(useGravity) {
			velocity = velocity.add(Vector2.down.mul(9.80665f).mul(Time.fixedTime));
		}
		velocity = velocity.sub(velocity.mul(drag * Time.fixedTime / 2));
		gameObject.transform.translate(velocity.mul(Time.fixedTime));
		//System.out.println(velocity);
	}
	
	public void addForce(Vector2 v) {
		velocity = velocity.add(v);
	}
}
