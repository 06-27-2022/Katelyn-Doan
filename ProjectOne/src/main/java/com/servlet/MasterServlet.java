package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MasterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8143685586996317000L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("<h1>Welcome back!</h1><p>Please login or register!<p>");
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String requestBodyText = new String(request.getInputStream().readAllBytes());
		System.out.print(requestBodyText);
//		ObjectMapper objectmapper = new ObjectMapper();
//		Employee client
	}

}
