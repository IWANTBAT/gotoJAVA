package ORM;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.connetion.ConnectionLink;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class queryname {
	private Connection conn = null;
	private PreparedStatement stmt = null;
    static private PreparedStatement ps = null;
	private ResultSet re =  null;
	String phone,name;
	public queryname() {}
	public queryname(String phone) {
		this.phone = phone;
		
	}
	public void selectname()
	{
		conn = ConnectionLink.getMysqlConn();
		try {
			ps = (PreparedStatement) conn.prepareStatement("Select name from cashier where phone_no=?");
			ps.setObject(1, phone);
			re = ps.executeQuery();
			   while(re.next())
	           {
				   name = re.getString(1);
	           }
	         
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  //return list;
	}

	public String getName() {
		return name;
	}
}
