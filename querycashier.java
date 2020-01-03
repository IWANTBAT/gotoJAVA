package ORM;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.connetion.ConnectionLink;
import com.mysql.jdbc.*;

public class querycashier {
	String name,sex,phone,date,passwd;
	int age;
	private Connection conn = null;
	private PreparedStatement stmt = null;
    static private PreparedStatement ps = null;
	private ResultSet re =  null;
	private ArrayList<querycashier> list =new ArrayList<>();
	
	public querycashier() {
		
	}
	
	public querycashier(String ph,String na,String sex,String passwd,int age,String date) {
		this.phone = ph;
		this.name = na;
		this.passwd = passwd;
		this.sex = sex;
		this.age = age;
		this.date = date;
	}
	
	public ArrayList<querycashier> selectcashier()
	{
		conn = ConnectionLink.getMysqlConn();
		try {
			ps = (PreparedStatement) conn.prepareStatement("Select * from cashier ");
			re = ps.executeQuery();

			   while(re.next())
	           {
				   querycashier ti = new querycashier(re.getString(1),re.getString(2),re.getString(3), re.getString(4),re.getInt(5),re.getString(6));
	               list.add(ti);
	           }
	         
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  return list;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getPhone() {
		return phone;
	}

	public String getDate() {
		return date;
	}

	public String getPasswd() {
		return passwd;
	}

	public int getAge() {
		return age;
	}

	public Connection getConn() {
		return conn;
	}

	public PreparedStatement getStmt() {
		return stmt;
	}

	public static PreparedStatement getPs() {
		return ps;
	}

	public ResultSet getRe() {
		return re;
	}

	public ArrayList<querycashier> getList() {
		return list;
	}
	

}
