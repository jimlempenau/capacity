package com.resc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

@WebServlet("/ConfigServlet")
public class ConfigServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String maxCapacity = req.getParameter("maxCapacity");
        String shiftOne = req.getParameter("shiftOne");
        String shiftOneSignUps = req.getParameter("shiftOneSignUps");
        String shiftTwo = req.getParameter("shiftTwo");
        String shiftTwoSignUps = req.getParameter("shiftTwoSignUps");
        
        String takeSignUps = req.getParameter("takeSignups");
        
        System.out.println("What is take signups:"+ takeSignUps);
        StatusCounter.setTakeSignUps(Boolean.parseBoolean(takeSignUps));
        StatusCounter.setMaxCapacity(Integer.parseInt(StringUtils.trim(maxCapacity)));
        StatusCounter.setShiftOne(shiftOne);
        StatusCounter.setShiftOneSignUps(Integer.parseInt(StringUtils.trim(shiftOneSignUps)));
        StatusCounter.setShiftTwo(shiftTwo);
        StatusCounter.setShiftTwoSignUps(Integer.parseInt(StringUtils.trim(shiftTwoSignUps)));
        req.setAttribute("saved", "yes");
     /*   resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>All Set</h1>");
        printWriter.print("<p> max Capacity :: " + StatusCounter.getMaxCapacity() + "</p>");
        printWriter.print("<p> first shift :: " + StatusCounter.getShiftOne() + "</p>");
        printWriter.print("<p> first shift sign-ups :: " + StatusCounter.getShiftOneSignUps()+ "</p>");
        printWriter.print("<p> second shift :: " + StatusCounter.getShiftTwo() + "</p>");
        printWriter.print("<p> second shift sign-ups :: " + StatusCounter.getShiftTwoSignUps()+ "</p>");
        printWriter.print("<a href=\"./config.jsp\"> Go Back </a>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();*/

    	resp.sendRedirect("config.jsp?saved=true");

    }
}