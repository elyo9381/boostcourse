<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>register</title>
	<link rel = "stylesheet" href = "./css/newtodo.css">
</head>
<body>

<div class="wrap">
        <form action="todoAdd" method="POST" class="container">
            <h1 class="title">할일 등록</h1>
            <article class="newtodo-list">
                <p class="newtodo-list-title">어떤일인가요?</p>
                <input type="text" name="title" id="whattodo" placeholder="swift 공부하기(24자까지)" maxlength="24" required/>
            </article>
            <article class="newtodo-list">
                <p class="newtodo-list-title">누가 할일인가요?</p>
                <input type="text" name="name" id="who" placeholder="홍길동" required/>
            </article>
            <article class="newtodo-list">
                <p class="newtodo-list-title">우선순위를 선택하세요</p>
                <input type="radio" name="sequence" value="1" required>1순위
                <input type="radio" name="sequence" value="2" required>2순위
                <input type="radio" name="sequence" value="3" required>3순위
            </article>
            <article class="newtodo-list">
                <a href="/Todo/main" class="main" id ="foo">
                    <span class="prev">
                        &lt;이전 
                    </span> 
                </a>  
                <span class="submit-reset">
                    <input type="submit" value="제출" id="submit">
                    <input type="reset" value="내용지우기" id="reset">
                </span>
            </article>
        </form>
        
    </div>
</body>


</html>