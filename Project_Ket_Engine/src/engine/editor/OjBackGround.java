package engine.editor;

import engine.*;

public class OjBackGround extends GameObject{
	OjBackGround(){
		addComponents(new SpriteRenderer("/image/sky.jpg"));
		addComponents(new CpBackGroundScroll());
	}
}
