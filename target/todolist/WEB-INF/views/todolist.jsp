<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcom to ToDo List</title>
</head>
<body>
	<center>
		<h2>TODO List</h2>
		<h2>
			${message} ${name}
		</h2>
		

		<c:forEach var="task" items="${tasks}">
                <tr>
                    <td><c:out value="${task.id}"  /></td>
                    <td><c:out value="${task.title}" /></td>
                    <td><c:out value="${task.note}" /></td>
                    <td><c:out value="${task.status}" /></td>
                    <td><c:out value="${task.dueDate}" /></td>
                </tr>
		</c:forEach>
		
	</center>
</body>
</html>