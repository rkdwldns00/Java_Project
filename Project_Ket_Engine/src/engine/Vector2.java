package engine;

public class Vector2 {
	public float x,y;
	
	public static Vector2 zero = new Vector2(0,0);
	public static Vector2 up = new Vector2(0,1);
	public static Vector2 down = new Vector2(0,-1);
	public static Vector2 right = new Vector2(1,0);
	public static Vector2 left = new Vector2(-1,0);
	public static Vector2 one = new Vector2(1,1);
	
	public Vector2(float x,float y){
		this.x=x;
		this.y=y;
	}
	
	public Vector2() {
		this(0,0);
	}
	
	public Vector2 add (Vector2 v2){
		return new Vector2(x+v2.x,y+v2.y);
	}
	
	public Vector2 sub (Vector2 v2){
		return new Vector2(x-v2.x,y-v2.y);
	}
	
	public Vector2 mul (float v2){
		return new Vector2(x*v2,y*v2);
	}
	
	public Vector2 normalize() {
		float l = this.length();
		return new Vector2(x/l,y/l);
	}
	
	public float inner(Vector2 v2) {
		return x*v2.x+y*v2.y;
	}
	
	public float length() {
		return (float)Math.sqrt(x*x+y*y);
	}
	
	public Vector2 lerp(Vector2 v2) {
		return this.add(v2).mul(0.5f);
	}
	
	@Override
	public String toString() {
		return "Vector("+x+", "+y+")";
	}
	
	public Vector2 average(Vector2 v2) {
		return new Vector2((x+v2.x)/2,(y+v2.y)/2);
	}
}
