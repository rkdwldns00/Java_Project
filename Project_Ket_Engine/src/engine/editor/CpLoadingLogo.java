package engine.editor;

import engine.*;

public class CpLoadingLogo extends Monobehavier {
	float timer;
	SpriteRenderer renderer;
	
	@Override
	public void start() {
		renderer = gameObject.getComponent(new SpriteRenderer());
		renderer.alpha = 1;
		switch((int)getRandomFloat(0, 5)) {
		case 0:
			renderer.setImg("/image/mond.png");
			break;
		case 1:
			renderer.setImg("/image/liyue.png");
			break;
		case 2:
			renderer.setImg("/image/inazma.png");
			break;
		case 3:
			renderer.setImg("/image/sumer.png");
			break;
		}
	}
	
	@Override
	public void update() {
		timer += Time.deltaTime;
		if(timer<1) {
			renderer.alpha = timer;
			transform.scale = transform.scale.mul(1+Time.deltaTime * 0.1f);
		}else if(timer > 1.5f && timer < 2.5f){
			renderer.alpha = 2.5f-timer;
		}else if(timer > 2.5f) {
			Main.Manager.LoadScene(new ScMenuScene());
		}
	}
}
