package engine.editor;

import engine.*;

public class CpBasketBall extends Monobehavier{
	RigidBody rigid;
	
	@Override
	public void start() {
		transform.position = new Vector2((2 + getRandomFloat(0, 2)) * getRandomInArray(new float[]{-1,1}),-3f) ;
		rigid = gameObject.getComponent(new RigidBody());
		rigid.velocity = new Vector2(-transform.position.x,11);
	}
}
