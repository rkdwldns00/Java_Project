package engine;

public class Button extends Monobehavier {
	
	@Override
	public void update() {
		if(Input.mouseClickedThisFrame && getT()) {
			onClick();
		}
	}
	
	public void onClick() {
		
	}
	
	boolean getT() {
		return transform.position.x - transform.scale.x / 2 < Input.getMousePos().x && transform.position.x + transform.scale.x / 2 > Input.getMousePos().x
				&& transform.position.y - transform.scale.y / 2 < Input.getMousePos().y && transform.position.y + transform.scale.y / 2 > Input.getMousePos().y;
	}
}
