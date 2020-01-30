package kitri.edu.mvc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class BakeryDAO {
//insert
	
	public int insertBackery(BakeryVO vo) throws FileNotFoundException {
		//vo 전달 모든 내용을 bakery insert
		//bakeryid : backery_seq 시퀀스 이용
		// bakeryname : 이미지 사진 업로드 파일 이름저장
		// System.out.println(vo.getFile1().getName());
		int insertRow = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

			String sql = "insert into bakery values(bakery_seq.nextval, ?, ?, ?, ? )";
			
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1, vo.getBakeryname());
			pt.setInt(2, vo.getPrice());
			pt.setInt(3, vo.getBalance());
			pt.setString(4, vo.getImg().getOriginalFilename());
			
			insertRow = pt.executeUpdate();
			
			System.out.println(vo);
			
			pt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return insertRow;
	}
		
		
		
		
	
	
//select
	
	
}
