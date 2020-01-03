package ORM;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.connetion.ConnectionLink;
import com.mysql.jdbc.*;


public class Confirmpassword {
	private String phone, passWord_staff, passWord_manager;
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet re =  null;
	public Confirmpassword(String phone)
	{
		this.phone = phone;
	}
	
	public void inquiryPassWrod_staff()
	{
		 
		try {
			conn = ConnectionLink.getMysqlConn();
			String sql = "Select password from cashier where phone_no = ?";
			
			PreparedStatement stmt =  (PreparedStatement) conn.prepareStatement(sql);
			
			stmt.setObject(1, phone);
			ResultSet re = stmt.executeQuery();
			while(re.next())
			{
				passWord_staff = re.getString(1);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void inquiryPassWrod_manager()
	{
		 
		try {
			conn = ConnectionLink.getMysqlConn();
			
			String sql = "Select password from administrator where Mphone_no = ?";
			stmt =  (PreparedStatement) conn.prepareStatement(sql);
			stmt.setString(1, phone);
			 re = stmt.executeQuery();
			while(re.next())
			{
				passWord_manager = re.getString(1);
//				System.out.println("shuchu :" +re.getString(1));
			}
		
		} catch (SQLException e) {
//			System.out.print("fangfa");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getPhone() {
		return phone;
	}

	public String getPassWord_staff() {
		return passWord_staff;
	}

	public String getPassWord_manager() {
		return passWord_manager;
	}
	
}
