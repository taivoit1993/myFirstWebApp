<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet"></link>
        <title>List Todo Page </title>
    </head>
    <body>
    <div class="container">
    <h1>Welcome to listTodo</h1>
            <hr/>
            <table class="table">
                <thead>
                    <th>id</th>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Is Done?</th>
                </thead>
                <tbody>

                          <c:forEach items="${todos}" var="todo">
                          <tr>
                            <td>${todo.id}</td>
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.done}</td>
                            </tr>
                        </c:forEach>

                </tbody>
            </table>
    </div>

        <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
          <script src="webjars/jquery/3.6.3/dist/jquery.min.js"></script>
    </body>
</html>