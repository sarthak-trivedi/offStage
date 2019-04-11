package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.userService;
import com.service.impl.userServiceImpl;
import com.shared.accommodationBean;
import com.shared.userBean;

/**
 * Servlet implementation class accommodation
 */
public class accommodation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public accommodation() {
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
		accommodationBean bean=new accommodationBean();
		HttpSession session=request.getSession();
		
		bean.setNoOfDays(request.getParameter("days"));
		bean.setModeId(request.getParameter("pay"));
		if(bean.getModeId().equalsIgnoreCase("paytm"))
			bean.setTransactionNo(request.getParameter("trans"));
		
		bean.setUserId(((userBean)session.getAttribute("userBean")).getId());
	}

}
