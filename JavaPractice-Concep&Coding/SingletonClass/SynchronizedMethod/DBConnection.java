package SynchronizedMethod;

public class DBConnection {
	private static DBConnection connection;
	
	private DBConnection() {
		
	}
	
	synchronized static DBConnection getInstance() {
		System.out.println("DBConnection.getInstance()");
		if(connection==null) {
			System.out.println("connection obj is null");
			connection=new DBConnection();
		}
		return connection;
	}

}
