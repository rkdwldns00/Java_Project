package engine;

public class Collider extends Monobehavier{
	public Vector2 centor;
	Vector2[] points;
	Vector2[] nor_Vecror2; // ¹ý¼±º¤ÅÍ
	public boolean isTrigger;
	
	public Collider(Vector2 c,Vector2[] p,Vector2[] norV){
		centor = c;
		points = p;
		nor_Vecror2 = norV;
	}
	
	public Collider(){
		this(Vector2.zero
				,new Vector2[]{new Vector2(-0.5f,0.5f),new Vector2(0.5f,0.5f),new Vector2(0.5f,-0.5f),new Vector2(-0.5f,-0.5f)}
				,new Vector2[]{new Vector2(0,1),new Vector2(1,0),new Vector2(0,-1),new Vector2(-1,0)});
	}
}
