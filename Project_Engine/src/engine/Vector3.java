package engine;

public class Vector3 {
	public float x,y,z;
	
	public static Vector3 zero = new Vector3(0,0,0);
	public static Vector3 foward = new Vector3(0,0,1);
	public static Vector3 back = new Vector3(0,0,-1);
	public static Vector3 up = new Vector3(0,1,0);
	public static Vector3 down = new Vector3(0,-1,0);
	public static Vector3 right = new Vector3(1,0,0);
	public static Vector3 left = new Vector3(-1,0,0);
	
	public Vector3(float x,float y,float z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public Vector3() {
		this(0,0,0);
	}
	
	public Vector3 add (Vector3 v2){
		return new Vector3(x+v2.x,y+v2.y,z+v2.z);
	}
	
	public Vector3 sub (Vector3 v2){
		return new Vector3(x-v2.x,y-v2.y,z-v2.z);
	}
	
	public Vector3 mul (float v2){
		return new Vector3(x*v2,y*v2,z*v2);
	}
	
	@Override
	public String toString() {
		return "Vector("+x+", "+y+", "+z+")";
	}
}
