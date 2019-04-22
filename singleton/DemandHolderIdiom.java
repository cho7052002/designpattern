//https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
/*
	 처음 Singleton을 로드할 때엔 LazyHolder는 로드되지 않는다
	 그 후, LazyHolder가 필요해지는 getInstance 시에 LazyHolder가 로드되고, 이 때 instance가 단 1번 초기화된다
	 (JVM의 원자적 특성으로 멀티스레드에 상관 없이)
*/
public class Singleton {

	//생성자 제한
	private Singleton(){}

	//JVM이 클래스 로드시 원자적 특성으로 new Singleton()이 단 한번만 호출된다
	private static class LazyHolder {
		public static final Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return LazyHolder.instance;	//이 순간 클래스가 로드된다
	}
}
