<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2020, 4:25:04 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <Form action="arithmetic" method="post">
            First: <input type="text" name="first" value="${first}" /><br>
            Second: <input type="text" name="second" value="${second}" /><br>
            <input type="submit" name="op" value="+">
            <input type="submit" name="op" value="-">
            <input type="submit" name="op" value="*">
            <input type="submit" name="op" value="%">
        </form>
        <br>
        <p>${message}</p>
        <a href="agecalculator.jsp">Age Calculator</a>
            
    </body>
</html>
