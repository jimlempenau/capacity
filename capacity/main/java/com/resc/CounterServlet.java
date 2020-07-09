package com.resc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

@WebServlet("/CounterServlet")
public class CounterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	String shift = req.getParameter("shift");
    	System.out.println("What is the shift:"+ shift);
    	String action =req.getParameter("action");
    	System.out.println("What is the action:"+ action);
    	
    	if("Signed Up Entered".equalsIgnoreCase(action)) {
    		PeopleCounter.signedUpWalkedIn();
    	}else if("Signed Up Exited".equalsIgnoreCase(action)) {
    		PeopleCounter.signedUpWalkedOut();
    	}else if("Walk In Entered".equalsIgnoreCase(action)) {
    		PeopleCounter.walkedUpWalkedIn();
    	}else if("Walk In Exited".equalsIgnoreCase(action)) {
    		PeopleCounter.walkedUpWalkedOut();
    	}else if("Change Shift".equalsIgnoreCase(action)) {
    		if("shift1".equalsIgnoreCase(shift)) {
    			StatusCounter.isShiftOne = true;
    		}else {
    			StatusCounter.isShiftOne = false;
    		}
    	}else if("Reset Counter?".equalsIgnoreCase(action)) {
    		PeopleCounter.resetCounter();
    	}
    	
    	resp.sendRedirect("main.jsp");
      
    }
}