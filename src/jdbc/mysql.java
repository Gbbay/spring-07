package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class mysql {

	public static void main(String[]args) {
		String url = "jdbc:mysql://192.168.40.135:";
		String user = "root";
		String password = "123456";
		try {
			//ѡ����������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			//�������� ����ip �˿ں� �û��� ����
			DriverManager.getConnection(url, user, password);
			//ѡ��Ҫ���������ݿ�
			//��������ڣ�д��sql��䣩;
			//����sql��䲢��ѯ��� �������ɾ���򷵻���Ӱ������� ����ǲ�ѯ���ص��ǲ�ѯ���
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
