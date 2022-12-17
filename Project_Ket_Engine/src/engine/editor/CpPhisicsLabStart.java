package engine.editor;

import engine.*;

public class CpPhisicsLabStart extends Button {
	@Override
	public void onClick() {
		Main.Manager.LoadScene(new ScPhisicsLab());
	}
}
