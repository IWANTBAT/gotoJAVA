package ORM;

//import java.sql.ResultSet;
import java.sql.SQLException;

import com.connetion.ConnectionLink;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class deletename {
	private Connection conn = null;
	private PreparedStatement stmt = null;
    static private PreparedStatement ps = null;
	//private ResultSet re =  null;
	String phone;
	public deletename() {}
	
	public deletename(String nphone) {
		this.phone = nphone;
	}
	public void delete() {
		conn = ConnectionLink.getMysqlConn();
		try {
			ps = (PreparedStatement) conn.prepareStatement("delete from cashier where phone_no=?");
			System.out.println(phone);
			ps.setString(1, phone);
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
