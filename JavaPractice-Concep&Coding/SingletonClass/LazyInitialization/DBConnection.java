package LazyInitialization;

public class DBConnection {
	private static DBConnection connection;
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance() {
		System.out.println("DBConnection.getInstance()");
		if(connection==null) {
			System.out.println("connection obj is null");
			connection=new DBConnection();
		}
		return connection;
	}

}
