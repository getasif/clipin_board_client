package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.ProductsUtilProxy;

/**
 * Servlet implementation class Categories
 */
public class Categories extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductsUtilProxy productProxy = new ProductsUtilProxy();      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Categories() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("This is the Product Servlet   /n\n");
		response.setContentType("text/html");

		try{
			System.out.println("Inside Get of Products");
			//HttpSession session = request.getSession();
			productProxy.setEndpoint("http://localhost:8080/AsifServer/services/ProductsUtil");
			String[] products = productProxy.categories();
			for (String product : products) {
				System.out.println(product);
			}
			request.setAttribute( "done", "doneeeeeee");
			request.setAttribute( "products", products);
			RequestDispatcher view = request.getRequestDispatcher("/View/ProductCatalog.jsp"); 
			view.forward(request, response);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		




	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//out.println("This is the Product Servlet   /n\n");
		response.setContentType("text/html");

		try{
			System.out.println("Inside Get of Products");
			//HttpSession session = request.getSession();
			String bname = request.getParameter("bname");
			String bdescription = request.getParameter("bdescription");
			String bcategories = request.getParameter("bcategories");
			productProxy.setEndpoint("http://localhost:8080/AsifServer/services/ProductsUtil");
			boolean result= productProxy.insertBoard(bname, bdescription, bcategories);
			if(result){
			out.println("Insert Successfull");
			}
			else{
				out.println("Not Sucessfull");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		


	}

}
