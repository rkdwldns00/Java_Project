package engine.editor;

import engine.*;

public class OjEnemyExplosion extends GameObject{
	OjEnemyExplosion(){
		tag = "enemy";
		addComponents(new SpriteRenderer("/image/explosion.png"));
		addComponents(new CpEnemyExplosion());
		addComponents(new Collider());
	}
}
