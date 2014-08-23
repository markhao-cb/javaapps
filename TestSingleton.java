public class TestSingleton{

	public static final void main(String[] args){
		System.out.println(new Singleton());
		System.out.println(new Singleton());
		System.out.println(new Singleton());
		System.out.println(new Singleton());
		System.out.println(new Singleton());
		System.out.println(new Singleton());
		System.out.println("123");
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
	};
}
