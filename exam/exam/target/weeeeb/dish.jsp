<%--
  Created by IntelliJ IDEA.
  User: 16261
  Date: 2024/7/12
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

               <%-- </li>
                <if condition="$iscid eq 1">
                    <li>
                        <select name="cid" class="input" style="width:200px; line-height:17px;" onchange="changesearch()">
                            <option value="">请选择分类</option>
                            <option value="">产品分类</option>
                            <option value="">产品分类</option>
                            <option value="">产品分类</option>
                            <option value="">产品分类</option>
                        </select>
                    </li>--%>
                <%--</if>--%>
                <%--<li>
                    <input type="text" placeholder="请输入搜索关键字" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
                    <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a></li>--%>
            <%--</ul>--%>
               <%--/div><--%>
        <table class="table table-hover text-center">
            <tr>
                <th width="100" style="text-align:left; padding-left:20px;">编号</th>
                <th width="10%">菜名</th>
                <th>价格</th>
                <th>分类</th>
                <th width="310">操作</th>
            </tr>
            <%--<volist name="list" id="vo">
                <tr>
                    <td style="text-align:left; padding-left:20px;"><input type="checkbox" name="id[]" value="" />
                        1</td>
                    <td><input type="text" name="sort[1]" value="1" style="width:50px; text-align:center; border:1px solid #ddd; padding:7px 0;" /></td>
                    <td width="10%"><img src="images/11.jpg" alt="" width="70" height="50" /></td>
                    <td>这是一套MUI后台精美管理系统，感谢您的支持</td>
                    <td><div class="button-group"> <a class="button border-main" href="add.html"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="javascript:void(0)" onclick="return del(1,1,1)"><span class="icon-trash-o"></span> 删除</a> </div></td>
                </tr>--%>
            <c:forEach items="${pageInfo.list}" var="eat" varStatus="vs">
            <tr style="background-color: aqua">
                <%--<td><button deptPid="${dept.departmentId}" onclick="toggleSubMenu(${dept.departmentId+1})">+</button></td>--%>
                <td>${eat.id}</td>
                <td>${eat.name}</td>
                <td>${eat.price}</td>
                <td>${eat.sort}</td>
                    <td><div class="button-group"> <a class="button border-main" href="<%=request.getContextPath()%>/add?id=${eat.id}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="<%=request.getContextPath()%>/delete?id=${eat.id}" onclick="return del()"><span class="icon-trash-o"></span> 删除</a> </div></td>



            </tr>
            </c:forEach> <%--遍历显示菜单--%>


                <%--<tr>
                    <td colspan="8"><div class="pagelist"> <a href="">上一页</a>
                        <a href="">下一页</a>
                        <a href="">尾页</a> </div></td>
                </tr>--%>
            <tr>
                <td colspan="8">
                    <div class="pagelist">

                        <a href="<%=request.getContextPath()%>/dishes?pageNum=${pageInfo.prePage}">上一页</a>
                        <c:forEach items="${pageInfo.navigatepageNums}" var="i">
                            <a href="<%=request.getContextPath()%>/dishes?pageNum=${i}">${i}</a>
                        </c:forEach>
                        <%-- <c:if test="${pageInfo.isLastPage}">
                             <a href="javascript:alert('已经是最后一页了')">下一页</a>
                         </c:if>
                         <c:if test="${not pageInfo.isLastPage}">--%>
                        <a href="<%=request.getContextPath()%>/dishes?pageNum=${pageInfo.nextPage}">下一页</a>
                        <%--</c:if>--%>
                        <a href="<%=request.getContextPath()%>/dishes?pageNum=${pageInfo.pages}">尾页</a>
                    </div>

                </td>
            </tr>
        </table>

    </div>
</form>
<script type="text/javascript">

    //搜索
    function changesearch(){

    }

    //单个删除
    function del(){
        var msg = "您真的确定要删除吗？\n\n请确认！";
        if (confirm(msg)==true){

        }else{
            alert('取消删除');
            return false;
        }

    }

    //全选
    $("#checkall").click(function(){
        $("input[name='id[]']").each(function(){
            if (this.checked) {
                this.checked = false;
            }
            else {
                this.checked = true;
            }
        });
    })



</script>
</body>
</html>