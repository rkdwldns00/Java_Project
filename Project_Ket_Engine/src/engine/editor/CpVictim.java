package engine.editor;

import engine.*;

public class CpVictim extends Monobehavier{
	boolean isDie = false;
	boolean isUiSpawned;
	float timer;
	
	@Override
	public <T extends Collider> void onCollision(T collision) {
		if(collision.gameObject.compareTag("enemy")) {
			gameObject.getComponent(new Collider()).active = false;
			gameObject.getComponent(new RigidBody()).useGravity = true;
			gameObject.getComponent(new CpPlayerControl()).active = false;
			isDie = true;
			instantiate(new OjExplosion(), transform.position, Vector2.one.mul(1));
		}
	}
	
	@Override
	public void update() {
		if(isDie) {
			timer += Time.deltaTime;
			if(timer >= 0.05f) {
				timer = 0f;
				instantiate(new OjExplosion(), transform.position.add(new Vector2(getRandomFloat(-0.4f, 0.4f),getRandomFloat(-0.5f, 0.5f))), new Vector2(1.2f,1).mul(getRandomFloat(0.2f, 0.3f)));
			}
			if(!isUiSpawned) {
				isUiSpawned = true;
				CpGameManager.gamemanager.active = false;
				instantiate(new OjGameOverLayer(), null, null);
			}
		}
	}
}
