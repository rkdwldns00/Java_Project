package engine.editor;

import engine.*;

public class EngineTerminal extends engine.Main{
	
	public void editor() {
		//Manager.LoadScene(new ScMenuScene());
		Manager.LoadScene(new ScLoadingScene());
		RigidBody.ignoreTag.put("wall", "enemy");
	}
}
