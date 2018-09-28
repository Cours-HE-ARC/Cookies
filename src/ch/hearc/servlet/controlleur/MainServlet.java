package ch.hearc.servlet.controlleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(
		name="mainServlet",
		urlPatterns = ""
)
public class MainServlet extends HttpServlet{


	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		
		Cookie cookie = new Cookie("monCookie", "cookie-ok.");
		cookie.setMaxAge(100 * 1000 * 60); //100 secondes
		resp.addCookie(cookie);
		
		String filtreValue = (String)req.getAttribute("filter");
		
		System.out.println("FiltreValue: " + filtreValue);
	}
}
