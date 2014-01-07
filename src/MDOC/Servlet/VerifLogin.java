package MDOC.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MDOC.Dao.ContactDao;



/**
 * Servlet implementation class VerifLogin
 */
public class VerifLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerifLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pseudo = (String) request.getParameter("pseudo");
		String pass = (String) request.getParameter("pass");
		if(!pseudo.isEmpty() && !pass.isEmpty()){
			ContactDao daoContact = new ContactDao();
			daoContact.getContact("nanterre");
			if(pseudo.equalsIgnoreCase(pass))
				request.getRequestDispatcher("Pages/home.jsp").forward(request, response);
			
			else
				request.getRequestDispatcher("index.html").forward(request, response);
		}else
			request.getRequestDispatcher("index.html").forward(request, response);
	}

}
