package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;



public class FirstJdbc {

	public static void main(String[] args) throws SQLException{
		
		//1.establish connection =(3) url,username,password of database.
		//url="jdbc:mysql://localhost:3600:schemaname(or)dbname"
		//2.create/obtain statement reference
		//3.prepare SQL statement as string
		//4.Execute statement
		//5.Fetch results
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Root123$");
		System.out.println("connected");
		
	    Statement st=con.createStatement();
	    
	    String update="update EMP set sal =sal+0 where deptno in(10,20,30)";
	    int count=st.executeUpdate(update);
		//String sql="insert into EMP values(1017,'abc','MANAGER',7839,'1999-01-2',2300,null,10)";
		//int count =st.executeUpdate(sql);
		System.out.println("Records inserted count#" +count);
		
		
		String sql="select * from EMP where empno=1016";
		ResultSet rs=st.executeQuery(sql);
		
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		
		/*System.out.println(rsmd.getColumnName(1));
		System.out.println(rsmd.getColumnName(2));
		System.out.println(rsmd.getColumnName(3));
		System.out.println(rsmd.getColumnName(4));
		System.out.println(rsmd.getColumnName(5));*/
		
		while(rs.next()) {
			System.out.println(rs.getString(1) + "|" + rs.getString(2));
		}
		
		
	}

}
