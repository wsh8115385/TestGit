package com.first;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
