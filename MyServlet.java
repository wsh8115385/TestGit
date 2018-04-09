package com.first;
//×îÖÕ°æ±¾
import java.io.*;
import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		PrintWriter out = resp.getWriter();
		out.print("Hello!");
		out.close();
	}

    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		doGet(req,resp);
	}

}
