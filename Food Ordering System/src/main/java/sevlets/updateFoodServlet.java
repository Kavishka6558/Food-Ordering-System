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
 * Servlet implementation class updateFoodServlet
 */
@WebServlet("/updateFood")
public class updateFoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String fname=request.getParameter("fname");
		Double fprice=Double.parseDouble(request.getParameter("fprice"));
		int fquantity=Integer.parseInt(request.getParameter("fquantity"));
		String description=request.getParameter("description");
		String imagepath=request.getParameter("imgpath");
		String category=request.getParameter("category");
		foodItems food=new foodItems();

		food.setId(id);
		food.setFname(fname);
		food.setFprice(fprice);
		food.setFquantity(fquantity);
		food.setDescription(description);
		food.setCategory(category);
		food.setImgpath(imagepath);

		foodItemDAO fooddao=new foodItemDAO();
		boolean result= fooddao.update(food);
		if(result) {
			response.sendRedirect("newFood.jsp");
		}else {
			response.getOutputStream().print("Something went wrong");
			response.sendRedirect("newFood.jsp?id="+id);
		}

	}
	}


