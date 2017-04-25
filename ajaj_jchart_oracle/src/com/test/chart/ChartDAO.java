package com.test.chart;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ChartDAO {
	String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
    String uid="scott";
    String pwd="tiger";
    String driver="oracle.jdbc.driver.OracleDriver";  	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	
	public List<ChartVO> getData() {
		
		String sql = "select job, avg(sal) avg " + 
				" from emp e, dept d " +
				" where e.deptno = d.deptno " +
				" group by job " +
				" order by job";
		
		List<ChartVO> datas
		= new ArrayList<ChartVO>();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(	url, uid, pwd);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String Xval = rs.getString("job");
				double Yval = Math.round(rs.getDouble("avg"));
				datas.add( new ChartVO(Xval, Yval) );
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return datas;
	}
}//end class