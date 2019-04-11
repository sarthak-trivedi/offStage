package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.studentBean;

/**
 * Servlet implementation class student
 */
public class student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public student() {
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
		userService us=new userServiceImpl();
		studentBean sb=new studentBean();
		
		sb.setId(request.getParameter("sid"));
		sb.setName(request.getParameter("name"));
		sb.setEmail(request.getParameter("email"));
		sb.setContact(request.getParameter("number"));
		sb.setAltContact(request.getParameter("emNumber"));
		sb.setBatchYear(request.getParameter("year"));
		sb.setProgramme(request.getParameter("course"));
		sb.setGender(request.getParameter("gender"));
		
		System.out.println(sb.getId());
		System.out.println(sb.getName());
		System.out.println(sb.getEmail());
		System.out.println(sb.getContact());
		System.out.println(sb.getAltContact());
		System.out.println(sb.getBatchYear());
		System.out.println(sb.getGender());
		System.out.println(sb.getProgramme());
		
	}

}
