package org.javachina.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PersonDao {
	public void insert(){
		
	}
	public void update(){
		
	}
	public void delete(){
		
	}
	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:jchina";
		//返回对数据库的连接
		Connection conn = DriverManager.getConnection(url, "javachina","javachina");
		//创建一个信使对象
		Statement stat = conn.createStatement();
		String insert = "insert into person values('浩志','青岛',650000,2)";
		String update ="update person set salary=40000 where username='浩志'";
		String delete = "delete person where username='浩志'";
		stat.execute(delete);
		
		stat.close();
		conn.close();
	}
}
