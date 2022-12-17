package engine.editor;

import engine.*;

public class OjGameOverText extends GameObject{
	OjGameOverText(){
		addComponents(new SpriteRenderer("/image/gameoverText.png"));
		transform.scale = new Vector2(4,1);
	}
}
