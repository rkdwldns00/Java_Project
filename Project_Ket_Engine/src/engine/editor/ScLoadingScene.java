package engine.editor;

import engine.*;

public class ScLoadingScene extends Scene{
	ScLoadingScene(){
		super();
		instantiate(new OjGameNum(), Vector2.zero, Vector2.one.mul(10)).getComponent(new SpriteRenderer()).setImg("/image/background.png");;
		instantiate(new OjLoadingLogo(), Vector2.zero, Vector2.one);
	}
}
