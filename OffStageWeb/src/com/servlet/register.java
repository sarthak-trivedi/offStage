package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.participantBean;
import com.shared.userBean;

/**
 * Servlet implementation class register
 */
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
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
		userService register=new userServiceImpl();
		userBean sb=new userBean();
		
		sb.setName(request.getParameter("name"));
		sb.setEmail(request.getParameter("email"));
		sb.setContact(request.getParameter("number"));
		sb.setAltContact(request.getParameter("altNumber"));
		sb.setCollege(request.getParameter("college"));
		sb.setPassword(request.getParameter("pass"));
		sb.setAddress(request.getParameter("address"));
		sb.setGender(request.getParameter("gender"));
		if(sb.getCollege().toLowerCase()=="daiict")
			sb.setId(request.getParameter("sid"));
		
		String msg=register.addUserData(sb);
		if(msg=="Registration Successfull")
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		else
		{
			response.sendRedirect("register.jsp");
		}
	}

}
