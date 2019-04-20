package com.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.commonService;
import com.service.userService;
import com.service.impl.commonServiceImpl;
import com.service.impl.userServiceImpl;
import com.shared.memberBean;
import com.shared.participantBean;
import com.shared.userBean;

/**
 * Servlet implementation class participation
 */
public class participation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public participation() {
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
		participantBean pb=new participantBean();
		participantBean pb2=new participantBean();
		memberBean bean=null;
		commonService cs=new commonServiceImpl();
		HttpSession session=request.getSession(false) ;
		
		pb.setEventId(request.getParameter("event"));
		pb.setParticipatioFeeId(request.getParameter("category"));
		pb.setPaymentMode(request.getParameter("payment"));
		
		pb.setParticipantId(((userBean)session.getAttribute("userbean")).getId());
		Map<Integer, String> category=cs.selectCategories(Integer.parseInt(pb.getEventId()));
		pb.setPartcipationCategory(category.get(Integer.parseInt(pb.getParticipatioFeeId())));
		
		String ctgr=pb.getPartcipationCategory();
		if(ctgr.equalsIgnoreCase("duet"))
		{
			us.addParticipationData(pb);
			pb2=us.getParticipationId(pb);
			bean=new memberBean();
			bean.setName(request.getParameter("memberName"));
			bean.setEmail(request.getParameter("memberEmail"));
			bean.setContact(request.getParameter("memberContact"));
			bean.setGender(request.getParameter("memberGender"));
			bean.setParticipationId(pb2.getId());
			us.addMemberData(bean);
			
		}
		else if(ctgr.equalsIgnoreCase("group"))
		{
			int member=Integer.parseInt(request.getParameter("member"));
			pb.setTeamName(request.getParameter("teamName"));
			us.addParticipationData(pb);
			pb2=us.getParticipationId(pb);
			for(int i=1;i<=member;i++)
			{
				bean=new memberBean();
				bean.setName(request.getParameter("memberName"+i));
				bean.setEmail(request.getParameter("memberEmail"+i));
				bean.setContact(request.getParameter("memberContact"+i));
				bean.setGender(request.getParameter("memberGender"+i));
				bean.setParticipationId(pb2.getId());
				us.addMemberData(bean);
				}
		}
		else
			us.addParticipationData(pb);
		
		System.out.println();
		
		userBean ub=new userBean();
		
		us.registrationMail(((userBean)session.getAttribute("userbean")), Integer.parseInt(pb.getEventId()));
		response.sendRedirect("index.jsp");
	}

}
