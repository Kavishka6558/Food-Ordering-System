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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login-customer")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String log_email=request.getParameter("log_email");
		String log_password=request.getParameter("log_password");
		
		if(log_email.equals("kusal@gmail.com")&& log_password.equals("1234")) {
			response.sendRedirect("newFood.jsp");
		}else {
			customer st=new customer();
			st.setLog_email(log_email);
			st.setLog_passsword(log_password);
			
			//Invoke  insert method in DAO class
			customerDAO stdao=new customerDAO();
			boolean result= stdao.login(st);
			if(result) {
				response.sendRedirect("FOS_menu.jsp");
			}else {
				response.getOutputStream().print("Something went wrong");
				response.sendRedirect("FOS_login.jsp");
			}
		}
		//Set values to student object
		
	}

}
