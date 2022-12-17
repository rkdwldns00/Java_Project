package engine;

public class Scene implements PrefabInstance{
	GameObject[] objects = new GameObject[1000];
	boolean active = false;
	public int fps = 60;
	
	protected Scene(){
		Engine.nowScene = this;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends GameObject> T instantiate(T prefab,Vector2 pos,Vector2 scale) {
		for(int i = 0;i<objects.length;i++) {
			if(objects[i] == null) {
				objects[i] = prefab;
				if(pos!=null) {
					objects[i].transform.position = pos;
				}
				if(scale!=null) {
					objects[i].transform.scale = scale;
				}
				
				for(Monobehavier m : objects[i].components) {
					if(m == null) {
						break;
					}
					m.start();
				}
				return (T)objects[i];
			}
		}
		return null;
		/*objects[objectsCount] = prefab;
		objects[objectsCount].transform.position = pos;
		objects[objectsCount].transform.scale = scale;
		objectsCount++;
		return (T)objects[objectsCount-1];*/
	}
}
