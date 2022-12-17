package engine.editor;

import engine.*;

public class OjWarring extends GameObject{
	OjWarring(){
		addComponents(new SpriteRenderer("/image/warring.png")).alpha = 0f;
		addComponents(new CpWarring());
	}
}
