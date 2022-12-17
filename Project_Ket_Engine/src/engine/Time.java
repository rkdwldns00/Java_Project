package engine;

public class Time {
	static int fps = 60;
	static int fixedFps = 50;
	static float tpf=1/(float)fps;
	static float fixedTpf = 1/(float)fixedFps;
	public static float deltaTime = 1/(float)fps;
	public static float fixedTime = 1/(float)fixedFps;
	static float frameTimer = 0f;
	static float fixedTimer = 0f;
	public static boolean isStop;
	
	static void setFps(int a) {
		fps = a;
		tpf = 1/(float)fps;
		deltaTime = 1/(float)fps;
	}
}
