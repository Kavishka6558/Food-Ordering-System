package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entities.foodItems;
import utilities.MySQLConnect2;


public class foodItemDAO {
	private Connection con;
	public foodItemDAO() {
		try {
			con=MySQLConnect2.connectDB();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean insert(foodItems food) {
		//insert command
		String query="INSERT INTO product (P_Name,P_Price,P_Qty,P_Description,image_path,category)"
				+ "VALUE('"+food.getFname()+"','"+food.getFprice()+"','"+food.getFquantity()+"','"+food.getDescription()+"','"+food.getImgpath()+"','"+food.getCategory()+"')";
		try {

			Statement stmt=con.createStatement();
			int result= stmt.executeUpdate(query);
			if(result > 0) {
				return true;
			}else {
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public ArrayList<foodItems> getAll(){
		ArrayList<foodItems> foodList=new ArrayList<>();
		String query="SELECT * FROM product";

		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				int id=rs.getInt("P_Id");
				String fname=rs.getString("P_Name");
				Double fprice=rs.getDouble("P_Price");
				int fquantity=rs.getInt("P_Qty");
				String description=rs.getString("P_Description");
				String imagepath=rs.getString("image_path");
				String category=rs.getString("category");

				foodItems food=new foodItems();

				food.setId(id);
				food.setFname(fname);
				food.setFprice(fprice);
				food.setFquantity(fquantity);
				food.setDescription(description);
				food.setImgpath(imagepath);
				food.setCategory(category);


				foodList.add(food);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return foodList;
		}
		return foodList;
	}
	public foodItems getFoodItem(int id) {
		foodItems food=new foodItems();
		String query="SELECT * FROM product WHERE P_Id="+id;
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {

				 id=rs.getInt("P_Id");
				String fname=rs.getString("P_Name");
				Double fprice=rs.getDouble("P_Price");
				int fquantity=rs.getInt("P_Qty");
				String description=rs.getString("P_Description");
				String imagepath=rs.getString("image_path");
				String category=rs.getString("category");
				


				food.setId(id);
				food.setFname(fname);
				food.setFprice(fprice);
				food.setFquantity(fquantity);
				food.setDescription(description);
				food.setImgpath(imagepath);
				food.setCategory(category);

			}
			return food;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return food;
		}

	}

	public boolean update(foodItems food) {
		String query = "UPDATE product SET P_Name='"+food.getFname()+"',P_Price='"+food.getFprice()+"',P_Qty='"+food.getFquantity()+"',P_Description='"+food.getDescription()+"',image_path='"+food.getImgpath()+"',category='"+food.getCategory()+"' WHERE P_Id="+food.getId();
		try {
			Statement stmt=con.createStatement();
			int result= stmt.executeUpdate(query);
			if(result > 0) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}


	}

	public boolean delete(int id) {
		String query="DELETE FROM product WHERE P_Id="+id;
		try {
			Statement stmt=con.createStatement();
			int result= stmt.executeUpdate(query);
			if(result > 0) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
