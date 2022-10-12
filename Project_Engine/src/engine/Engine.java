package engine;
//import java.util.concurrent.TimeUnit;
//package Thread;
//using Time;

public class Engine {
	public Scene nowScene = new Scene();
	
	Engine(){
		System.out.println("engine.Engine ��ü ������");
	}
	
	public Scene LoadScene(Scene scene) {
		System.out.println("engine.Engine.LoadScene ȣ��� - �ε�� ��� : "+scene);
		nowScene.active=false;
		nowScene = scene;
		nowScene.active = true;
		startScene();
		return nowScene;
	}
	
	void startScene() {
		System.out.println("enigne.Engine.startScene ȣ��� - ��� ����, ������Ʈ��  start ȣ��, ��� : "+nowScene);
		nowScene.active = true;
		for(GameObject o : nowScene.objects) {
			if(o != null && o.active) {
				for(Monobehavier m : o.components) {
					if(m != null && m.active) {
						m.start();
					}
				}
			}
		}
		System.out.println("engine.Engine.starScene start��Ʈ �Ϸ� - ������Ʈ�� start�Լ� ȣ��Ϸ�, update �Լ� ȣ��");
		while(nowScene.active) {
			long beforeTime = System.currentTimeMillis();
			for(GameObject o : nowScene.objects) {
				if(o != null && o.active) {
					for(Monobehavier m : o.components) {
						if(m != null && m.active) {
							m.update();
						}
					}
				}
			}
			long afterTime = System.currentTimeMillis();
			long deltaTime = (afterTime - beforeTime);
			try {
				Thread.sleep((long) ((int)((Time.deltaTime) * 1000f) - (float)(deltaTime)));
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
}
