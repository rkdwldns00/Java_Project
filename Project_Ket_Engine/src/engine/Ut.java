package engine;

public class Ut {
	public static float max(float a,float b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	static float maxForList(float[] a) {
		float m = a[0];
		for(float b : a) {
			if(b > m) {
				m = b;
			}
		}
		return m;
	}
	
	static int maxIndexForList(float[] a) {
		float m = a[0];
		int i = 0;
		int n = 0;
		for(float b : a) {
			if(b > m) {
				m = b;
				i = n;
			}
			n++;
		}
		return i;
	}
	
	public static float abs(float a) {
		if(a>0) {
			return a;
		}
		return -a;
	}
}
