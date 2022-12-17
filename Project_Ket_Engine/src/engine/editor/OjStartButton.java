package engine.editor;

import engine.*;

public class OjStartButton extends GameObject{
	OjStartButton(){
		addComponents(new CpStartScene());
		addComponents(new SpriteRenderer("/image/StartButton.png"));
	}
}
