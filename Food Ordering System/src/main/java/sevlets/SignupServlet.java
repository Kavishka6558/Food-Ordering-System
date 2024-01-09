package sevlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.customerDAO;
import entities.customer;

/**
 * Servlet implementation class SighnupServlet
 */
@WebServlet("/Signup-customer")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String pnumber=request.getParameter("pnumber");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		//Set values to student object
		customer st=new customer();
		st.setName(name);
		st.setPnumber(pnumber);
		st.setEmail(email);
		st.setPassword(password);
		
		//Invoke  insert method in DAO class
		customerDAO stdao=new customerDAO();
		boolean result= stdao.signup(st);
		if(result) {
			response.sendRedirect("FOS_menu.jsp");
		}else {
			response.getOutputStream().print("Something went wrong");
			response.sendRedirect("FOS_signup.jsp");
		}
	}

}
