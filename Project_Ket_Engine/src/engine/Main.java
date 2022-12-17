package engine;

import engine.editor.EngineTerminal;

//import engine.editor.*;

public class Main extends Engine{
	public static Engine Manager = new engine.editor.EngineTerminal();
	public static void main(String[] args) {
		engine.editor.EngineTerminal editor = (EngineTerminal)Manager;
		editor.editor();
	}
}
