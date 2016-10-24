<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/6
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>user register</title>
    <link href="<%=request.getContextPath()%>/static/bootstrap/css/bootstrap.css" rel="stylesheet">
    <script src="<%=request.getContextPath()%>/static/bootstrap/js/bootstrap.js" ></script>
    <script src="<%=request.getContextPath()%>/static/jquery/1.11.3/jquery.js" type="text/javascript"></script>

</head>
<body>

<div class="container col-md-4 col-md-offset-4" style="padding-top:40px;">
    <form:form modelAttribute="User" class="form-horizontal" role="form">
        <h2 class="form-signin-heading" style="text-align: center">用户注册</h2>
        <div class="form-group">
            <label for="loginName" class="col-sm-2 control-label">loginName</label>
            <div class="col-sm-10">
                <form:input path="loginName" class="form-control"  maxlength="50" required="required"></form:input>
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <label for="Name" class="col-sm-2 control-label">Name</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="Name" placeholder="Name">
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-sm-2 control-label">email</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="email" placeholder="email">
            </div>
        </div>
        <div class="form-group">
            <label for="phone" class="col-sm-2 control-label">phone</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="phone" placeholder="phone">
            </div>
        </div>
        <div class="form-group">
            <label for="mobile" class="col-sm-2 control-label">mobile</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="mobile" placeholder="mobile">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">register</button>
            </div>
        </div>
    </form:form>
</div>
</body>


</html>
