package SynchronizedMethod;

public class Main {

	public static void main(String[] args) {
		System.out.println(DBConnection.getInstance());
		
		System.out.println(DBConnection.getInstance());

	}

}
