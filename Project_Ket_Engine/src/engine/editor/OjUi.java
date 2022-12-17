package engine.editor;

import engine.*;

public class OjUi extends GameObject{
	OjUi(){
		addComponents(new SpriteRenderer("/image/ui.png"));
		transform.scale = new Vector2(5,4);
	}
}
