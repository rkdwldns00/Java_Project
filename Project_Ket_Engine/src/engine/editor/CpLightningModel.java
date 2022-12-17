package engine.editor;

import engine.*;

public class CpLightningModel extends CpFlash {
	@Override
	public void start() {
		super.start();
		if (getRandomBinary() == 1) {
			gameObject.getComponent(new SpriteRenderer()).setImg("/image/lightning.png");
		} else {
			gameObject.getComponent(new SpriteRenderer()).setImg("/image/lightning2.png");
		}
	}
}
