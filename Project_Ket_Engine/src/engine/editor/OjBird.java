package engine.editor;

import engine.*;

public class OjBird extends GameObject{
	OjBird(){
		tag = "enemy";
		addComponents(new SpriteRenderer("/image/bird.png"));
		addComponents(new Collider()).isTrigger = true;
		addComponents(new CpBird());
	}
}