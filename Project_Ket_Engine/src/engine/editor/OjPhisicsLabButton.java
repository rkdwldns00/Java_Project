package engine.editor;

import engine.*;

public class OjPhisicsLabButton extends GameObject {
	OjPhisicsLabButton() {
		addComponents(new SpriteRenderer("/image/phisicsButton.gif"));
		addComponents(new CpPhisicsLabStart());
	}
}
