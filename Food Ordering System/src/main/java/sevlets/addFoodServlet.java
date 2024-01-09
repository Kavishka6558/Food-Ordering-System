package sevlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.foodItemDAO;
import entities.foodItems;

/**
 * Servlet implementation class addFoodServlet
 */
@WebServlet("/addFood")
public class addFoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String fname=request.getParameter("fname");
		Double fprice=Double.parseDouble(request.getParameter("fprice"));
		int fquantity=Integer.parseInt(request.getParameter("fquantity"));
		String description=request.getParameter("description");
		String imagepath=request.getParameter("imgpath");
		String category=request.getParameter("category");
		
		
		//Set values to student object
		foodItems food=new foodItems();
		food.setFname(fname);
		food.setFprice(fprice);
		food.setFquantity(fquantity);
		food.setDescription(description);
		food.setCategory(category);
		food.setImgpath(imagepath);
		
		//Invoke  insert method in DAO class
		foodItemDAO fooddao=new foodItemDAO();
		boolean result= fooddao.insert(food);
		if(result) {
			response.sendRedirect("newFood.jsp");
		}else {
			response.getOutputStream().print("Something went wrong");
			response.sendRedirect("newFood.jsp");
		}
		
	}
		
	}


