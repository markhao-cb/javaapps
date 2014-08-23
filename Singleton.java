public class Singleton {

	static Singleton singleton;
	private Singleton() {
	};

	
	static Singleton getInstance() {
		if(singleton == null) {
			 singleton = new Singleton();
			 return singleton;
		}  else  { 
			 return singleton;
		}

	}
}


	 
