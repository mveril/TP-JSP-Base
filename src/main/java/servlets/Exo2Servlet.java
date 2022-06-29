package servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exo2Servlet
 */
@WebServlet("/exo2")
public class Exo2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exo2Servlet() {
        super();     
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String result = null;
		Integer isGood = null;
		
		try {
			isGood = Integer.parseInt(request.getParameter("isGood"));	
		} catch(NumberFormatException | NullPointerException e) {
			
		}
		if (isGood != null){
			switch(isGood) {
			   case 0:
				  result = "Ce n’est pas bon !";
				  break;
			   case 1:
				   result = "C’est bon !";
				   break;
			}	
		}
		request.setAttribute("status", result);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Exo2.jsp").forward(request, response);
	}
}
