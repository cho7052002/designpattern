public class Singleton{

	//static 싱글턴 인스턴스
	private static Singleton instance;
	
	//생성자를 private로 설정, 외부에서 호출 불가능하도록
	private Singleton(){}
	
	//synchronized인 get instance 를 호출해 인스턴스 
	public static synchronized Singleton getInstance(){
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
