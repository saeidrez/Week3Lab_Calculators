
package newservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

   


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String op = request.getParameter("op");
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        try {
   num1 = Integer.parseInt(first);
   num2 = Integer.parseInt(second); 
    request.setAttribute("first", first);
        request.setAttribute("second", second);
        
    
} catch (Exception e) {
request.setAttribute("message", "Result: Invalid");
      getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp")
                    .forward(request, response);
      if (first.equals("") || second.equals("")) {
                
                 request.setAttribute("message", "Result: Invalid");
      getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp")
                    .forward(request, response);
            }
      
}
    
        if (op.equals("+")) {
                result = num1 + num2;
                  request.setAttribute("message", "Result: " + result);
      getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp")
                    .forward(request, response);
      
            } else if (op.equals("-")) {
                result = num1 - num2;
                  request.setAttribute("message", "Result: " + result);
      getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp")
                    .forward(request, response);
            } else if (op.equals("*")) {
                result = num1 * num2;
                  request.setAttribute("message", "Result: " + result);
      getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp")
                    .forward(request, response);
            } else if (op.equals("%")) {
                result = num1 % num2;
                  request.setAttribute("message", "Result: " + result);
      getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp")
                    .forward(request, response);
            } 
     
    }

 


}
