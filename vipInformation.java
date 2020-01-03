package ORM;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.connetion.ConnectionLink;
import com.mysql.jdbc.*;
import com.mysql.jdbc.PreparedStatement;

public class vipInformation {
	private String Uphone_no, name, date;
	private int point, VIP_no, A_point;
	private String VIPname;
	private float VIP_discount;
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public vipInformation(String Uphone_no)
	{
		this.Uphone_no = Uphone_no;
	}
	
	public void inquiryUser()
	{
		conn = ConnectionLink.getMysqlConn();
		try {
			ps = (PreparedStatement) conn.prepareStatement("Select * from users, vip where  users.VIP_no = vip.VIP_no and Uphone_no = ? ");
			ps.setObject(1, Uphone_no);
			rs = ps.executeQuery();
			while(rs.next())
			{
				this.name = rs.getString(2);
				this.point = rs.getInt(3);
				this.date = rs.getString(5);
				this.A_point = rs.getInt(6);
				this.VIPname = rs.getString(8);
				this.VIP_discount = rs.getFloat(9);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String getUphone_no() {
		return Uphone_no;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public int getPoint() {
		return point;
	}

	public int getVIP_no() {
		return VIP_no;
	}

	public int getA_point() {
		return A_point;
	}

	public String getVIPname() {
		return VIPname;
	}

	public float getVIP_discount() {
		return VIP_discount;
	}
	
}
