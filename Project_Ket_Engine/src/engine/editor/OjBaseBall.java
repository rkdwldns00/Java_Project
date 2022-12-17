package engine.editor;

import engine.*;

public class OjBaseBall extends GameObject{
	public OjBaseBall() {
		tag = "enemy";
		addComponents(new SpriteRenderer("/image/baseBall.png"));
		addComponents(new CpBaseBall());
		addComponents(new Collider());
	}
}
