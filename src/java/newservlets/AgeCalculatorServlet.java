/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newservlets;

import static com.sun.org.apache.xml.internal.serializer.utils.Utils.messages;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class AgeCalculatorServlet extends HttpServlet {


    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String age = request.getParameter("age");
         String input = "";
       
        
            if (age == null || age.equals("")) {
            request.setAttribute("message", "You must give your current age");
             getServletContext().getRequestDispatcher("/agecalculator.jsp")
                    .forward(request, response);
            return; 
        } 
             try {
   int x = Integer.parseInt(age); 
}catch(NumberFormatException e) {
  request.setAttribute("message", "You must enter a number.");
  getServletContext().getRequestDispatcher("/agecalculator.jsp")
                    .forward(request, response);
            return; 
 } 
            
        int ageint = Integer.parseInt(age);
        int newage = ageint + 1;
        request.setAttribute("message", "Your age next birthday will be " + newage);
      getServletContext().getRequestDispatcher("/agecalculator.jsp")
                    .forward(request, response);
        
      
    }

   
}
