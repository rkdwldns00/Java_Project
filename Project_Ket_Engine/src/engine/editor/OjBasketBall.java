package engine.editor;

import engine.*;

public class OjBasketBall extends GameObject{
	OjBasketBall(){
		tag = "enemy";
		transform.scale = new Vector2(0.6f,0.6f);
		addComponents(new SpriteRenderer("/image/basketBall.png"));
		addComponents(new RigidBody());
		addComponents(new Collider()).isTrigger = true;
		addComponents(new CpBasketBall());
	}
}
