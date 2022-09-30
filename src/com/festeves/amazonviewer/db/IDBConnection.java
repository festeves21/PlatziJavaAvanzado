package com.festeves.amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import static com.festeves.amazonviewer.db.Database.*;
public interface IDBConnection {

	default Connection connectToDB() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			connection = DriverManager.getConnection(URL+DB,USER,PASSWORD);
			if (connection !=null) {
				System.out.println("Se establecio la conexion");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			return connection;
		}
	}
}
