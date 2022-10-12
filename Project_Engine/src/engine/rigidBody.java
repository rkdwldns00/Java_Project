package engine;

public class rigidBody extends Monobehavier{
	public Vector3 velocity = Vector3.zero;
	public float drag = 0.05f;
	public boolean useGravity;
	
	@Override
	public void update() {
		velocity = velocity.add(Vector3.down.mul(9.80665f).mul(Time.deltaTime));
	}
}
