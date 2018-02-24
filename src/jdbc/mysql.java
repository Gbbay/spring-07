package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class mysql {

	public static void main(String[]args) {
		String url = "jdbc:mysql://192.168.40.135:";
		String user = "root";
		String password = "123456";
		try {
			//选择操作的数据库种类
			Class.forName("com.mysql.jdbc.Driver");
			//创建连接 主机ip 端口号 用户名 密码
			DriverManager.getConnection(url, user, password);
			//选择要操作的数据库
			//创建命令窗口（写入sql语句）;
			//运行sql语句并查询结果 如果是增删改则返回受影响的行数 如果是查询返回的是查询结果
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
