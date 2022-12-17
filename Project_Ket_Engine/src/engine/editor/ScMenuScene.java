package engine.editor;

import engine.*;

public class ScMenuScene extends Scene{
	public ScMenuScene() {
		super();
		instantiate(new OjStartButton(), new Vector2(0,-0.5f), new Vector2(5,1));
		//instantiate(new OjPhisicsLabButton(), new Vector2(0,-1.7f), new Vector2(5,1));
		instantiate(new OjEngineIcon(), new Vector2(0,1), new Vector2(7,1.5f));
	}
}
