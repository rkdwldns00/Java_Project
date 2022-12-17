package engine.editor;

import engine.*;

public class CpUi extends Monobehavier {
	float timer;
	float score;
	GameObject comment;
	GameObject num1;
	GameObject num2;
	GameObject restartButton;
	String[] links = {"/image/0.png","/image/1.png","/image/2.png","/image/3.png","/image/4.png","/image/5.png",
			"/image/6.png","/image/7.png","/image/8.png","/image/9.png"};
	
	@Override
	public void start() {
		instantiate(new OjUi(), Vector2.zero, null).parent = gameObject;
		instantiate(new OjGameOverText(), Vector2.up.mul(1.5f), null).parent = gameObject;
		num1 = instantiate(new OjGameNum(), new Vector2(-0.4f,0.5f), Vector2.one);
		num2 = instantiate(new OjGameNum(), new Vector2(0.4f,0.5f), Vector2.one);
		num1.parent = gameObject;
		num2.parent = gameObject;
		comment = instantiate(new OjGameOverComment(), new Vector2(0,-0.5f), Vector2.one);
		comment.parent = gameObject;
		//comment.active = false;
		score = CpGameManager.gamemanager.getComponent(new CpGameManager()).score;
		if(score <= 20) {
			comment.getComponent(new SpriteRenderer()).setImg("/image/comment1.png");
			comment.transform.scale = new Vector2(3,1.5f);
		}else if(score <= 30) {
			comment.getComponent(new SpriteRenderer()).setImg("/image/comment2.png");
			comment.transform.scale = new Vector2(3,1.5f);	
		}else if(score <= 50) {
			comment.getComponent(new SpriteRenderer()).setImg("/image/comment3.png");
			comment.transform.scale = new Vector2(3,1.5f);
		}else if(score <= 80) {
			comment.getComponent(new SpriteRenderer()).setImg("/image/comment4.png");
			comment.transform.scale = new Vector2(3,1.5f);
		}else {
			comment.getComponent(new SpriteRenderer()).setImg("/image/comment5.png");
			comment.transform.scale = new Vector2(3,1.5f);
		}
		setScoreUi();
	}
	
	@Override
	public void update() {
		timer+=Time.deltaTime;
		if(timer <= 2f && timer >= 1f) {
			transform.position = transform.position.lerp(Vector2.zero);
		}else if(restartButton == null){
			restartButton = instantiate(new OjStartButton(), new Vector2(0,-1.5f), new Vector2(3,0.7f));
			instantiate(new OjHomeButton(), new Vector2(-2,-1.5f), Vector2.one.mul(0.5f)).parent = gameObject;
			restartButton.parent = gameObject;
		}
	}
	
	public void setScoreUi() {
		num1.getComponent(new SpriteRenderer()).setImg(links[(int)score/10]);
		num2.getComponent(new SpriteRenderer()).setImg(links[(int)score%10]);
	}
}
