//WishMessageServlet .java
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WishMessageServlet extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    //get PrintWriter object
		  PrintWriter pw=res.getWriter();
		  //set response content type
		  res.setContentType("text/html");
		  // get System date and time  (java8)
		    LocalDateTime ldt=LocalDateTime.now();  // static factory method  
		 //get current hour of the day
		   int hour=ldt.getHour();   //24 hrs format
		   if(hour<12) 
			   pw.println("<h1 style='color:orange;text-align:center'>Good Morning  </h1> ");
		  else if(hour<16)
			  pw.println("<h1 style='color:red;text-align:center'>Good Afternoon  </h1> "); 
		  else if(hour<20)
			  pw.println("<h1 style='color:pink;text-align:center'>Good Evening  </h1> "); 
		  else 
			  pw.println("<h1 style='color:blue;text-align:center'>Good Night </h1> "); 
		   
		   
		  //add home hyperlink
		   pw.println("<br> <a href='page.html'>home</a>");
		   
		   //close stream
		   pw.close();
		   
		   
	}//service(-,-)

}//class
