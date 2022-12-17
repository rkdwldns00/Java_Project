package engine;

enum KeyCode{
	
}

public class Input {
	static int mouseX = 0;
	static int mouseY = 0;
	static Vector2 mousePos = Vector2.zero;
	static boolean mouseClicked = false;
	static boolean mouseClickedThisFrame = false;
	
	static void refreshFrame() {
		mouseClickedThisFrame = false;
	}
	
	public static boolean getMouse() {
		return mouseClicked;
	}
	
	public static boolean getMouseDown() {
		return mouseClickedThisFrame;
	}
	
	public static Vector2 getMousePos() {
		return mousePos;
	}
}
