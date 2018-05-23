<%-- 
    Document   : add
    Created on : May 24, 2018, 1:24:46 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add User</title>
    </head>
    <body>
        <h1>Add User</h1>
        <form  method="POST" action="${pageContext.request.contextPath}/admin/users/save">
            <div class="form-group">
                <label>User Name</label>
                <input type="text" name="userName" required="required" class="form-control"  placeholder="Please enter username" />
            </div>
            <div class="form-group">
                <label>Password</label>
                <input type="password" name="password" required="required" class="form-control"  placeholder="Please enter password" />
            </div>
            <div class="form-group">
                <label>Email</label>
                <input type="email" name="email" required="required" class="form-control"  placeholder="Please enter email address" />
            </div>
            <button type="submit" class="btn-success">Add User</button>
        </form>
    </body>
</html>
