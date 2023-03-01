package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/arithmeticurl")
public class AirthmeticOperationsServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter object
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//read addtional request param (s1)  value
		String s1Val=req.getParameter("s1");
		//read form data
		double val1=0.0 , val2=0.0;
		if(!s1Val.equalsIgnoreCase("link1") && !s1Val.equalsIgnoreCase("link2")) {
			val1=Double.parseDouble(req.getParameter("t1"));
			val2=Double.parseDouble(req.getParameter("t2"));
		}
		// Differentiate logics  for hyperlinks and submit buttons
		if(s1Val.equalsIgnoreCase("add")) {
			pw.println("<h1> sum is :: "+(val1+val2)+"</h1>");
		}
		else if(s1Val.equalsIgnoreCase("sub")) {
			pw.println("<h1> sub is :: "+(val1-val2)+"</h1>");
		}
		else if(s1Val.equalsIgnoreCase("mul")) {
			pw.println("<h1> Mul is :: "+(val1*val2)+"</h1>");
		}
		else if(s1Val.equalsIgnoreCase("div")) {
			pw.println("<h1> Div is :: "+(val1/val2)+"</h1>");
		}
		else if(s1Val.equalsIgnoreCase("link1")) {  //for hyperlink1
			// get current time 
			LocalTime time=LocalTime.now();
			//get current hour of the day
			int hour=time.getHour();
			//display wish message
			if(hour<12)
				pw.println("<h1>Good Morning </h1>");
			else if(hour<16)
				pw.println("<h1>Good Afternoon </h1>");
			else if(hour<20)
				pw.println("<h1>Good Evening </h1>");
			else 
				pw.println("<h1>Good Night </h1>");
		}
		else {  //for hyperlink2
			// system date and time
			LocalDate ldt=LocalDate.now();
			//get current month 
			int month=ldt.getMonthValue();
			//display season name
			if(month>=3 && month<=6)
				pw.println("<h1> Summer Season </h1>");
			else if(month>=7 && month<=10)
				pw.println("<h1> Rainy Season </h1>");
			else
				pw.println("<h1> winter Season </h1>");
					
			
		}
		
		
		//add home hyperlink
		pw.println("<br><a href='input.html'>home </a>");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

}
