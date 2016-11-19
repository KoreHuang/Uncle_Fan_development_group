package text_jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

import java.sql.PreparedStatement;

import java.sql.Connection;

public class text_myjdbc {
	static void insertData() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mac");
			Statement sta=connection.createStatement();
			int t=sta.executeUpdate("insert into stu(id,name,sex,age) values(15,'王老师','男',29)");
			System.out.println(t);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	static void insertData2() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=mac&useUnicode=true&characterEncoding=utf-8");
			Statement sta=connection.createStatement();
			int t=sta.executeUpdate("insert into stu(id,name,sex,age) values(45,'王老师','男',29)");
			System.out.println(t);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static void dropTable(String tableName){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mac");
			Statement statement=connection.createStatement();
			statement.executeQuery("drop"+tableName+"from student");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static void selAll() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=mac&useUnicode=true&characterEncoding=utf-8");
			Statement statement=connection.createStatement();
			ResultSet rsset=statement.executeQuery("select * from stu");
			while(rsset.next()){
				System.out.println(rsset.getInt("id")+":"+rsset.getString(2)+":"+rsset.getString("sex")+":"+rsset.getInt(4));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void selIdName(int id){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection jca=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=mac&useUnicode=true&characterEncoding=utf-8");
			PreparedStatement staq=jca.prepareStatement("select * from stu where id=?");
			staq.setInt(1, id);
			ResultSet rSet=staq.executeQuery();
			while (rSet.next()) {
				System.out.println(rSet.getInt(1)+":"+rSet.getString("name")+":"+rSet.getString("sex")+":"+rSet.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static void insertData(int id,String name,String sex,int age){
		try {
			Class.forName("com.mysql.jdbc.Driver");//加载数据库的驱动类
			Connection cnt=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=mac&useUnicode=true&characterEncoding=utf-8");//数据库链接对象
			PreparedStatement preparedStatement=cnt.prepareStatement("insert into stu(id,name,sex,age) values(?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, sex);
			preparedStatement.setInt(4, age);
			int t=preparedStatement.executeUpdate();
			System.out.println(t);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		insertData(42,"李怡霞","女",20);
		//selIdName(3);
	}
}
