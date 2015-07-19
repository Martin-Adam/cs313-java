<%-- 
    Document   : splashPage
    Created on : Jul 18, 2015, 5:58:14 PM
    Author     : isaacmetcalf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" type="text/css" href="AccountabilityApp.css">
        <link href='http://fonts.googleapis.com/css?family=Cabin' rel='stylesheet' type='text/css'>
        <title>Splash Page</title>
        <style>
            body {
                background-color: pink;
            }
            
            .carousel-inner img {
                margin: auto;
            }
        </style>

    </head>
    <body>
        <h2>The Accountability App</h2>
        <p>The purpose of this app is to allow users to enter goals</p>
        <p>and post a status update to Facebook if the goal is not met.</p>
        <p>Since we can't upload a working version to Facebook in time,</p>
        <p>the demonstration will be done through screen shots shown below.</p>
        <p>-Kevin Johnson, Isaac Metcalf, Adam Martin</p>

        <div id="screenshots" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#screenshots" data-slide-to="0" class="active"></li>
                <li data-target="#screenshots" data-slide-to="1"></li>
                <li data-target="#screenshots" data-slide-to="2"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="welcome.jpg" alt="welcome" width="540" height="300">
                </div>

                <div class="item">
                    <img src="welcome_jsp.jpg" alt="welcome_jsp" width="540" height="300">
                </div>

                <div class="item">
                    <img src="newGoal_jsp.jpg" alt="newGoal_jsp" width="540" height="300">
                </div>
            </div>

            <!-- Left and right controls -->
            <a class="left carousel-control" href="#screenshots" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#screenshots" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </body>
</html>
