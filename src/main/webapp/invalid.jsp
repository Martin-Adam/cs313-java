<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invalid login</title>
    </head>
    <body>
        <h1>Invalid Login! Try again!</h1>
        <form action="./Login" method="POST">
            <label for="username">Username:</label>
            <input type="text" name="username" required />
            <input type="submit" />  
        </form>
    </body>
</html>
