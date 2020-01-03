package ORM;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connetion.ConnectionLink;
import com.mysql.jdbc.PreparedStatement;

public class insertcashier {
	static private String name,sex,phone,date;
	static int age;
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private PreparedStatement ps = null;
	private ResultSet re =  null;
	
	public insertcashier() {}
	public insertcashier(String name,String sex,int age,String phone,String date) {
		insertcashier.name = name;
		insertcashier.sex = sex;
		insertcashier.phone = phone;
		insertcashier.date = date;
		insertcashier.age = age;
	}
	public void icashier() {
		try {
			Connection conn = ConnectionLink.getMysqlConn();
			String sql = "insert into cashier values(?,?,'123456',?,?,?)";
			if(phone!=null) {
			PreparedStatement stmt =  (PreparedStatement) conn.prepareStatement(sql);
			
			System.out.println(phone);
			ps.setObject(1,phone);
			ps.setObject(2,name);
			ps.setObject(3,sex);
			ps.setObject(4,age);
			ps.setObject(5, date);
			ps.executeUpdate();}
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			
		}
		
}}
