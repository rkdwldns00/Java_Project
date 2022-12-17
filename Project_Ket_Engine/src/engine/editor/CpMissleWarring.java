package engine.editor;

import engine.*;

public class CpMissleWarring extends CpWarring {
	@Override
	protected void die() {
		instantiate(new OjEnemyExplosion(), transform.position, Vector2.one.mul(3));
		super.die();
	}
}
