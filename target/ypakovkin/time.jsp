<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Зараз:  <%=LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy.HH:mm:ss"))%> </h1>
</body>
</html>
