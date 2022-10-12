package engine.editor;

import engine.*;

public class Test extends engine.Monobehavier{
	rigidBody rigid;
	
	@Override
	public void start() {
		rigid = (rigidBody) gameObject.getComponent(new rigidBody());
		//System.out.println(gameObject);
		//System.out.println("rr");
	}
	
	@Override
	public void update() {
		System.out.println(rigid.velocity);
		//System.out.println("dd");
	}
}
