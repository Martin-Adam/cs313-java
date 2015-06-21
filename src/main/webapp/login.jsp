<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        
        <%
            session = request.getSession(); 
            if (session.getAttribute("username") != null)
                response.sendRedirect("./newPost.jsp");
        %>
        
        <h1>Sign in here!</h1>
        <form action="./Login" method="POST">
            <label for="username">Username:</label>
            <input type="text" name="username" required />
            <input type="submit" />
            
        </form>
    </body>
</html>
