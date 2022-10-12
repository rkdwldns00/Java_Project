package engine;

public class Scene {
	GameObject[] objects = new GameObject[1000];
	private int objectsCount = 0;
	boolean active = false;
	
	public GameObject createGameObject(Vector3 pos,Vector3 rot,Vector3 scale) {
		objects[objectsCount] = new GameObject(pos,rot,scale);
		System.out.println("engine.Scene.createGameObject »£√‚µ  - "+"¿Â∏È : "+this+", ∞¥√º : "+objects[objectsCount]);
		objectsCount++;
		return objects[objectsCount-1];
	}
	
	public GameObject createGameObject() {
		return createGameObject(Vector3.zero,Vector3.zero,Vector3.zero);
	}
}
