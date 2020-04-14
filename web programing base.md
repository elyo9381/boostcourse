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