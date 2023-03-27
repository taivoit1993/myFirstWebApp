<html>
    <head>
        <title>Login Page JSP </title>
    </head>
    <body>
        <h1>Welcome to login</h1>
        <pre>${errorMessage}</pre>
        <form method="POST">
            Name: <input name="name" type="text"/>
            Password: <input name="password" type="password"/>
            <input type="submit"/>
        </form>
    </body>
</html>