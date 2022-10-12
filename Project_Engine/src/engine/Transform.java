package engine;

public class Transform extends Monobehavier{
	public Vector3 position;
	public Vector3 rotation;
	public Vector3 scale;
	
	Transform(Vector3 pos,Vector3 rot, Vector3 scale){
		position = pos;
		rotation = rot;
		this.scale = scale;
	}
	
	Transform(){
		this(Vector3.zero,Vector3.zero,Vector3.zero);
	}
}
