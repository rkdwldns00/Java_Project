package engine.editor;

/*import engine.Engine;
import engine.Scene;
import engine.GameObject;
*/
import engine.*;

public class Main extends engine.Main{
	
	public Main(){
		System.out.println("engine.editor.Main 객체 생성 - 에디터 객체 생성");
	}
	
	public void editor() {
		System.out.println("engine.editor.Main.editor 호출됨 - 에디터 실행");
		GameObject g = nowScene.createGameObject();
		g.addComponents(new rigidBody());
		g.addComponents(new Test());
		System.out.println("nowScene : "+nowScene);
		e.LoadScene(nowScene);
	}
}
