package UserDefinedException;

class MyException extends Exception{
	
	public MyException(String message) {
		super(message);
	}
}


public class Main {

	public static void main(String[] args) throws MyException {
		
		Demo d=new Demo();
//		try{
			d.display();
//		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("hello world");
//		}
		System.out.println("finished");

	}

}


class Demo{
	
	void display() throws MyException {
		throw new MyException("my exception");
	}
	
}
