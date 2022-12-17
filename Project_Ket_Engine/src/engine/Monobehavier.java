package engine;

import java.util.Random;

public class Monobehavier implements PrefabInstance{
	public boolean active = true;
	public GameObject gameObject;
	public Transform transform;
	
	void init(GameObject g) {
		gameObject = g;
		transform = g.transform;
	}
	
	public void start() {
		
	}
	
	public void update() {
		
	}
	
	public void fixedUpdate() {
		
	}
	
	public <T extends Collider> void onCollision(T collision) {
		
	}
	
	public <T extends GameObject> T instantiate(T prefab,Vector2 pos,Vector2 scale) {
		return Engine.nowScene.instantiate(prefab, pos, scale);
	}
	
	public float getRandomFloat(float min,float max) {
		return new Random().nextFloat() * (max - min) + min;
	}
	
	public int getRandomBinary() {
		return new Random().nextInt() % 2;
	}
	
	public float getRandomInArray(float[] array) {
		int i;
		do {
			i = new Random().nextInt() % array.length;
		}while(i < 0);
		return array[i];
	}
}
