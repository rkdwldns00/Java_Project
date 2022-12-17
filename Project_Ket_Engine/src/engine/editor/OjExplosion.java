package engine.editor;

import engine.*;

public class OjExplosion extends GameObject{
	OjExplosion(){
		addComponents(new SpriteRenderer("/image/explosion.png"));
		addComponents(new CpExplosion());
	}
}
