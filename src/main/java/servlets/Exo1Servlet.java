package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exo1ServletBis
 */
@WebServlet("/exo1")
public class Exo1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exo1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		var fruits =new ArrayList<String>();
		fruits.add("Fraise");
		fruits.add("Fraise");
		fruits.add("Pomme");
		fruits.add("Pomme");
		fruits.add("Pomme");
		fruits.add("Orange");
		fruits.add("Fraise");
		fruits.add("Fraise");
		fruits.add("Pomme");
		fruits.add("Pomme");
		fruits.add("Pomme");
		fruits.add("Orange");
		request.setAttribute("fruits",fruits);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Exo1.jsp").forward(request, response);
	}


}
