package engine.editor;

import engine.*;

public class OjPlayer extends GameObject{
	public OjPlayer(){
		tag = "player";
		addComponents(new RigidBody());
		addComponents(new Collider());
		addComponents(new CpPlayerControl());
		addComponents(new SpriteRenderer("/image/Ballon.png"));
		addComponents(new CpVictim());
	}
}
