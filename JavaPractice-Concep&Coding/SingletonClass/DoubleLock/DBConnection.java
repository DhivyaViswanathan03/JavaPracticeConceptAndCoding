package DoubleLock;

public class DBConnection {
	//Volatile--for overcome memory issue
	//Instead of stored in cache ,store data in DB directly
	
	private static volatile DBConnection connection;
	
	private DBConnection() {
		
	}
	
	synchronized static DBConnection getInstance() {
		if(connection==null) {
			synchronized (DBConnection.class) {
				if(connection==null) {
					System.out.println("DBConnection is null");
					connection=new DBConnection();
				}
			}
		}
		return connection;
	}

}
