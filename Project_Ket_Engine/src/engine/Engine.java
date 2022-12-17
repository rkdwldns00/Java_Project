package engine;

public class Engine {
	public static Scene nowScene = new Scene();
	private RenderingEngine renderer = new RenderingEngine("title",210);
	private PhysicsEngine physics = new PhysicsEngine();
	
	float corutineTimer;
	
	public Scene LoadScene(Scene scene) {
		Time.setFps(scene.fps);
		nowScene.active=false;
		nowScene = scene;
		nowScene.active = true;
		startScene();
		return nowScene;
	}
	
	void startScene() {
		//runStart();
		while(nowScene.active) {
			if(Time.frameTimer < Time.fixedTimer) {
				delay((long)(Time.frameTimer * 1000));
				corutineTimer+=Time.frameTimer;
				Time.fixedTimer -= Time.frameTimer;
				Time.frameTimer = Time.tpf;
				runUpdate();
			}else {
				delay((long)(Time.fixedTimer * 1000));
				corutineTimer+=Time.fixedTimer;
				Time.frameTimer -= Time.fixedTimer;
				Time.fixedTimer = Time.fixedTpf;
				runFixedUpdate();
			}
		}
	}
	
	private void runUpdate() {
		renderer.rendering(nowScene);
		for(GameObject o : nowScene.objects) {
			if(o != null && o.active) {
				for(Monobehavier m : o.components) {
					if(m != null && m.active) {
						m.update();
					}
				}
			}
		}
		Input.refreshFrame();
	}
	
	private void runFixedUpdate() {
		if(Time.isStop) {
			return;
		}
		for(int i=0;i<2;i++) {
			physics.rigidRun(nowScene);
		}
		for(GameObject o : nowScene.objects) {
			if(o != null && o.active) {
				for(Monobehavier m : o.components) {
					if(m != null && m.active) {
						m.fixedUpdate();
					}
				}
			}
		}
	}
	
	private void delay(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e1) {
			System.out.println("µô·¹ÀÌ ½ÇÆÐ");
			e1.printStackTrace();
		}
	}
}
