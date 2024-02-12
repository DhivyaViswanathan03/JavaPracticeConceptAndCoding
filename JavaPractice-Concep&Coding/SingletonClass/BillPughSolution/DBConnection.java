package BillPughSolution;

public class DBConnection {
	
	
	private DBConnection() {
		
	}
	
	private static class DBConnectionHelper {
		private static DBConnection connection=new DBConnection();
	}
	
	public static DBConnection getInstance() {
		return DBConnectionHelper.connection;
	}

}
