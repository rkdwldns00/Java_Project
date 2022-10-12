package engine;

//import java.awt.Window.Type;

public class GameObject {
	Monobehavier[] components = new Monobehavier[100];
	Transform transform;
	boolean active = true;
	GameObject parent = null;
	
	private int componentsCount = 0;
	
	GameObject(Vector3 pos,Vector3 rot,Vector3 scale){
		System.out.println("GameObject »ý¼ºµÊ");
		transform = new Transform(pos,rot,scale);
	}
	
	public Monobehavier addComponents(Monobehavier c) {
		components[componentsCount] = c;
		c.init(this);
		componentsCount++;
		return c;
	}
	
	public Monobehavier getComponent(Monobehavier t) {
		for(Monobehavier c : components) {
			if(c != null) {
				if(c.getClass().getName() == (t).getClass().getName()) {
					return c;
				}
			}
		}
		return null;
	}
}
