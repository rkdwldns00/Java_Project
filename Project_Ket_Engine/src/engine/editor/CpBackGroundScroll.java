package engine.editor;

import engine.*;

public class CpBackGroundScroll extends Monobehavier{
	@Override
	public void update() {
		super.update();
		transform.translate(Vector2.down.mul(Time.deltaTime * 3));
		if(transform.position.y < -9) {
			transform.position = Vector2.up.mul(9);
		}
	}
}
