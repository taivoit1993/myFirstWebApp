<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet"></link>
    <title>List Todo Page </title>
</head>
<body>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <h1>Welcome to listTodo</h1>
    <hr/>
    <table class="table">
        <thead>
        <tr>
            <th>id</th>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is Done?</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a>
                    <a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="add-todos" class="btn btn-success">Add Todo</a>
</div>

<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.3/dist/jquery.min.js"></script>
</body>
</html>