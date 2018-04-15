<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018-04-15
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/statics/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="/statics/css/plugins/bootstrap-table/bootstrap-table.min.css">
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <link rel="stylesheet" href="/statics/css/plugins/sweetalert/sweetalert.css">
    <link rel="stylesheet" href="/statics/css/plugins/datapicker/datepicker3.css">
    <%--<link href="/statics/css" rel="stylesheet">--%>
</head>
<body>
<c:forEach items="${stateList}" var="state">
    <c:out value="${state.id}"/>
    <c:out value="${state.name}"/>
    <c:out value="${state.descriptor}"/>
    <c:out value="${state.type.id}"/>
    <c:out value="${state.type.name}"/>
    <c:out value="${state.type.descriptor}"/>
</c:forEach>

<script src="/statics/js/jquery-3.2.1.min.js"></script>
<script src="/statics/js/bootstrap.js"></script>
<script src="/statics/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script src="/statics/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="/statics/js/plugins/sweetalert/sweetalert.min.js"></script>
<script src="/statics/js/plugins/datapicker/bootstrap-datepicker.js"></script>
<%--<script src="/statics/js/index.js"></script>--%>
</body>
</html>
