package engine;

public class Collider extends Monobehavier{
	public Vector3 centor;
	public Vector3 cubeSize;
	public float sphereRange;
	
	Collider(Vector3 c,float r){
		centor = c;
		sphereRange = r;
	}
	
	Collider(Vector3 c,Vector3 s){
		centor = c;
		cubeSize = s;
	}
	
	Collider(){
		centor = Vector3.zero;
		cubeSize = Vector3.zero;
		sphereRange = 0f;
	}
}
