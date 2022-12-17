package engine.editor;

import engine.*;

public class OjMissile extends GameObject{
	public OjMissile() {
		addComponents(new SpriteRenderer("/image/missile.png"));
		addComponents(new CpMissile());
	}
}
