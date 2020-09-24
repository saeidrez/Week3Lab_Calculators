<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2020, 3:50:27 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <Form action="AgeCalculatorServlet" method="post">
            Enter your age: <input type="text" name="age" /> <br>
            <input type="submit" value="Age next birthday"><br>
            
            
        </Form>
           <p>${message}</p>
        <a href="arithmeticcalculator.jsp">Arithmetic Calculator</a>
    </body>
</html>
