package EagerInitialization;

public class DBConnection {
	private static DBConnection connection=new DBConnection();
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance() {
		System.out.println("DBConnection.getInstance()");
		return connection;
	}

}
