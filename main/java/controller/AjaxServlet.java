package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/getHtmlAjax.do"})
public class AjaxServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		resp.setContentType("text/html; charset=UTF-8");
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		
	}

	public void process(HttpServletRequest req, HttpServletResponse res) throws IOException{
		System.out.println("에이잭스 호출!!!");
		PrintWriter out = res.getWriter();
		
		out.print("<p>여기는 ajax통신 후 HTML로 붙일 데이터입니다.</p>");
		out.print("<p>런던은 영국의 수도이죠.</p>");
		out.print("<p>영국은 축구의 종주국으로도 유명합니다. 메이저리그인 프리미어리그가 있습니다.</p>");
		out.print("<strong>그리고 리그에서 수많은 팀들이 존재합니다. 그 중에서 맨체스터 유나이티드, 리버풀, 아스날, 첼시, 토트넘..등 이 이외에도 여러팀들도 존재합니다.</strong>");
		
		
		
	}
	
}
