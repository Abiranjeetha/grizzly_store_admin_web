package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pack.JdbcConnection;
import com.pack.model.Product;

public class ProductDaoImpl {

	public ProductDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public int addProduct(Product p) {
		// TODO Auto-generated method stub
		Connection con=null;
		int ret=0;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into product(pid,pcategory,pname,pdescription,pprice,brand,rating) values(?,?,?,?,?,?,?)");
			ps.setInt(1, p.getPid());
			ps.setString(2, p.getPcategory());
			ps.setString(3, p.getPname());
			ps.setString(4, p.getPdescription());
			ps.setFloat(5, p.getPprice());
			ps.setString(6, "Apple");
			ps.setInt(7, 4);
			ret=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ret;
	}

	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		Connection con=null;
		List<Product>l=new ArrayList<>();
		try
		{
			con=JdbcConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select pid,pcategory,pname,pdescription,pprice,brand,rating from product");
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPcategory(rs.getString(2));
				p.setPname(rs.getString(3));
				p.setPdescription(rs.getString(4));
				p.setPprice(rs.getFloat(5));
				p.setPbrand(rs.getString(6));
				p.setRating(rs.getInt(7));
				l.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				if(con!=null)
					con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		return l;
	}

	public Product viewProduct(int pid) {
		// TODO Auto-generated method stub
		Connection con=null;
		Product p=new Product();
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select pid,pcategory,pname,pdescription,pprice,brand,rating from product where pid=?");
			ps.setInt(1, pid);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				p.setPid(rs.getInt(1));
				p.setPcategory(rs.getString(2));
				p.setPname(rs.getString(3));
				p.setPdescription(rs.getString(4));
				p.setPprice(rs.getFloat(5));
				p.setPbrand(rs.getString(6));
				p.setRating(rs.getInt(7));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				if(con!=null)
					con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		return p;
	}

	public int removeProduct(int id) {
		// TODO Auto-generated method stub
		Connection con=null;
		int i=0;
		try
		{
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from product where pid=?");
			ps.setInt(1, id);
			i=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				if(con!=null)
					con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		return i;
	}

}
