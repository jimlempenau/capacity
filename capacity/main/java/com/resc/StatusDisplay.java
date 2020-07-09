package com.resc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/statusDisplay")

public class StatusDisplay  extends HttpServlet{
	  @Override
	  public void doGet(HttpServletRequest request, 
	                    HttpServletResponse response) 
	                       throws IOException, ServletException {
		  
		  System.out.println("In here");
		  request.setAttribute("name", "Jim Lempenau");
	  }
		  
	  }
