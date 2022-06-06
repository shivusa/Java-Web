

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetStudentDetailsController
 */

public class GetStudentDetailsController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studeny_id = Integer.parseInt(request.getParameter("studeny_id"));
		
		StudentDao d1= new StudentDao();
		Student s1 = d1.getStudentDetails(studeny_id);
		
		HttpSession session = request.getSession();
		session.setAttribute("student", s1);
		
		response.sendRedirect("ShowStudent.jsp");
		
	}
}
