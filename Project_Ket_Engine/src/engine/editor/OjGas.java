package engine.editor;

import engine.*;

public class OjGas extends GameObject{
	OjGas(){
		tag = "enemy";
		addComponents(new SpriteRenderer("/image/gas.png"));
		addComponents(new CpGas());
		addComponents(new Collider());
		transform.scale = new Vector2(2,1);
	}
}
