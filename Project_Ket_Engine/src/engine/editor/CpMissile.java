package engine.editor;

import engine.*;

public class CpMissile extends Monobehavier{
	Vector2 targetPos;
	float timer;
	
	@Override
	public void start() {
		targetPos = CpPlayerControl.player.transform.position;
		transform.position = targetPos.add(Vector2.one.mul(-10));
		instantiate(new OjMissilWarring(), targetPos, Vector2.one.mul(3));
	}
	
	@Override
	public void update() {
		timer+=Time.deltaTime;
		if(timer <= 1) {
			transform.translate(Vector2.one.mul(10 * Time.deltaTime));
		}else {
			//instantiate(new OjEnemyExplosion(), transform.position, Vector2.one.mul(1));
			gameObject.active = false;
		}
	}
}
