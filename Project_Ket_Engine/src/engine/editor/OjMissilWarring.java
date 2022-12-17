package engine.editor;

import engine.*;

public class OjMissilWarring extends GameObject{
	OjMissilWarring(){
		addComponents(new SpriteRenderer("/image/warring.png"));
		addComponents(new CpMissleWarring());
	}
}
