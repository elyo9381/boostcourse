## HTTP
* 장점 : 불특정 다수를 대상으로 하는 서비스에는 적합합니다. 클라이언트와 서버가 계속 연결된 형태가 아니기 떄문에 클라이언트와 서버간의 최대 연결수보다 훨씬 많은 요청과 응답을 처리할 수 있습니다.
* 단점 : 연결을 끊어버리기 떄문에, 클라이언트의 이전상황을 알 수 가 없습니다. 이러한 특징을 무상태(stateless)라고 말합니다. 이러한 특징 때문에 정보를 유지하기 위래서 cookie와 가ㅏㅌ은 기술이 등장하게 되었습니다.
	- URL : 인터넷 상의 자원의 위치, 특정 웹서버의 특정파일에 접근하기 위한 경로혹은 주소 
	-HTTPS는 HTTP 프로토콜에 SSL(Secure Socket Layer) 계층이 추가된 모드로 데이터 주고 받을 때 다른 이용자가 중간에 정보를 훔쳐보거나 듣거나 가로채서 정보를 알아내는 행위를 막는 데에 방지해주는 보안이 강화된 프로토콜이다.

## 프론트엔드(FE)
* 사용자엑 웹을 통해 다양한 resource를 제공한다. 또한 사용자의 요청(요구사항)에 반응해서 동작한다.
	-적절한 배치 일관적인 디자인을 제공해야한다.(가독성)


## WAS(미들웨어)
* servlet : 톰캣에 의해서 동작이 된다. 톰캣서버(was)에 url 요청을 보내고 그것을 서블릿 규칙에 의해서 웹 어플리케이션에 나타난다.
* WAS에 설치 되어 동작하는 어플리케이션. 자바웹 어플리케이션에는 HTML,CSS,이미지,자바로 작성되니 클래스(servlet,package, interface) 각종 설정 파일등이 포함된다.

* 자바 웹 어플리케이션 + ------- web-inf 폴더 +------ web.xml(배포기술자)
	- web-inf폴더 안에 lib폴더, jar파일, classes폴더 포함한다.

* 동적웹이고 요청을하고 서블릿 실행되고 응답코드를 만들어내고 응답코드를 제공하는것, 내가 응답하고 싶은 내용을 만들어주면 된다.

* was( 서블릿컨테이너 ) 는 servlet 호출규칙에 따라 서블릿(.class) 을 실행시킵니다.

* servlet 규칙에 따라 만들어진 class가 HttpServlet입니다.  즉 HttpServlet 는 서블릿 규칙에 따라 만들어진것입니다. 많은 호출규칙들이 HttpServlet 클래스에 있을것입니다. doGet, doPost 등이 서블릿 호출 규칙입니다. 그런데 HttpServlet을 상속하지 않으면 Servlet 규칙에 어긋나기 때문에 에러가 발생합니다. 


## CSS

* html안에다가 넣는 것이 인라인 방법이다. 
	인라인은 다른 속성보다 먼저 적응이 되는것이다. 

* internal 방식은 헤드안에 스타일을 넣는것이다. 별도의 css파일을 관리하지 않아도 된다는 점이고 별도의 요청을 브라우저가 하지 않아도 되는것이다.

* external 방식 링크를 통해서 (별도의 파일을 통해서) 가급적이면 이 방법으로 구현하는것이 가장 좋습니다. 현엽에서 여러개의 css파일로 분리하고 이를 합쳐서 서비스에서 사용하기도 합니다. 

- 우선순위 inline은 별도의 우선순위를 갖지만, internal과 external은 우선순위가 동등합니다. 따라서 겹치는 선언이 있을경우 나중에 선언된 속성이 반영됩니다.


* 상속의 개념 

  - 부모를 설정해주고 자식도 똑같다고 하자

  * css의 cascading
  - 동일한 선언일때는 나중에 선언된것이 적용이 된다. 
  - 구체적으로 표현이 된것에는 구체적으로 표현된것에 먼저된다. body > span 과  span이 존재한다면 body> span이 먼저 적용된다. 

  - id값에는 더 높은 점수를 준다. class보다 
  - id > class > element 순으로 우선순위가 적용된다. 같은 div태그라고 가정했을때


* css selector
  - span 태그





* element

- display(block, inline, inline-block)
- position(static, absolution,relative, fixed)
- float(left,right)
기본적으로 쌓이는 순서를 벗어나 둥떠있는 느낌으로 배치가 되는 특성


- block 위에서 아래로 쌓는 블럭(대두분이 디스플레이 블럭이다. )
- inline 오른쪽으로 흐르게 할수있는것

-position(좀 다르게 배치시키기)
- static(순서대로 배치)
- absolute(기준점에 따라 특별한 위치에 위치)

- relative(원래 자신이 위치해야 할 곳을 기준으로 이동합니다. )


* margin 
 - 엘리멘트와 본인간의 간격이다. 


## js


* 함수
```
function printName(firstname)
{
	return "name is " + firstname;
}

// 표현식 에러  -- undefined 반환한다. 
function printName(firstname){
	conlose.log("name is " + result);

	var result = inner();
	// 이너는 함수로 인식이 되고있지 않다.
	var inner = function()
	{
		return "inner value";
	}
}

// 정상 작동
function printName(firstname){
	conlose.log("name is " + result);

	var result = inner();
	// 이너의 함수인식
	function inner()
	{
		return "inner value";
	}
}
```

자바스크립트에선 파서가 쭉 한번 훝고 기억을 한다. 그래서 이너정보는 함수정보를 기억해서 
실행을 시킨것이다
이것을 표현식과 호이스팅이라고 한다. (호이스팅은 함수의 선언식과 표현식에서 다르게 작용한다.)

자바스크립트는 undefined를 반환한다. 아무것도 타입이 지정되지 않았다면


aruments 는 함수가 실행되면 지역변수가 자동생성된다. 
arguments의 타입은 객체타입이다.
배열의 형태로 하나씩 접근할수있지만 배열의 메서드는 사용할수없다.
```
function a(){
	console.log(arguments);
	for(var i = 0; i<argumets.length; i++)
		console.log(arguments[i]);
}
```

arrow function
	함수의 일반적인 선언과 표현식 {}를 사용한 방법을 
	arrow function 으로 대신할수있다.
```
function getName(name) {
   return "Kim " + name ;
}

//위 함수는 아래 arrow함수와 같다.
var getName = (name) => "Kim " + name;
```


* 함수의 호출 - call stack 

```
function printname(firstname)
{
	var myname = " jisu";
	return myname=","= firstname;
}

function run(firstname)
{
	var firstname = firtstname || "yoon";
	var result = printname(firstname);
	debbugger;
	console.log(result);
}

run("kim");
```



* window 객체

	- window.setTimeout()
	윈도우는 객체이고 메소드를 호출가능하다. window는 전영객체라서 생략가능하다.

	- setTimeout 활용
		인자로 함수를 받고 있으며, 보통 나중에 실행되는 함수를 콜백함수라고도 합니다.

	```
	function run() {
    setTimeout(function(){ 
        var msg = "hello codesquad";
        console.log(msg);
    }, 2000); // 2000 == 2초
    console.log("run function end");
	}

	console.log("start");
	run()
	console.log("end");
	```

	비동기 콜백이다. 이것은 call stack 에 쌓여있는 순서대로 실행된다 
	위의예제에서는 
	start
	runfuction end
	end
	다음에 setTimeout이 실행되어서 
	hello codesquad 라는 코드가 실행되는것이다. 


	- setInterval : 일정한 시간간격으로 작업을 수행하기 위해서 사용합니다.(주기적인 명령어 실행)
					clearInterval 함수를 사용하여 중지 할 수 있습니다.

	setInterval은 일정한 시간간격으로 작업을 수행하기 위해서 사용된다. 반복수행.

	setTimeout은 지정된 시간을 기다린 후 작업을 수행하고, 지정된 시간 사이에 작업시간이 추가된다. 1번수행


* DOM
	: 브라우저는  HTML코드를 DOM이라는 객체형태의 모델로 저장합니다.
	DOM Tree 는 결국 HTML element Tree이다.

	getElementById() : ID정보를 통해서 DOM객체의 아이디를 찾을수있다. 

	querySelector 를 사용하여서 알수있다. 
	css selector , html selector 등을 selector 문법 #, . , > 등



* Event

	브라우저에는 많은 이벤트가 있다. 
	브라우저가 변화할때마다 이벤트 정보를 알려준다. (클릭 , 스크롤, 키보드, 다양한 입력 정보등등)

	- 이벤트 등록 
	```
	var el  = document.getElementById("outside");
	el.addEventListener("click", function(){
		// do something...
	},  false);

	var el = document.getElementById("outside");
	el.addEventListener("click", function(evt){
	console.log(evt.target);
	console.log(evt.target.nodeName);
	console.log(evt.className);
	}, false);	
	```
	addEventListener함수의 두번째 인자는 함수다. 이 함수는 나중에 이벤트가 발생할때
	실행되는 함수로 이벤트 핸들러 또른 이벤트 리스너라고 합니다. 


* Ajax 
	: 웹에 데이터를 갱신할때 브라우저 새로고침없이 서버로부터 데이터를 
	  받는 것이 좋다는 생각에서 출발하였습니다.
	  매번 새로운 사이트를 업데이트하여 클라이언트가 랜더링 하지만 화면 리프레쉬 없이 
	  일부분만 갱신가능( 비동기적인 접근 )

	  cors(corss-Origin Resource sharing) 
	  	: 한 출저에서 실행중인 웹 애플리케이션이 다른 출처의 선택한 자원에 접근할수있는 권한을
		  부여하도록 브라우저에 알려주는 체제이다. 


# JSP

html이랑 비슷하게 생겼지만, jsp는 서블릿으로 바뀌어서 실행된다. 그래서 서블릿의 라이프사이클에서 동작한다. 

<% %>에서 동적인 작업이 진행되고
동적인 결과물을 반환 할때에는 <%= return > 으로 값을 페이지에다 반환할수있다. 


sum10.jsp가 실행될때 
.metadata 폴더에 sum10_jsp.java파일이 생성된다. 

해당파일의 _jspService() 메소드안을 살펴보면 jsp파일의 내용이 변환되어 들어가 있는것을 확인했다.
sum10.jsp는 서블릿 소스로 자동으로 컴파일되면서 실행되서 그결과가 브라우저에 보여진다.

브라우저가 요청한 jsp가 최초로 요청했을경우만 변환한다. 
1. jsp에 해당하는 서블릿 파일의 존재여부를 체크한다.
2. 존재한다면 서블릿파일이 실행되고 컴파일 되고 
3. 없다면 jsp엔진이 서블릿파일을 불러와서 컴파일하고 실행한다.


* jsp 스크립트 요소의 이해 

<%! %> 전역변수 선언 및 메소드 선언에 사용 
	jsp페이지내에서 필요한 멤버변수나 메소드가 필요할 때 선언함 

<% %> 프로그래밍 코드 기술에 사용
	주로 프로그래밍의 로직을 기술할 때 사용.

<%= 문장 %> 표현식
	jsp페이지에서 웹 브라우저에 출력할 부분을 표현 (즉 화면에 출력하기 위한것.)


jsp 파일에서 html , java 주석은 jsp에 사용하여 서블릿에 사용이 되지만 
jsp 주석은 서블릿으로 변환이 되지 않는다. 


* jsp 내장 객체

jsp의 대부분의 파일은 jspService 메소드안에 작성되어 서블릿이된다. 
request, response 등의 내장객체는 그냥 가져다가 사용하면 된다. 서블릿으로 변환될때 내장객체선언이 되어있기 때문이다. 

* redirect

	클라이언트에서 redirect01.jsp를 요청했고 
	서버에서는 redirect01.jsp를 응답했고 여기에 (응답코드:302, Location헤더값: redirect02.jsp) 추가해서 답을 넣은것이다. 

	클라이언트는 서버(was)의 리다이렉트요청을 받고 redirect02.jsp를 요청한다.
	서버는 redirect02.jsp 를 출력하고 

	url은 redirect02.jsp의 url을 출력하게 된다. 

	장점 : 클라이언트가 의도치 않은 url에 접속했을 때 우회할수있도록 도와줄수 있다.
		  서버의 의도에 맞게 클라이언트에게 편의를 제공할 수 있다. 
	단점 : get방식으로 데이터를 주고 받아서 보안에 취약하다.


* forward

	서버가 클라이언트에게 받은 요청을 servlet 1으로 받고 일정부분 요청받은 코드를 수행하고 결과를 request 객체에 저장한다. 그리고 일부를 servlet2에 넘겨주어 남은 코드를 수행한다. 그리고 응답은 servlet2가 준다.
	forward 할때 인자값으로 request,response를 인자값으로 넘겨준다. 

	request, response는 한번만 이루어진다. why 요청이 한번만 이루어지니깐
	
~~~

forward 는 다른 파일에서 다른 파일로 값넘겨주는 개념이다. request, response를 통해서 

//클라이언트에게 받은 요청을 Servlet1이 랜덤수 6개를 만들고
frontServlet.java

protected void serviec(HttpservletRequest request, HttpServletResponse response) throws ServletExcetion, IOExeption{

	int diceValue = (int)(Math.random() * 6) + 1;
	request.setAttribute("dice", diceValue);

	RequestDispatcher requestDispatcher = request.getRequestDispatcher("/next");
	requestDispatcher.forward(request,response);

}

서버의 nextServlet.java 에서 출력을 담당한다. 


protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException){
	response.setContentType("Text/html");
	PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");

			int dice = (Integer)request.getAttribute("dice");
			ou.println("dice : " + dice);

			for(int i = 0; i< dice; i++)
			{
				out.println("<br> hello");
			}		

		out.println("</body>");
		out.println("</html>");
}
~~~
RequestDispatcher 메소드를 통해서 값을 넘겨준다.

request.setAttribute("dice", diceValue); 를 통해서 데이터를 전달해주고 
request.getRequestDispatcher("/next");

request.getAttribute("dice"); 를 통해서 값을 전달 받는다. 

* Servlet과 jsp 연동

	jsp는 결과를 출력하기에 Servlet보다 유리하다. 
	Servlet은 프로그램 로직을 수행되기에 유리하다.

	forward를 통해서 논리는 Servlet으로 작성하고 jsp를 통해서 결과를 출력한다. 

	~~~
	//LogicServlet.java
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int v1 = (int)(Math.random() *100) +1;
		int v2 = (int)(Math.random() *100) +1;
		
		int ret = v1 + v2;
		
		request.setAttribute("ret", ret);
		request.setAttribute("v1", v1);
		request.setAttribute("v2", v2);
		
		RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
		rd.forward(request, response);
		
	}

	//result.jsp

	<%
	int v1 = (int)request.getAttribute("v1");
	int v2 = (int)request.getAttribute("v2");
	int ret = (int)request.getAttribute("ret");
		
	%>

	<%=v1 %> + <%=v2 %> = <%=ret %>

	~~~

	로직을 servlet으로 작성하고 jsp를 통해서 출력할때 forward를 통해서 작성한다. 
	하지만 jsp에서 request.getAttribute("value")를 사용하면 매우 코드 및 가독성이 불편하다.
	이렇기 때문에 el문법을 사용하여 간편하게 할수있고 
	jsp는 간편하게 하는것이 짱이다.


* scope : 객체들의 범위가 어디서 어떻게 되느냐

- Page : servlet or jsp 내에서만 사용할수있는 범위
  - pageContext라는 내장객체로 사용가능하다.
  - forward가 될때 page scope에 지정된 변수는 사용할 수 없다.

- request : 하나의 요청이 들어와서 나갈때 까지( ex] servlet1,servlet2가 forward 하면서 request 계속 사용되는것 )
  - http요청을 WAS가 받아서 웹브라우저에게 응답할 때까지 변수값을 유지하고자 할경우 사용한다.
  - httpServletRequest 객체를 사용한다.
  - 저장할 때는 request.setAttribute() 를 사용한다. 
  - 값을 읽어들일 때는 request.getAttribute() 를 사용한다. 
  - RequestDispatcher 타입사용

- Session : 세션객체가 생성되서 소멸될때까지
  - 웹 브라우저 별로 변수를 관리하고자 할 경우 사용한다.
  - 상태정보를 유지하기 위해서 사용한다.
  - 클라이언트마다 각각 관리 해주는 객체이다.
  - 웹 브라우저간의 탭간에는 세션정보가 공유되기 때문에,각가의 탭에서는 같은 세션정보를 사용할수 있다.
  - HttpSession인터페이스를 구현한 객체를 사용한다. 
  - 서블릿에서는 HttpServletRequest의 getSession() 메소드를 이용한다.
  - 각 클리어언트마다 정보를 유지할 때 session정보를 유지해야한다.

- application : 어플리케이션이 생성되어 소멸될때 까지
  - 서버에는 웹 어플리케이션이 여러개 있을수있습니다. 웹어플리케이션은 뭘까요? ex)firstwep 같은것을 웹어플리케이션이라고 말할수있습니다. 
  - 클라이언트가 공통으로 사용해야할 값들이 있을 때 사용한다. 
  - SwrvletContext인터페이스를 구현한 객체를 사용한다. 
  - 웹 어플리케이션 하나당 하나의 application객체가 사용된다.
    - 어플리케이션 스코프에 list객체가 계속 저장되지만, 삭제는 되지 않을때 발생하는 문제는 메모리양이 많아져 속도가 느려지거나 멈출수도 있습니다.



* jsp 표현언어 : EL

	표현언어는 값을 표현하는데 사용되는 스크립트 언어로서 jsp의 기본문법을 보완하는역할을 한다.
	
	표현 언어가 제공하는 기능
	```
	- jsp의 스코프에 맞는 속성 사용
	- 집합 객체에 대한 접근 방법 제공
	- 수치연산, 관계 연산, 논리 연산자 제공
	- 자바 클래스 메소드 호출기능 제공
	- 표현언어만의 기본 객체 제공
	```

	* 표현언어의 표현방법
		${expr }

	* 개체 접근 규칙
		${<표현1>,<표현2>}	f
		
		표현 1이나 표현 2가 null 이면 null 을 반환한다.
		표현1이 map일 경우 표현2를 key로한 값을 반환한다.
		표현1이 lst나 배열이면 표현2가 정수일 경우 해당 정수번째 index에해당하는 값을 반환한다.
		만약 전수가 아닐경우에는 오류가 발생한다.
		표현1이 객체일 경우는 표현2에 해당하는 getter메소드에 해당하는 메소드들 호출한 결과를 반환한다. 


	* 비교 연산자 
		== , eq
		!= , neq
		문자열 비교 : ${str == '값'} str.compareTo("값") == 0 과 동일
		일반적인 방법하고 같다 

* JSTL : jsp 페이지에서 조건문 처리, 반복문 처리 등을 html tag 형태로 작성할 수 있게 도와줍니다.
	유지보수를 유용하게 하기 위해서 

	//예제 if or if/else 
	~~~
	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
	<%
	request.setAttribute("n", 10);
	%>

	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
	<c:if test="${n == 0}">
	n은 과 0과 같습니다.
	</c:if>

	<c:if test="${n == 10}">
	n은 과 10과 같습니다.
	</c:if>
	</body>
	</html>
	~~~

	jstl에서 if문처럼 사용할수있는것 
	when 이 if와 if else 같은 느낌이다. 
	```
	<c:choose>
		<c:when test = "%{score >= 90}">
			A학점입니다. 
		</when>
		<c:otherwise>
		F학점입니다.
		</otherwise>
	</choose>
	```

	흐름제어 태그 forEach

	<c:forEach var = "변수" items = "아이템" [begin = "시작번호"][end = "끝번호"]>
	```
	<% List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("!!!!");

		request.setAttribute("list",list);
	%>
	....

	<c:forEach item = "${list}" var = "item" [begin = "1"]></c:forEach>
	```


	흐름제어 태그 import : 특정한 url에 연결하여 결과를 지정한 변수에 저장한다.  
	```
	<c:import url = "" var = "urlvalue" scope = "request/>
	...
	<body>
	${urlvalue };

	```

	흐름제어 태그 redirect : 지정한 페이지로 리다이렉트한다.

	~~~
	<c:redirect url = "http://local ~~~ .jsp"/>
	~~~

	흐름제어 태그 out : jspWriter에 데이터를 출력한다.
	
	<c:out value = "value" escapeXml="{true|false}" default = "defaultValue"/>

	```
	<c:set var = "t" value = " <script type = 'text/javascript'> alert(1); </script> "/>

 	<c:out value = " value" escapeXml = "true"/> //이렇게 하면 js실행이 아닌 text로 웹상에 표현된다.

	```

* mysql
	mac 에서 mysql

	실행
	mysql.server start
	종료
	mysql.server stop

	mac에서 mysql 데몬실행
	brew services start mysql
	데몬종료
	brew services stop mysql


	- SQL : Structured Query Language 
		데이터를 보다 쉽게 검색하고 추가,삭제,수정같은 조작을 할수있는 컴퓨터 언어
		관계형데이터베이스에서 데이터를 조작하고 쿼리하는 표준수단이다.

		DML, DDL, DCL 으로 구성되어 있다.

		DML : 데이터를 조작하기 위해 사용한다. 
		DDL : 데이터베이스의 스키마를 정의 하거나 조작한다.
		DCL : 데이터를 제어하는 언어이다. 

	
	데이터베이스 생성하기
	create database connectdb;

	db사용자 생성과 권한주기
	grant all privileges on db이름.

	// 8/0 이상부터 한번에 권한 부여가 안되니 생성 > 권한설정 해준다. 
	// db이름 뒤의 * 는 모든 권한을 의미한다.
	//@’%’는 어떤 클라이언트에서든 접근 가능하다는 의미이고, @’localhost’는 해당 컴퓨터에서만 접근 가능하다는 의미입니다.
	//flush privileges는 DBMS에게 적용을 하라는 의미입니다.	

	create user 'connectuser'@'%' indentified by 'connect123!@#';
	GRANT ALL PRIVILEGES ON connectdb.* to 'connectuser'@'%';

	// 로그인하는방법
	mysql -h127.0.0.1 -uconnectuser -p connectdb;

	// .sql 파일을 sql 시스템에 넣기 (import)
	mysql -uconnectuser -p < examples.sql 

	//	테이블 잘있나 확인하기 
	show tables; 
	desc bonus; << 명령어를 입력하게 되면 테이블의 타입 변수 상세내용을 알수잇음;

	// select 구문의 기본 문형
	select(distict) 칼럼명(aias)
	from 테이블명
	where  조건식
	order by 칼럼혹은 표현식 (asc || desc);

	```
	select 검색하고자 하는 데이터를 나열한다.
	distinct 중복행을 제거 
	alias 나타날 컬럼에 대한 다른이름 부여
	from 선택한 컬럼이 있는 데이블을 명시한다.


	select empno, name, job from employee order by name desc;
	select distinct deptno from employee;
	SELECT concat( empno, '-', deptno) AS '사번-부서번호' FROM employee;
	select empno as 사번, name as 이름, job as 직업 from employee;


	select * from employee where deptno in (10,30);
	select * from employee where deptno = 10 or 30;


	// %는 0에서부터 여러개의 문자열을 나타냄
	// _는 단 하나의 문자를 나타내는 와일드 카드 
	select * from employee where name like '_A%';
	select * from employee where name like 'A%';

	// 함수 대문자(ucase, upper) 소문자(lower, ) substring('happ',3,2)
	// LPAD, RPAD 공백에 문자를 채워줘요
	// LTRIM,RTRIM,TRIM 공백 지워줘요 
	// abs(), mod()
	select LPAD(name,10,'+') from employee;

	
	// cast 형변환
	// binary , char, date, datetime, signed, time, unsigned
	CAST(expression AS type)
	CONVERT(expression, type)

	// 그룹함수 및 그룹바이 


	//데이터 입력
	insert into tablename(field, field2) value2(field1 value, field2 value);

	//데이터 수정
	// 조건식을 주지 않으면 전체 로우에 영향을 미치니 조심하자
	update 테이블명 set field1 = field1의 value, ~~  where 조건식

	// 데이터 삭제
	delete from tablename where if~~~ ; 

	// 테이블 생성
	create table 테이블명 (
		필드명 1 타입 [null|not null][default][auto_increament],~~
		~~~

		primary key(필드명)
	);

	// 테이블 ,삭제
	alter table 테이블명 
		add 필드명 타입 [null | not null][~]
		chang 필드명 ~~ 

	alter table 테이블명 drop 필드명;

	// 테이블 네임 변경
	alter table 테이블명 rename	변경이름;
	```

	[ euc-kr ] ascii 코드 + 한글 
	영문/숫자/기호는 1바이트. 한글과 한자는 2바이트 

	[ utf-8 ] 
	영문/숫자/기호는 1바이트로, 한글과 한자 등은 3바이트로 표현 

* Maven

	메이븐은 지금까지 애플리케이션을 개발하기 위해 반복적으로 진행해왔던 작업들을 지원하기 위하여 등장한 도구입니다.
	project : pom.xml 파일의 최상위 루트 엘리먼트(Root Element)입니다.
	modelVersion : POM model의 버전입니다. 
	groupId : 프로젝트를 생성하는 조직의 고유 아이디를 결정합니다. 일반적으로 도메인 이름을 거꾸로 적습니다.
	artifactId : 해당 프로젝트에 의하여 생성되는 artifact의 고유 아이디를 결정합니다. Maven을 이용하여  pom.xml을 빌드할 경우 다음과 같은 규칙으로 artifact가 생성됩니다. artifactid-version.packaging. 위 예의 경우 빌드할 경우 examples-1.0-SNAPSHOT.jar 파일이 생성됩니다.
	packaging : 해당 프로젝트를 어떤 형태로 packaging 할 것인지 결정합니다. jar, war, ear 등이 해당됩니다.
	version : 프로젝트의 현재 버전. 추후 살펴보겠지만 프로젝트가 개발 중일 때는 SNAPSHOT을 접미사로 사용합니다. Maven의 버전 관리 기능은 라이브러리 관리를 편하게 합니다.
	name : 프로젝트의 이름입니다.
	url : 프로젝트 사이트가 있다면 사이트 URL을 등록하는 것이 가능합니다.
	Maven 을 이용할 경우 얻게 되는 큰 이점 중의 하나는 Dependency Management 기능입니다.

	위 pom.xml 파일에서 <dependencies/> 엘리먼트가 Dependency Management 기능의 핵심이라고 할 수 있습니다.

	해당 엘리먼트 안에 필요한 라이브러리를 지정하게 됩니다.

	test... 


# javascript

	forEach() : 함수를 동작하는 함수 (증감식이 없이 배열의 내부를 돌며 수행한다.)
	map() : 배열의 원소를 돌면서, 값을 변경시킨 후 새로운 배열로 만들어서 반환한다. - 원래값을 바꾸지 않음.
	filter() : 주어진 함수의 테스트를 통과하는 모든 요소를 모아 새로운 배열로 반환합나다.
	reduce() : 주어진 콜백 함수를 가산기와 요소 각각에 대해 왼쪽에서 오른쪽으로 호출하여 하나의 값으로 줄인(reduce) 결과를 반환합니다.

	~~~
	//배열은 푸시 메소드를 통해서 앞에 입력을 할수있다.
	var a = [4];

	a.push(5);

	[1,2,3,4].indexof(3) // 배열의 원소에 특정 갑이 들어있는지 확일할 수 있다. 

	[1,2,3,4].join(); // "1,2,3,4" 배열을 문자열로 합칠 수 있다. 

	[1,2,3,4].concat(2,3); // 배열을 합칠 수 있다. 

	var a = [4];
	a[1000] = 3;

	console.log(a.length);
	console.log(a[500]);


	var origin = [1,2,3,4];
	var result = origin.concat(2,3);

	console.log(origin, result); // 새로운 배열을 반환할수도 있다. 

	var mapped = result.map(function(v){
		return v*2; // result array의 원소를 돌면서, 값을 변경시킨후 새로운 배열로 만들어서 반환한다.
	});
	console.log(mapped, result); // 맵은 기존에 배열을 받아서 새로운 배열을 리턴받을수잇다.

	var newArr = ["apple","tomato"].map(function(value,index){
		return index + "번째 과일은 " + value +"입니다.";
	});

	console.log(newArr);

	//필터를 이용해서 배열 내의 word의 길이가 특정조건 이상인 배열 리턴
	const words = ['spray', 'limit', 'elite', 'exuberant', 'destruction','present'];
	const result1 = words.filter(word => word.length>6);
	console.log(result1);
		
	// filter를 이용한 배열 내용을 조건에 따라 검색
	function filterItem(query){
		return words.filter(function(el){
			// query의 소문자변환 후 word 중에 query를 찾아 인덱스를 반환하는 ! 
			return el.toLowerCase().indexOf(query.toLowerCase()) > -1;
		})
	}
	console.log(filterItem('e'));
	
	// 10이하인 모든 요소가 제거된 배열 만들기 위해서 filter()사용
	function isBigEnough(value)
	{
		return value >= 10;
	}

	var filted = [12,5,7,190,44].filter(isBigEnoigh);


	// reduce(reducer)

	const array1 = [1,2,3,4];
	const reducer = (accumulator,currnetValue) => accumulator + currentValue;


	console.log(array1,reduce(reducer));

	console.log(array1,reduce(reducer,5)); // 두번째 인자는 초기값을 제공하는것이다. 

	~~~


  * 자바스크립트 객체!

	var obj = {name : "crong", age : 20}
	형태로 구성되어있다. 이를 기반으로 json을 구성하였다. 


	~~~
	var myFriend = {key : "value"};

	// console.log(myFriend.key);
	console.log(myFriend["key"]);

	var myFriendArr = { key : "value" , addition : [
		{name: 'codesquad'}, {age:2}
	]};
	// 객체안에 객체를 담을수도 있다.
	console.log(myFriendArr.addition[0].name);

	// for in 문은 객체의 키에대한 벨류를 찾기위한 값이다.  객체 탐색! 
	for(key in myFriend){
    console.log(myFriend[key]);
	}
	~~~


 * DOM elementobject

	- childNodes
	- firstChlid
	- firstElementChild
	- parentElement
	- nextSibling
	- nextElementSibling


	- removeChild
	- appendChild
	- insertBefore
	- cloneNode
	- replaceChild
	- closet

	- innerText
	- innerHTML
	- insertAdjacentHTML()


	```


	// innerHTML example
	var copyListButton = document.getElementById("copyListButton");

	copyListButton.addEventListener("click", function() {
	var ul = document.querySelector("ul");
	var liNode = document.createElement("LI");
	var list1Html = document.getElementById("list1").innerHTML;
	
	ul.innerHTML = " ";
	ul.appendChild(liNode);
	
	var li = document.querySelector("li");
	li.innerHTML = list1Html;
	});
	

	// insertadjacentHTML // 지정한 위치에 html 삽입

	var addListButton = document.getElementById("addListButton);
	addListButton.addEventListener("click",function(){
		var list3 = document.getElementById("list3");

		list3.insertAdjacentHTML("afterend",<li>4. 웹어플리케이션 개발 2/4</li>");
	});


	```

	DOM API 실습
	~~~
	var appendChildButtion = document.getElementById("appendChildButton");

	appendChildButton.addEventListener("click",function(){
	var ul = document.querySelector("ul");

	
	var liNode = document.createElement("LI");
	var text = document.createTextNode("tangerine");
	
	liNode.appendChild(text);
	ul.appendChild(liNode);
	

	
	});


	var removeChildButton = document.getElementById("removeChildButton");
	removeChildButton.addEventListener("click",function(){
	//   var ul = document.querySelector("ul");
	//   var ulLastChild = ul.lastElementChild;
	// //   console.log(ulLastChild.nodeName);
	//   ul.removeChild(ulLastChild);
	var reds = document.querySelectorAll("li.red");
		var ul  = document.querySelector("ul");
		for(var i = 0; i<reds.length; i++)
		{
			console.log(reds[i]);
			ul.removeChild(reds[i]);
		}

	
	
	});
	

	var insertbtn = document.getElementById("insertbtn");

	insertbtn.addEventListener("click",function(){
	var ul = document.querySelector("ul");
	
	var newNode = document.createElement("LI");
	var text = document.createTextNode("tangerine");
	newNode.appendChild(text);
	

	var oldNode = document.querySelector("li:nth-child(3)");
	
	ul.insertBefore(newNode,oldNode);
	});


	// var insertbtn = document.getElementById("insertbtn");

	// insertbtn.addEventListener("click",function(){
	//   var banana =  document.querySelector("li:nth-child(2)");
	
	//  banana.insertAdjacentHTML("afterend","<li>tagerine</il>");
	
	// })

	var movebtn = document.getElementById("movebtn");

	movebtn.addEventListener("click",function(){
	var ul = document.querySelector("ul");
	
	var firstNode = ul.firstElementChild;
	var ulLastChild = ul.lastElementChild;
	
	ul.insertBefore(firstNode,ulLastChild); // insertbefore는 노드를 이동시킨다. 말그대로 삽입한다 파라미터2전에 
	});

	var blueNode = document.querySelectorAll("section .blue");

	// DOM API 에서 특정 tag를 찾고 상위부모를 찾아 
	// 형제및 부모를 삭제하는방법
	for(var i = 0; i<blueNode.length; i++)
	{
		var sect = blueNode[i].closest("section");
		console.log(sect);
		
		var h2 = sect.querySelector("h2");
		console.log(h2);
		
		sect.removeChild(h2);
	}

	~~~

* ajax 기술

	새로고침이 일어나지 않고 서버측에 별도의 요청의 해서 별도의 화면에 보여주는것이고
	
	화면이 그려지지만 ajax가 요청되면 우선 화면이 뿌려지고 나중에 js엔진이 진행된다.
	그리고 마지막에 랜더링이 진행된다. 

	oRep.add~~ 익명함수
	oRep.open()~~
	oRep.send()~~ 

	* 익명함수는 오픈과 센드보다 더 늦게 실행되는 함수입니다.익명함수는 비동기로 실행되며, 이벤트큐에 보관되다가 load이벤트가발생하면 그때 call stack에 실행되고 있는 함수가 없어서 비어있다면 stack에 올라와서 실행됩니다.


	* 동기 
    	* 


	* 비동기 


	* ajax 응답처리
		
		서버로부터 받아온 json데이터는 문자열 형태임으로 브라우저에서 바로 실행할 수가 없습니다.
		따라서 문자열을 자바스크립트객체로 변환해야 데이터에 접근할 수가 있다. 이를 하려면 문자열 파싱을 일일히 해야 하는 불편함이 있습니다.

	~~~

	// 아래의 예제에서 비동기적이라면 이벤트가 나중에 실행된다. 우선 스택에 쌓고 다음 단계를 스택에 쌓는다.
	// 먼저 오픈과 센드를 통해서 서버와 통신을 하여 콜스택에 쌓여있던 스택을 처리하고 나중에 이벤트를 처리한다. 
	// 이런방법으로 비동기적으로 서버와 데이터를 주고 받을 수 있게 된다. 

	var oReq = new XMLHttpRequest();

	oReq.addEventListener("load", function() {
		var jsonobj = JSON.parse(this.reponseText);
		var fruit = jsonobj.favorites[1];
		var outside = document.querySelector(".outside");
		outside.innerHTML += "<span> " + fruit + "<span>".
	});

	oReq.open("GET", "./json.txt");
	oReq.send();

	~~~

	* 크로스 도메인
		A도메인에서 B도메인으로 XHR통신 , AJAX통신을 할수 없습니다. 

	
* 크롬 개발자 도구 네트워크 패널
	
	얼마나 서버로부터 응답이 걸리는지도 알수 있다. 
	성능개선을 위해서 진단할 수 있는 도구이다. 

	http통신과정에서 생기는 문제는 여기서 대부분 실마리를 찾을수 있을것이다. 

	* 캡처스크린샷 
		웹사이트를 다시로딩해서 결과를 확인하고 시간대별로 화면을 볼수 있는 기능이다. 시간대별 작동현황을 볼수있다.


# animation (css, js)

* animation 
	애니메이셔은 반복적인 움직임의 처리입니다.
	웹UI 애니메이션은 자바스크립트로 다양하게 제어할수있지만, 규치적이고 비교적 단순한 방식으로 동작되는 방식은 CSS3의 transition 과 transform 속성을 사용해서 대부분 구현가능합니다.
	뿐만 아니라 자바스크립트보다 더 빠른 성능을 보장한다고 합니다. 이런 애니메이션 성능비교가 된글을 찾아보고 비교해봅니다.
	특히 모바일웹에서는 css를 사용한 방법이 훨씬 더 빠릅니다. 
  
    * FPS
	FPS는 1초에 화면에 표혆ㄹ 수 있는 정지화면 수 입니다. 

	앞서 말한 것처럼 애니메이션은 css의 transition 속성으로 css속성을 변경하거나, javascript로 css속성을 변경할 수 있습니다.

	간단하고 규칙적인거 css
	세밀하고 조작이 필요한거 javaScript

	성능만 봐서는 대체로 css로 변경하는 거싱 빠릅니다. 하지만 성능비교를 통해서 가장빠른 방법을 찾는과정이 필요하기도 합니다.

	* setInterval() : 주기적으로 무엇을 실행하는코드.
		
		~~~ 
		// arrow function -> () =>
		const interval =  window.setInterval(() => {
			console.log('현재시각은', new Date());
		},1000/60);

		//1000/60 = 약 16m/s
		~~~
		
		문제는 interval로 실행되는것이 도중에 event가 오게 되면 실행이 밀린다. 

	* setTimeout() : 지정된 시간후에 실행되는 코드

		~~~
		// 재귀를 통해서 animation()을 계속 호출하기 때문에 interval 같이 밀림 현상은 발생하지 않지만 최적화 되어있는것은 아니다. 
		let count = 0;
		function animation(){
			setTimeout(()=> {
				if(count >= 20) return;
				console.log('현재시간은', new Date());
				count++;
				animation();
				
			},500);
		}
		animation();
		~~~

		문제는 animation주기를 16.6미만으로 하는경우 불필요한 frame 생성이 되는들의 문제가 생깁니다. 

	* requestAnimaionFrame
		
		~~~
		// 30번 순회 할것이고 basecondition을 설정하였다. 그리고 인라인으로 left를 0으로 초기화하며 호출을 할떄마다 left를 계속 움직이게 된다. 

		var count = 0;
		var el = document.querySelector(".outside");		
		el.style.left = 0;

		function run()
		{
			if(count > 30) return;
			count +=1;
			// 숫자와 문자열이 합쳐지면 문자열이 된다. 
			el.style.left = parsInt(el.style.left) + count + "px";
			requestAnimationFrame(run);
		}

		requestAnimationFrame(run);

		~~~

	* CSS animation
		
		transition을 이용하는 방법

		~~~
		html & css file
		body style .outside{
			position : relative;
			background-color: blueviolet;
			width: 100px;
			font-size : 0.8em;
			color :#fff;
			left: 100px;
			top: 100px;
			transform: scale(1);
			transition: transform 2s;
		}

		js 파일 (명령)
		var base = document.querySelector(".outside");
		base.style.transform = "scale(4)";
		base.style.left = "500px";

		// 버튼추가하여 animation주기
		var rightbtn = rightbtn.document.querySelector("button");
		
		rightbtn.addEvnetListener("click",function(){
			var pre = parseint(target,style.left);
			target.style.left =pre + 10 + "px";
		});
		~~~

# intellij

	인텔리j는 안드로이드 스튜디오와 같은 ui로 구성되어있고 이클립스처럼 여러프로젝트가 처음에 띄어지지 않는다.
	처음에 안스처럼 하나의 프로젝트만 띄어지고 ij(intellij)는 gradle이 존재한다. 

	ij의 장점은 이친구는 자동완성 기능이 존재한다. 
	
	maven, tomcat, jdk 연동을 해보았으며 jsp, Servlet을 실행해보았다. 
	maven file을 export하여 tomcat manager를 통하여 import하는 작업까지 작동시켜서 maven파일을 배치 하여보았다. 
	


## TDD
	
	1+2 = 3을 만들어서 적용하는 코드가 있다고 할때 
	1. Red : 실패하는단계 
	2. Green : 통과를 시키는 단계
	3. ReFactoring : 코드가 깔끔해지고 제약조건이나 상황에대해서 유연하게 대처하는 코드 ==> clean code


## Framework

	시중에 유통되어 있는 반제품의 상품이다. ( 처음부터 다 만들 필요가 없다. )
	
	엔터프라이즈 급 어플리케이션을 구축할수 있는 가벼운 솔루션이자 (원스탑 숍)

	원하는 부분만 가져다 사용할 수 있도록 모듈화가 잘되어 있다.

	IoC 컨테이너이다. 

	선언적으로 트랜잭션을 관리할 수 있다.

	완전 한 기응을 갖춘 MVC Framework를 제공한다.

	AOP지원
	
	스프링 도메인 논리 코드와 쉽게 분리될 수 있는 구조를 가지고 있다. 



	* container
		- 인스턴스의 생명주기를 관리한다.
		- 생선된 인스턴스들에게 추가적인 기능을 제공한다.
		
		서블릿, jsp등을 톰캣의 was가 메모리에 올리고 같은 요청이 올라오면 실행하는것이 컨테이너이다. 

	* IoC : inversion od control
		- 개발자는 프로그램의 흐름을 제어하는 코드를 작성한다. 그런데, 이 흐름의 제어를 개발자가 하는것이 아니라 다른프로그램이 흐름을 제어하는 것을 IoC라고 말한다. 

		인터페이스를 규격화 하는것을 말한다. 
		
		ex) Tv v = new.~~~;
		
		좋은거 알겠는데 공장을 만드는것은 매우 귀찮은일이다. 이런것들을 스프링이 해줍니다. 

	* DI : dependenvy Injection (의존성 주입이란 뜻 )
		IoC에서 제공하는 기능을 연결해주는 역할을 한다. 

	* BeanFactory : Ioc/DI 에 대한 기본 기능을 가지고 있다.
  
	* applicationContext : BeanFactory의 기능을 포함하며 다른기능도 내포하고 있다. 

		```
			ApplicationContext ac = new ClassPathXmlApplicationContext( 
					"classpath:applicationContext.xml"); 
			System.out.println("초기화 완료.");
			
			UserBean userBean = (UserBean) ac.getBean("UserBean");
			userBean.setName("kim");
			System.out.println(userBean.getName());
			
			UserBean userBean2 = (UserBean)ac.getBean("UserBean");
			if(userBean == userBean2) {
				System.out.println("같은 인스턴스이다.");
			}
		```
		applicationContext.xml은 객체공장을 만드는(즉 DI)를 만드는 기능을합니다.
		이것을 싱글톤으로 객체를 만들어주는것을 ioc제어의 역전이라고 합니다.

		객체에게 객체를 주입하는 것을 DI라고 합니다. 
		DI의 장점은 Car클래스만 등장하고 engine클래스는 실행되는 클래스에서 등장하지 않는다. 


		* 나의정리 

			DI (ioc제어) 는  객체에게 객체를 주입하는 것이다. ApplicationContext.xml을 통해서 Bean element를 설정한다.

			xml을통해서 DI / ioc제어를 할수있으며 이것들은 의존성관계주입 이란 명칭을 갖는다. 

			xml을 통한 방법은 application.xml을 만들고 객체가 될 클래스들을 만들어서 메소드를 주기적으로 참조 시켜줘야한다. 
			```
			ApplicationContext ac = new ClassPathXmlApplicationContext( 
					"classpath:applicationContext.xml"); 
			System.out.println("초기화 완료.");
			
			UserBean userBean = (UserBean) ac.getBean("UserBean");
			userBean.setName("kim");
			System.out.println(userBean.getName());
			
			UserBean userBean2 = (UserBean)ac.getBean("UserBean");
			if(userBean == userBean2) {
			System.out.println("같은 인스턴스이다.");

			// 위와같은 방법혹은 아래와 같은 방법

			ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			Car car =(Car) ac.getBean("Car");
			car.run();
					
			```
			위의두 코드의 차이점은 applicationContext.xml에서 id값을 통해서 접근하냐 혹은 다양한 element를 통해서 접근하냐 이다. 

			그리고 현재 많이 사용되는 방법으로는 어노테이션 방법이 있다. 
			사용될 객체들의 위쪽에 conponent, Autowired, configuration, bean등을 이용하여 클래스위에 별도로 설정하고 applicationConfig파일에서 Bean파일들을 실행하는 방법이다. 이것은 applicationContext.xml파일이 필요치 않다.

				- Configuration : 스프링 설정 클래스를 선언하는 어노테이션
				- Bean : bean을 설정하는 어노테이션
				- Component : 컨트롤러,서비스,레포지터리,컴포넌트, 등 어노테이션이 붙은 클래슬 ㄹ찾아 컨테이너 등록
				- component : 컴포넌트 스캔의 대상이 되는 어노테이션 중 하나로써 주로 유틸, 기타, 지원 클래스에 붙이는 어노테이션
				- Autowired : 주입대상이되는 bean을 컨테이너에 찾아 주입하는 어노테이션


			1 . 다루는 빈이 많아질수록 xml로 설정하는것과 component,componentScan,Autowired를 이용하는것중 어떤것이 유지보수에 좋을것 같습니까?
			2 . @Autowired는 field, constructor,setterMethod에 사용할 수 있습니다. 각각의 방식에 장단점에 대해서 더 생각해보자 
			
			1 번은 후자가 유지보수에 좋을것같다 그러한 이유는 많은 메소드관리에 유익하기 때문에 
			2 번은 같은 기능을하는것들은 Autowired가 장점이 될수있으나. 모든것이 이렇게 된다면 메소드 끼리 충돌이 발생하여 에러가 날것같다. 
			

##  spring jdbc

	* dto , dao
		dto : 계층간 데이터 교환을 위한 자바빈즈이다. 
			  여기서 계층이란 컨트롤러 뷰 , 비지니스 계층 , 퍼시스턴스 계층을 의미한다. 
			  일반적으로 dto는 로직을 가지고 있지 않고, 순수한 데이터 객체이다. 

			  dto는 게터세터를 가지고 toString, equals, hashcode등의 메소드를 오버라이딩 할 수있다.

		dao : DAO는 데이터를 조회하거나 조작하는 기능을 전담하도록 만든 객체이다. 
			  보통 데이터베이스를 조작하는 기능을 전담하는 목적을 가진다. 

		

	* spring jdbc 접속 과정
		
		 DataSourceTest.java >> ApplicationConfig >> DBConfig.class 

		데이터소스테스트자바의 메소드를 통해서 DI의 applicationConfig의를 참조한다 이떄 import annotation을 통해서 DBConfig.class를 임포트한다. 데이터소스테스트자바 객체에서 DBConfig.class객체를 불러와 디비 접속을 한다. 

		```
		// ApplicationConfig
		@Configuration
		@Import({DBConfig.class})
		public class ApplicationConfig {

		}

		// DBConfig.class
		@Configuration
		@EnableTransactionManagement
		public class DBConfig {
			
			private String driverClassName = "com.mysql.cj.jdbc.Driver";
			private String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
			
			private String dbuser = "connectuser";
			private String dbpasswd = "connect123!@#";
			
			@Bean
			public DataSource dataSource() {
				BasicDataSource dataSource = new BasicDataSource();
				dataSource.setDriverClassName(driverClassName);
				dataSource.setUrl(dburl);
				dataSource.setUsername(dbuser);
				dataSource.setPassword(dbpasswd);
				return dataSource;
			}
		}

		// DataSource

		public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		DataSource ds = ac.getBean(DataSource.class);
		Connection conn = null;
		try {
			conn = ds.getConnection();
			if(conn != null)
				System.out.println("접속 성공^^");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		```

	* select 과정 
		연결및 인증 과정 + 에다가 아래 과정이 들어간다. 
		RoleDaoSqls.java >> RoleDao.java >> selectAllTest.java 에서 실행되는 과정이다. 

		config를 통해서 인증? 객체공장에 접근을 하며 getbean을 통하여서 데이터(디비)를 가져온다.
		그리고 roleDao를 통해서 겟터셋터 메소드를 통해서 리스트에 출력할수있는것이다. 

		가장 중요한것은  import를 잘시키는 것이다. 우리는 스프링 기반에서 동작하고 있으므로 스프링 기반의  import를 시켜야한다.


	 * update 과정 및 delete과정
		RoleDao.java에 여러 메소드를 통해서 동작이 작동하고  sqld을 바인딩 잘해줘야한다.
		나머지는 select할때와 비슷하나 바인딩 할때의 메소드와 각각의 다른 메소드들의 사용및 쓰임새를 알아야할것같다.

	JdbcTemplate을 이용하지 않고 NamedParameterJdbcTemplate를 이용하여 DAO를 작성한 이유는 무엇이라고 생각하나요?
	sql문에 다중 파라미터가 있을때 사용하기 쉽기 때문이다.