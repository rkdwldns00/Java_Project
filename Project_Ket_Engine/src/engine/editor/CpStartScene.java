package engine.editor;

import engine.*;

public class CpStartScene extends Button{
	@Override
	public void onClick() {
		Main.Manager.LoadScene(new ScGameScene());
	}
}
