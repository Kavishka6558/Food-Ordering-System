package sevlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.customerDAO;
import entities.CartItem;
import entities.customer;
import utilities.Cart;

@WebServlet("/Addtocart-product")
public class AddtocartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AddtocartServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	 String itemId = request.getParameter("id");
         String itemName = request.getParameter("name");
         int quantity = 1;
         double price = Double.parseDouble(request.getParameter("price"));
         String image_path = request.getParameter("image_path");

         // Create cart item
         CartItem item = new CartItem(itemId, itemName, quantity, price ,image_path);

         // Retrieve cart from session or create a new one
         HttpSession session = request.getSession();
         Cart cart = (Cart) session.getAttribute("cart");
         if (cart == null) {
             cart = new Cart();
             session.setAttribute("cart", cart);
             
         }

         // Add item to cart
         cart.addItem(item);

         // Redirect to cart page
         response.sendRedirect( "FOS_menu.jsp");
    }
}
 