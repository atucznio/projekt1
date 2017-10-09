<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<title>HelloWorld page</title>
</head>
<body>
    Greeting : ${greeting}

    <form action = "/firstPage" method = "GET">
        First Name: <input class="form-control" type = "text" name = "first_name">
        <br />
        Last Name: <input class="form-control" type = "text" name = "last_name" />
        <input type = "submit" value = "Submit" class="btn btn-default" />
    </form>

</body>
</html>