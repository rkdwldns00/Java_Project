package engine.editor;

import engine.*;

public class ScGameScene extends Scene{
	ScGameScene(){
		super();
		instantiate(new OjBackGround(), Vector2.zero, Vector2.one.mul(10));
		instantiate(new OjBackGround(), Vector2.up.mul(10), Vector2.one.mul(10));
		instantiate(new OjPlayer(),Vector2.zero,Vector2.one.mul(1));
		instantiate(new OjWall(),new Vector2(5.5f,0),new Vector2(2,8));
		instantiate(new OjWall(),new Vector2(-5.5f,0),new Vector2(2,8));
		instantiate(new OjWall(),new Vector2(0,3.6f),new Vector2(12,2));
		instantiate(new OjWall(),new Vector2(0,-3.4f),new Vector2(12,2));
		instantiate(new OjGameManager(), Vector2.zero, Vector2.one);
	}
}
