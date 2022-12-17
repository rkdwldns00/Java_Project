package engine;

interface PrefabInstance {
	public <T extends GameObject> T instantiate(T prefab,Vector2 pos,Vector2 scale);
}
