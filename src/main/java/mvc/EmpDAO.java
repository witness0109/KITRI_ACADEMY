package mvc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class EmpDAO {
	ArrayList<EmpVO> getEmpList(){
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		String sql = "select * from employees";
		// String sql = "select employee_id, last_name ||','||first_name as name, salary,
		// to_char(hire_date, 'yyyy-mm-dd') as hire_date from employee";
		
		PreparedStatement pt = con.prepareStatement(sql);
		ResultSet rs = pt.executeQuery();
		SimpleDateFormat sdf = new SimpleDateFormat("YY-MM-dd");
		
		//데이터가 있는 만큼 돌음
		while (rs.next()) {
			EmpVO vo = new EmpVO();
			vo.setId(rs.getInt("employee_id"));
			vo.setName(rs.getString("first_name")+" "+rs.getString("last_name"));
			vo.setSalary(rs.getInt("salary"));
			vo.setHiredate(sdf.format((rs.getDate("hire_date"))));
			list.add(vo);
		}
		rs.close();
		pt.close();
		con.close();
		}catch(Exception e) {}

		return list;
	}
}
