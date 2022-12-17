package engine.editor;

import engine.*;

public class CpPlayerControl extends Monobehavier{
	private RigidBody rigid;
	static GameObject player;
	float score;
	
	@Override
	public void start() {
		player = gameObject;
		rigid = gameObject.getComponent(new RigidBody());
		rigid.useGravity = false;
	}
	
	@Override
	public void update() {
		if(Input.getMouseDown()) {
			//rigid.velocity = (Input.getMousePos().sub(transform.position).mul(2));
			rigid.velocity = (transform.position.sub(Input.getMousePos()).mul(2));
			//rigid.addForce((transform.position.sub(Input.getMousePos()).mul(2)));
		}
		score+=Time.deltaTime;
		//instantiate(new OjChild(), Vector2.zero, Vector2.one).parent = gameObject;
	}
	
	@Override
	public void fixedUpdate() {
		
	}
}