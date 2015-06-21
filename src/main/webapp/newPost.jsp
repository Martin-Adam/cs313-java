<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create New Post</title>
    </head>
    <body>
        <h1>Create a new post:</h1>
        <form action="./CreatePost" method="POST">
            <label for="content">Content:</label>
            <textarea name="content"></textarea>
            <input type="submit" />
        </form>
        <a href="./LoadPosts">View posts without submitting</a>
    </body>
</html>
