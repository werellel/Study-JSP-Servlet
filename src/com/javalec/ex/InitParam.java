package com.javalec.ex;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParam
 */
@WebServlet(urlPatterns = {"/InitP"}, initParams = { @WebInitParam(name="id", value="aaaa"), @WebInitParam(name="pw", value="0000")})
public class InitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		ServletConfig
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		
		String contextId = getServletContext().getInitParameter("id");
		String contextPw = getServletContext().getInitParameter("pw");
		System.out.println(contextId);
		System.out.println(contextPw);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
