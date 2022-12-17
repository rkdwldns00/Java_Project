package engine.editor;

import engine.*;

public class OjLightning extends GameObject{
	OjLightning(){
		tag = "enemy";
		addComponents(new Collider());
		addComponents(new CpLightning());
		//addComponents(new SpriteRenderer("/image/test.png"));
		transform.scale = new Vector2(1,8);
	}
}
