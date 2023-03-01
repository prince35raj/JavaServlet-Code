//PlainServlet.java
package com.nt.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class PlainServlet extends  HttpServlet
{
	  //2nd service(-,-) method
	protected void  service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
          //get PrintWriter object
		  PrintWriter pw=res.getWriter();
		  //set response content type
		  res.setContentType("text/plain");
		  //place  output in  response object
		  pw.println("<table border='1' align='center' bgcolor='cyan'>");
          pw.println("<tr><th>Player </th> <th> Sport </th> </tr>");
          pw.println("<tr><td>Virat kohli </td> <td> Cricket </td> </tr>");
          pw.println("<tr><td>Ms-Dhoni </td> <td> Cricket </td> </tr>");
		   pw.println("<tr><td>PV Sindhu </td> <td> Badminton </td> </tr>");
		  pw.println("<tr><td>Saniya Mirza </td> <td> Tennis </td> </tr>");
		  pw.println("<tr><td>Sunil Chetri </td> <td> FootBal </td> </tr>");
		  pw.println("</table>");
		  //close stream
		  pw.close();

	}

}
