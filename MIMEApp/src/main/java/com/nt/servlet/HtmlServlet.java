//HtmlServlet.java
package com.nt.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class HtmlServlet extends  HttpServlet
{
	  //2nd service(-,-) method
	public void  service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
          //get PrintWriter object
		  PrintWriter pw=res.getWriter();
		  //set response content type
		  res.setContentType("text/html");
		  //place  output in  response object
		  pw.println("<table border='1' align='center' bgcolor='pink'>");
          pw.println("<tr><th>Player </th> <th> Sport </th> </tr>");
          pw.println("<tr><td>Virat kohli </td> <td> Cricket </td> </tr>");
          pw.println("<tr><td>Ms-Dhoni </td> <td> Cricket </td> </tr>");
		   pw.println("<tr><td>PV Sindhu </td> <td> Badminton </td> </tr>");
		  pw.println("<tr><td>Saniya Mirza </td> <td> Tennis </td> </tr>");
		  pw.println("<tr><td>Sunil Chetri </td> <td> FootBal </td> </tr>");
		  pw.println("</table>");
             
			  // enable  auto refresh on the generated web page
			    //res.setHeader("refresh","10");
				res.setIntHeader("refresh",10);

             pw.println("<br>");
			 pw.println("<h1 style='color:red;text-align:center'> Date and time is :"+new java.util.Date()+"</h1>");
         
			  pw.println("<h1> req obj class name ::"+req.getClass()+"</h1>");
			  pw.println("<h1> res obj class name ::"+res.getClass()+"</h1>");
			 
		  //close stream
		  pw.close();

	}

}
