package engine;

import engine.editor.*;

public class Main extends Engine{
	public static Engine e = new Engine();
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		System.out.println("enigine.Main.main 호출됨 - 프로그램 시작");
		engine.editor.Main editor = new engine.editor.Main();
		editor.editor();
	}
}
