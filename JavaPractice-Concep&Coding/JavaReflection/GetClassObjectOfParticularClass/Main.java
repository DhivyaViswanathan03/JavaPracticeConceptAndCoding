package GetClassObjectOfParticularClass;
class Bird {
	
	Bird(){
		
	}
	
	int id;
	String name;
	
	void demo() {
		
	}

}

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		Class obj=Class.forName("Bird");
		
		//Class obj=Bird.class;
		
		Bird obj=new Bird();
		System.out.println(obj.getClass());
		
		System.out.println(obj);

	}

}
