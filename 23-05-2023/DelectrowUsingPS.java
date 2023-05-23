package com.jdbc.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con = DatabaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in) ){
			
			String q= "delete from newStudant where id=?";
			PreparedStatement ps = con.prepareStatement(q);
			System.out.println("Enter ID for Delete Row : ");
			int id = sc.nextInt();
			ps.setInt(1, id);
			
			int r = ps.executeUpdate();
			System.out.println();
			System.out.println(r+" Row are Deleted !!!");
			
			System.out.println("----------------------");
			
			String q2 = "select * from newstudant";
			
			PreparedStatement ps1= con.prepareStatement(q2);
			ResultSet rs2= ps1.executeQuery();
			System.out.println();
			System.out.println("Table after Row Deleted !!");
			System.out.println("----------------------");
			while(rs2.next()) {
				System.out.println("Id : "+rs2.getInt("id"));
				System.out.println("Name: "+rs2.getString("name"));
				System.out.println("Email: "+rs2.getString(3));
				System.out.println("----------------------");
			}
			
			
			}		
		catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
