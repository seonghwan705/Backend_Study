package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import com.dao.StudentDAO;
import com.dao.StudentDAO;
import com.dto.Student;
import com.dto.Student;

public class StudentService {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "workshop";
	String passwd = "workshop";

	public StudentService() { // 생성자에 드라이버 로딩
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Student> selectByName(String str){
		ArrayList<Student> list = new ArrayList<Student>();
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			StudentDAO dao = new StudentDAO();
			list = dao.selectByName(con, str);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list; 
	}

	public ArrayList<Student> selectAllStudent() {
		ArrayList<Student> list = new ArrayList<Student>();
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			StudentDAO dao = new StudentDAO();
			list = dao.selectAllStudent(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
