package engine.editor;

import engine.*;

public class OjHomeButton extends GameObject {
	OjHomeButton() {
		addComponents(new SpriteRenderer("/image/homeButton.png"));
		addComponents(new CpExitGame());
	}
}
