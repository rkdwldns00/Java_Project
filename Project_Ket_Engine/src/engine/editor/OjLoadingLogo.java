package engine.editor;

import engine.*;

public class OjLoadingLogo extends GameObject {
	OjLoadingLogo() {
		addComponents(new SpriteRenderer("/image/liyue.png"));
		addComponents(new CpLoadingLogo());
	}
}
