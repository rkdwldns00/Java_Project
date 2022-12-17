package engine.editor;

import engine.*;

public class CpMenuButton extends Button{
	@Override
	public void onClick() {
		Main.Manager.LoadScene(new ScMenuScene());
	}
}
