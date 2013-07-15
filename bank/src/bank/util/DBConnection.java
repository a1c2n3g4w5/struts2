package bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static String dbClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"  ; //定义保存数据库驱动的变量 
	
	/*****************	连接MySQL数据库时使用代码**********************
	private static String url = "jdbc:mysql://localhost:3306/bank?Unicode=true;characterEncoding=GB2312";

	public static Connection getDBC() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // 用户名为root，密码为空 conn =
		DriverManager.getConnection(url, "root", "");
		return conn;
	}
	*/
	private static String url = "jdbc:microsoft:sqlserver://localhost:1433;databaseName=bank";

	public static Connection getDBC() throws SQLException, Exception {
//		Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
//		// 用户名为sa，密码为空
//		Connection conn = DriverManager.getConnection(url, "sa", "123456");
//		return conn;
		
		String dbUrl="jdbc:sqlserver://localhost:1433;DatabaseName=bank"; 
		Class.forName(dbClassName).newInstance(); 
		Connection conn = DriverManager.getConnection(dbUrl,"sa", "123456"); 
		
		return conn;
		
	}
}
