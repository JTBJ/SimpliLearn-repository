package dynamic_webpages_using_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Lesson1_Implement_Servlet_Interface implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Doing some cleanup stuff.");

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Doing some startup stuff.");

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String hobby = request.getParameter("hobby");
		
		out.println("<!DOCTYPE html><html><head>");
		out.println("<title>Extending the Servlet Interface</title>");
		out.println("<body><h1>Extending the Servlet Interface</h1>");
		out.println("<h2>" + hobby + " is a fine hobby</h2>");
		out.println("</body></html>");
	}

}
