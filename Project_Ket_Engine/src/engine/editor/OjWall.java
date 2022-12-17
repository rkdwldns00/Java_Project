package engine.editor;

import engine.*;

public class OjWall extends GameObject{
	OjWall(){
		tag = "wall";
		addComponents(new Collider());
		//addComponents(new SpriteRenderer("/image/test.png"));
	}
}
