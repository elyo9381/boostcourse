<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>register</title>
	<link rel = "stylesheet" href = "css/style.css">
</head>
<body>
<!-- 	
	<div id = "wrap">
		<div id = "container">
			<div id = "content">
			
				<section class = "todo-regi">
					<form action="todoregister" method = "POST" class = "todo-action">
						<h1 class = "action-title">할일 등록</h1>
						
						<article class= "whatwork">
							<p class ="whatwork-title"> 어떤일인가요? </p>
							  <input type="text" id="whatworkact" placeholder="swift 공부하기(24자까지)" maxlength="24" required/>
						</article>
						
						<article class= "whowork">
							<p class ="whowork-title"> 누가 할일인가요?  </p>
							  <input type="text" id="whoworkact" placeholder="홍길동" required/>
						</article>
						
						<article class= "priority">
							<p class ="priority-title"> 우선순위를 선택하세요 </p>
							<input type="radio" name="priority" value="1" required>1순위
                			<input type="radio" name="priority" value="2" required>2순위
                			<input type="radio" name="priority" value="3" required>3순위
						</article>
						
						<article class="btn">
			                <a href="/Todo/main" class="gotomain">
			                    <span class="prev">
			                        &lt;이전 
			                    </span> 
			                </a> 
			                <span class="submit-reset">
			                    <input type="submit" value="제출" id="submit">
			                    <input type="reset" value=
			                    "내용지우기" id="reset">
			                </span>
		          	    </article>						
		          	    
					</form>
				</section>
				
			</div>
		</div>
	</div>
</body> -->


<body id=register_wrap>

	<form action="todoAdd" method="post">
		<!-- 전체 페이지 div -->
		<div class="register_form">
			<div class="regis_header">할일 등록</div>
			<div class="regis_content">
			<article class = "register">
				<p>어떤일인가요?</p>
				<input type="text" name="title" placeholder="예시) 세탁소가기 (24자)"
					maxlength="24" size="48" required> <br>
				<p> 누가 할일인가요? </p>
				<input type="text" name="name" placeholder="홍길동" maxlength="8"
					size="16" required> <br>
				<p>우선순위를 선택하세요</p>
				<input type="radio" id="p1" name="sequence" value="1" required>
				<label for="p1">1순위</label> 
				<input type="radio" id="p2"	name="sequence" value="2"required> 
				<label for="p2">2순위</label> 
				<input type="radio" id="p3" name="sequence" value="3"required> 
				<label for="p3">3순위</label> 
				<br> <br>
				<button id="backbtn" type="button"> 이전</button>
				<button class="form_btn" type="submit">제출</button>
				<button class="form_btn" type="reset">내용지우기</button>
			</article>
			
			</div>
		</div>
	</form>
</body>


<script>
<!-- main화면으로 돌아가기 -->
var backbutton = document.getElementById("backbtn");
backbutton.addEventListener("click",function(){
	location.href="./main"
});
</script>


</html>