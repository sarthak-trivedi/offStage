package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.committeeBean;
import com.shared.userBean;

/**
 * Servlet implementation class managementLogin
 */
public class managementLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public managementLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		
		HttpSession session = request.getSession();
		userService login=new userServiceImpl();
		committeeBean bean=login.getMember(username, password);
		if(bean!=null)
		{
				String role=bean.getRole();
				if(role.equals("admin") || role.equals("convenor") || role.equals("deputy convenor"))
				{		
					session.setAttribute("userbean", bean);
					session.setAttribute("type", "management");
					response.sendRedirect("index.jsp");
				}
				else
					response.sendRedirect("login.jsp");
		}
		else
			response.sendRedirect("login.jsp");
	}

}
