public class ThreadSafeLazyInitialization{

	//static 싱글턴 인스턴스
	private static ThreadSafeLazyInitialization instance;
	
	//생성자를 private로 설정, 외부에서 호출 불가능하도록
	private ThreadSafeLazyInitialization(){}
	
	//synchronized인 get instance 를 호출해 인스턴스 
	public static synchronized ThreadSafeLazyInitialization getInstance(){
		if(instance == null) {
			instance = new ThreadSafeLazyInitialization();
		}
		return instance;
	}
}
