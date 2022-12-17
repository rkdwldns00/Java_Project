package engine;

public class Transform{
	public Vector2 position;
	public Vector2 scale;
	
	Transform(Vector2 pos, Vector2 scale){
		position = pos;
		this.scale = scale;
	}
	
	Transform(){
		this(Vector2.zero,Vector2.one);
	}
	
	public void translate(Vector2 add) {
		position = position.add(add);
	}
}
