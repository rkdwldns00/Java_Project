package engine;

//import java.awt.Window.Type;

public class GameObject {
	Monobehavier[] components = new Monobehavier[100];
	public Transform transform;
	public boolean active = true;
	public GameObject parent = null;
	public String tag = "null";
	
	private int componentsCount = 0;
	
	protected GameObject(Vector2 pos,Vector2 scale){
		transform = new Transform(pos,scale);
	}
	
	protected GameObject(){
		this(Vector2.zero,Vector2.one);
	}
	
	public <T extends Monobehavier> T addComponents(T c) {
		components[componentsCount] = c;
		c.init(this);
		componentsCount++;
		return c;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Monobehavier> T getComponent (T t) {
		for(Monobehavier c : components) {
			if(c != null) {
				if(c.getClass().getName() == t.getClass().getName() && c.active) {
					return (T)c;
				}
			}else {
				break;
			}
		}
		return null;
	}
	
	public boolean compareTag(String s) {
		return tag.equals(s);
	}
}
