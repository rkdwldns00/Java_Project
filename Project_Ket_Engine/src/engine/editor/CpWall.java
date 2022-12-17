package engine.editor;

import engine.*;

public class CpWall extends Monobehavier{
	@Override
	public <T extends Collider> void onCollision(T collision) {
		if(gameObject.getComponent(new RigidBody()) != null)
			gameObject.getComponent(new RigidBody()).active = false;
	}
}
