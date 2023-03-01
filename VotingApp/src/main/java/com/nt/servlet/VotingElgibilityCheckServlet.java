//VotingElgibilityCheckServlet.java
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VotingElgibilityCheckServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("VotingElgibilityCheckServlet:doPost(-,-)");
		//get PrintWriter object
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		
		//read form data (req param values)
		String name=req.getParameter("pname");
		String addrs=req.getParameter("paddrs");
		int age=Integer.parseInt(req.getParameter("page"));
		
		//write b.logic
		if(age>=18) {
			pw.println("<h1 style='color:green;text-align:center'>"+name+" u r  elgible for voting </h1>");
		}
		else {
			pw.println("<h1 style='color:red;text-align:center'>"+name+" u r not elgible for voting </h1>");
		}
		//add home as the graphical hyperlink
		pw.println("<br><br><a href='input.html'><img src='images/home.jfif' width='50' height='50'> </a>");
		
		//close the stream
		pw.close();
		
	}//doGet(-,-)
	
	/*
	 * @Override public void doGet(HttpServletRequest req, HttpServletResponse res)
	 * throws ServletException, IOException {
	 * System.out.println("VotingElgibilityCheckServlet.doGet()"); //get PrintWriter
	 * object PrintWriter pw=res.getWriter(); //set response content type
	 * res.setContentType("text/html");
	 * 
	 * pw.println("<h1 style='color:red;text-align:center'> date and time is ::"+new
	 * java.util.Date()+" </h1>");
	 * 
	 * //add home as the graphical hyperlink pw.
	 * println("<br><br><a href='input.html'><img src='images/home.jfif' width='50' height='50'> </a>"
	 * );
	 * 
	 * //close the stream pw.close();
	 * 
	 * }
	 */
	
	

}//class
