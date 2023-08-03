package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Student;
import com.dto.Student;

public class StudentDAO {
	
	public ArrayList<Student> selectByName(Connection con, String str){
		ArrayList<Student> list = new ArrayList<Student>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select student_no 학번, student_name 이름, rpad(substr(student_ssn, 0, 8), 14, '*') 주민번호,";
			   sql += " case when student_address is null then '**주소미상**' else substr(student_address, 0, 10)||'...' end 주소,";
			   sql += " to_char(entrance_date, 'yyyy/mm/dd') 입학년도, absence_yn 휴학여부";
			   sql += " from tb_student where student_name like ? order by 1";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + str + "%");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String stuNo = rs.getString("학번");
				String stuName = rs.getString("이름");
				String stuSsn = rs.getString("주민번호");
				String stuAdress = rs.getString("주소");
				String entDate = rs.getString("입학년도");
				String absYn = rs.getString("휴학여부");
				
				Student s = new Student(stuNo, stuName, stuSsn, stuAdress, entDate,	absYn);
				list.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public ArrayList<Student> selectAllStudent(Connection con) {
		ArrayList<Student> list = new ArrayList<Student>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select student_no 학번, student_name 이름, rpad(substr(student_ssn, 0, 8), 14, '*') 주민번호, substr(student_address, 0, 10)||'...' 주소, to_char(entrance_date, 'yyyy/mm/dd') 입학년도, absence_yn 휴학여부";
			   sql += " from tb_student order by 1";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String stuNo = rs.getString("학번");
				String stuName = rs.getString("이름");
				String stuSsn = rs.getString("주민번호");
				String stuAdress = rs.getString("주소");
				String entDate = rs.getString("입학년도");
				String absYn = rs.getString("휴학여부");
				
				Student s = new Student(stuNo, stuName, stuSsn, stuAdress, entDate, absYn);
				list.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
