<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.rxc.pojo.Course" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>

    <link href="${pageContext.request.contextPath}/css/teacher_index.css" rel="stylesheet"/>

    <title>教师教务管理系统</title>
</head>
<body>
<div class="PublicHead clearfix">
    <div class="leftBox clearfix">
        <div class="storeLogo">
        </div>

        <div class="storeText">
            教师教务管理系统
        </div>
    </div>
    <div class="RightBox clearfix">
        <div class="ManagerPhotoBox">
            <div class="ManagerPic">
            </div>
            <div class="ManagerName">
                欢迎您，教师<h5 style="display:inline;">${teacher.tname }</h5>
            </div>
        </div>
        <a href="${pageContext.request.contextPath}/logout">
            <div class="dropOutBox">
                <i class="">
                </i>
                <span>退出</span>
            </div>
        </a>
    </div>
</div>

<div class="PublicDownWhole clearfix">
    <!--左侧-->
    <div class="leftBox">
        <ul>
            <a href="${pageContext.request.contextPath}/teacherChooseCourse">
                <li class=""><i class=""></i><span>我要选课</span></li>
            </a>
            <a href="${pageContext.request.contextPath}/teacherSeeCourse">
                <li class="Select"><i class=""></i><span>我教的课</span></li>
            </a>
            <a href="${pageContext.request.contextPath}/teacherManageScore">
                <li class=""><i class=""></i><span>录入成绩</span></li>
            </a>
            <a href="#">
                <li class=""><i class=""></i><span>成绩统计</span></li>
            </a>
        </ul>
    </div>
    <!--右侧-->
    <div class="RightBox">
        <div class="PublicContentBox">
            <!--公用指向页面名字-->
            <div class="PublicPointToAgeText">
                <span class="span1">教务管理  </span> <span class="span2">教师教务管理列表</span>
            </div>


            <div class="InquireTableBox">
                <div class="headbox">
                    <div class="headboxtext">
                        <span class="span1">您所教授的课程如下</span>
                    </div>

                    <div class="PublicBtnIcon">

                        <span>&nbsp;</span>
                    </div>
                </div>

                <!--查询到的表格-->
                <div class="InquireSelectTable">
                    <table class="PublicTableCss">
                        <thead>
                        <tr>
                            <td>课程编号</td>
                            <td>课程名称</td>
                            <td>课程学时</td>
                            <td>操作</td>
                        </tr>

                        </thead>
                        <tbody>
                        <%
                            List<Course> courselist = (List<Course>) session.getAttribute("courseList");
                            if (courselist != null && !courselist.isEmpty()) {
                                for (Course course : courselist) {
                        %>
                        <tr>
                            <td><%= course.getCno() %>
                            </td>
                            <td><%= course.getCname() %>
                            </td>
                            <td><%= course.getChours() %>
                            </td>

                            <td>
                                <div class="PublicTableBtnIcon Color4Btn">
                                    <i class=""></i>
                                    <span><a href="teacherQuitCourse?course.cno=<%= course.getCno() %>"
                                             style="color:white">退选</a></span>
                                </div>
                            </td>
                        </tr>
                        <%
                            }
                        } else {
                        %>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td>

                                <div class="PublicTableBtnIcon Color4Btn">
                                    <i class=""></i>
                                    <span><a href="#" style="color:white">退课</a></span>
                                </div>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                        </tbody>
                    </table>

                </div>

            </div>
        </div>

    </div>
</div>
<% String message = (String) request.getAttribute("message");
    if (message != null) {
%>
<script type="text/javascript">
    alert("<%= message%>");
</script>
<%} %>
</body>
</html>