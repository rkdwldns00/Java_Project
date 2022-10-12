package engine;
//import java.util.concurrent.TimeUnit;
//package Thread;
//using Time;

public class Engine {
	public Scene nowScene = new Scene();
	
	Engine(){
		System.out.println("engine.Engine 객체 생성됨");
	}
	
	public Scene LoadScene(Scene scene) {
		System.out.println("engine.Engine.LoadScene 호출됨 - 로드된 장면 : "+scene);
		nowScene.active=false;
		nowScene = scene;
		nowScene.active = true;
		startScene();
		return nowScene;
	}
	
	void startScene() {
		System.out.println("enigne.Engine.startScene 호출됨 - 결과 실행, 컴포넌트들  start 호출, 장면 : "+nowScene);
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
		System.out.println("engine.Engine.starScene start파트 완료 - 컴포넌트들 start함수 호출완료, update 함수 호출");
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
