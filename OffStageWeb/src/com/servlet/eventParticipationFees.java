package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.service.commonService;
import com.service.impl.commonServiceImpl;

/**
 * Servlet implementation class eventParticipationFees
 */
public class eventParticipationFees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public eventParticipationFees() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String eventId = request.getParameter("id");
		String category=request.getParameter("cname");
		commonService cs=new commonServiceImpl();
		
		if((eventId!=null && !eventId.isEmpty()) && (category!=null && !category.isEmpty()))
		{
			PrintWriter out = response.getWriter();
		    out.println(cs.selectFees(Integer.parseInt(eventId),Integer.parseInt(category)));
		}
		else if(eventId!=null && !eventId.isEmpty()) {
			PrintWriter out = response.getWriter();
			JSONObject jsonObject = new JSONObject(cs.selectCategories(Integer.parseInt(eventId)));
		    out.println(jsonObject);
		}
		else {
			request.setAttribute("eventMap", cs.selectEvents());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
