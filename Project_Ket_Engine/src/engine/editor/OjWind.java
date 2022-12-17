package engine.editor;

import engine.*;

public class OjWind extends GameObject {
	OjWind() {
		addComponents(new SpriteRenderer("/image/wind.png"));
		addComponents(new CpWind());
		addComponents(new Collider()).isTrigger = true;
	}
}
