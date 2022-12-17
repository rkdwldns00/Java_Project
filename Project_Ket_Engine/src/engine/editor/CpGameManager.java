package engine.editor;

import engine.*;

public class CpGameManager extends Monobehavier{
	float spawnTimer = 0;
	static GameObject gamemanager;
	float score;
	String[] links = {"/image/0.png","/image/1.png","/image/2.png","/image/3.png","/image/4.png","/image/5.png",
			"/image/6.png","/image/7.png","/image/8.png","/image/9.png"};
	GameObject num1;
	GameObject num2;
	
	@Override
	public void start() {
		num1 = instantiate(new OjGameNum(), new Vector2(-0.4f,2f), Vector2.one);
		num2 = instantiate(new OjGameNum(), new Vector2(0.4f,2f), Vector2.one);
		gamemanager = gameObject;
	}
	
	@Override
	public void update() {
		score+=Time.deltaTime * 2;
		if(spawnTimer <= 0) {
			int spawnId = 0;
			if(score <= 20) {
			 	spawnId = (int)getRandomFloat(0, 2);
			}else if(score <= 50) {
				spawnId = (int)getRandomFloat(0, 5);
			}else{
				spawnId = (int)getRandomFloat(0, 7);
			}
			switch(spawnId) {
			case 0:
				instantiate(new OjMissile(), null, null);
				break;
			case 1:
				instantiate(new OjBaseBall(),null,null);
				break;
				
				
			case 2:
				instantiate(new OjBird(),null,null);
				break;
			case 3:
				instantiate(new OjWind(), null, null);
				break;
			case 4:
				instantiate(new OjLightning(), null, null);
				break;
				
				
			case 5:
				instantiate(new OjGas(), null, null);
				instantiate(new OjGas(), null, null);
				break;
			case 6:
				instantiate(new OjBasketBall(),null,null);
				break;
			}
			spawnTimer = 1f;
		}
		num1.getComponent(new SpriteRenderer()).setImg(links[(int)score/10]);
		num2.getComponent(new SpriteRenderer()).setImg(links[(int)score%10]);
		spawnTimer -= Time.deltaTime;
	}
}