public class Singleton {

	// 싱글턴 인스턴스
	// voletile: 멀티스레드 환경에서는 성능향상 위해 인스턴스를 캐시에 저장, 이를 금지시킴
	// https://nesoy.github.io/articles/2018-06/Java-volatile
	private volatile static Singleton instance;
	
	// 생성자 제한
	private Singleton(){}
	
	
	public static Singleton getInstance(){
		//첫 호출 이후에서는 synchronized 없이 체크
		if(instance == null){
			//첫 호출시에만 
			synchronized (Singleton.class){	
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
