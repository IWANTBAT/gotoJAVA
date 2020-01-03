package ORM;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.connetion.ConnectionLink;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CreateUsers {
	private String name,Uphone_no;
	//private Connection conn = null;
	//private PreparedStatement stmt = null;
	private PreparedStatement ps = null;
	//private ResultSet re =  null;
	public CreateUsers() {}
	public CreateUsers(String phone,String name)
	{
		this.Uphone_no = phone;
		
		this.name = name;
	
	}
	public boolean Createuser() {
		try {
			Connection conn = ConnectionLink.getMysqlConn();
			String sql = "insert into users (Uphone_no,name,point,VIP_no,date) values(?,?,0,1,'2019-3-21',0)";
			PreparedStatement stmt =  (PreparedStatement) conn.prepareStatement(sql);
			ps.setObject(1,Uphone_no);
			ps.setObject(2,name);
			if(ps.execute()) {
				return true;
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
			
			
		}
		return false;
	}
}
