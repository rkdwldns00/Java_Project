package engine.editor;

/*import engine.Engine;
import engine.Scene;
import engine.GameObject;
*/
import engine.*;

public class Main extends engine.Main{
	
	public Main(){
		System.out.println("engine.editor.Main ��ü ���� - ������ ��ü ����");
	}
	
	public void editor() {
		System.out.println("engine.editor.Main.editor ȣ��� - ������ ����");
		GameObject g = nowScene.createGameObject();
		g.addComponents(new rigidBody());
		g.addComponents(new Test());
		System.out.println("nowScene : "+nowScene);
		e.LoadScene(nowScene);
	}
}
