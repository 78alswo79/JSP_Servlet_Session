package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import util.MemberInfo;

@WebServlet(urlPatterns = {"/controller/SessionServlet.do"})
public class SessionServlet extends HttpServlet{

	MemberInfo memberInfo = null;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		process(req, resp);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void process (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		System.out.println("환영합니다!");
		
		HttpSession session = req.getSession(false); 
		session.setMaxInactiveInterval(0);
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		memberInfo = new MemberInfo(id, pw, name, email);
		
		if (memberInfo != null) {
			session.setAttribute("memberInfo", memberInfo);
		}
				
		System.out.println(memberInfo.toString());
		
		req.getRequestDispatcher("/practice/viewSession.jsp").forward(req, res);
//		res.sendRedirect(req.getContextPath()+"/practice/viewSession.jsp");
	}
	
	
}
