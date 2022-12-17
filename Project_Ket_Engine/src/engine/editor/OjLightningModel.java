package engine.editor;

import engine.*;

public class OjLightningModel extends GameObject{
	OjLightningModel(){
		addComponents(new SpriteRenderer());
		addComponents(new CpLightningModel());
	}
}
