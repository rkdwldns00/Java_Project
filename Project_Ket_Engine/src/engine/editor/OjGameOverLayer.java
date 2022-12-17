package engine.editor;

import engine.*;

public class OjGameOverLayer extends GameObject{
	OjGameOverLayer(){
		addComponents(new CpUi());
		transform.position = new Vector2(0,10);
	}
}
