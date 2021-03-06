<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增书籍</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <%--<form action="${pageContext.request.contextPath}/book/addBook" method="post">--%>
    <%--    书籍名称：<input type="text" name="bookName" class="form-control"><br><br><br>--%>
    <%--    书籍数量：<input type="text" name="bookCounts" class="form-control"><br><br><br>--%>
    <%--    书籍详情：<input type="text" name="detail" class="form-control"><br><br><br>--%>
    <%--    <input type="submit" value="添加">--%>
    <%--</form>--%>
    <form class="form-horizontal" action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label for="name" class="col-sm-1 control-label">书籍名称</label>
            <div class="col-sm-10">
                <input type="text" name="bookName" class="form-control" id ="name">
            </div>
        </div>
        <div class="form-group">
            <label for="number" class="col-sm-1 control-label">书籍数量</label>
            <div class="col-sm-10">
                <input type="text" name="bookCounts" class="form-control" id="number">
            </div>
        </div>
        <div class="form-group">
            <label for="detail" class="col-sm-1 control-label">书籍详情</label>
            <div class="col-sm-10">
                <input type="text" name="detail" class="form-control" id = "detail">
            </div>
        </div>
        <%--col-sm-offset-2 col-sm-10--%>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">添加</button>
            </div>
        </div>
    </form>

</div>