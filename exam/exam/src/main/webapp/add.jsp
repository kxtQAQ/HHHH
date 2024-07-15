
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/pintuer.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/admin.css">
    <script src="<%=request.getContextPath()%>/js/jquery-3.7.1.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/pintuer.js"></script>
</head>
<body>


<div class="panel admin-panel margin-top">
    <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>添加内容</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="<%=request.getContextPath()%>/update">
            <div class="form-group">
                <div class="label">
                    <label>Id:</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="id" value="${eat.id}" readonly="true" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>菜名:</label>
                </div>
                <td>${eat.name}</td>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>价格:</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="price" value="${eat.price}"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>分类:</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="sort" value="${eat.sort}"/>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>

        </form>
    </div>
</div>
</body>
</html>