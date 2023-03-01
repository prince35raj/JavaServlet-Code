//GetCapitalsServlet
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetCapitalsServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 //get PrintWrtier object
		 PrintWriter pw=res.getWriter();
		 //set response content type
		 res.setContentType("text/html");
		 //read form data
		  int countryCode=Integer.parseInt(req.getParameter("country"));
		  //write  b.logic
		   String  capitals[]=new String[] {"New delhi","Bejing","Islmabad","washingtonDC","London"};
		   //dipslay the capital city
		  pw.println("<h1 style='color:red;text-align:center'>Capital city is  ::"+capitals[countryCode]+"</h1>");
		  
		  // add home hyperlink
		  pw.println("<br> <a href='input.html'>home </a>");
		  
		  //close the stream
		  pw.close();
		 
		
	}

}
