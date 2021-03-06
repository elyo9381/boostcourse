<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>
    <link rel="stylesheet" href="./css/main.css?after">
</head>
<body>

<div id = "wrap">
    <header id = "header">
        <section class = "header-nav"> 
            <h1 class = "nav-title">나의 해야할 일들</h1>
            <a href="todoForm" class = " newtodo">새로운 TODO 등록</a>
        </section>
    </header>

    <div id = "container">
        <div id = "content">
        
            <div class = "articles">
                <article class="lists" id="todo">
                    <div class="list title">
                        <h1 class="lists-title">TODO</h1>
                    </div>
                    
                 
                    <c:forEach var="todoDto" items="${requestScope.list}">
                        <c:if test="${todoDto.type == 'TODO'}">
                            <div class="list" id="list${todoDto.id}">
                                <h5 class="list-title">${todoDto.title}</h5>
                                <p class="list-content">등록날짜:${todoDto.regDate},
                                    ${todoDto.name}, 우선순위 ${todoDto.sequence}</p>
                                <input type="hidden" name="id" value="${todoDto.id}">
                                <input type="hidden" name="type" value="${todoDto.type}">
                                <input type="submit" class="change-type" value="→">
                            </div>
                        </c:if>
                    </c:forEach> 		
                </article>
                
                <article class="lists" id="doing">
                    <div class="list title">
                        <h1 class="lists-title">DOING</h1>
                    </div>
                    <c:forEach var="todoDto" items="${requestScope.list}">
                        <c:if test="${todoDto.type == 'DOING'}">
                            <div class="list">
                                <h5 class="list-title">${todoDto.title}</h5>
                                <p class="list-content">등록날짜:${todoDto.regDate},
                                        ${todoDto.name}, 우선순위 ${todoDto.sequence}</p>
                                <input type="hidden" name="id" value="${todoDto.id}">
                                <input type="hidden" name="type" value="${todoDto.type}">
                                <input type="submit" class="change-type" value="→">
                            </div>
                        </c:if>
                    </c:forEach>
                </article>
                <article class="lists" id="done">
                    <div class="list title">
                        <h1 class="lists-title">DONE</h1>
                    </div>
                    <c:forEach var="todoDto" items="${requestScope.list}">
                        <c:if test="${todoDto.type == 'DONE'}">
                            <div class="list">
                                <h5 class="list-title">${todoDto.title}</h5>
                                <p class="list-content">등록날짜:${todoDto.regDate},
                                        ${todoDto.name}, 우선순위 ${todoDto.sequence}</p>
                            </div>
                        </c:if>
                    </c:forEach>
                </article>
            </div>
        </div>
    </div>

    <div id = "footer">

    </div>
</div>

<script src="js/moving.js"></script>


</body>
</html>