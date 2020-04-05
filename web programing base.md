##HTTP
*장점 : 불특정 다수를 대상으로 하는 서비스에는 적합합니다. 클라이언트와 서버가 계속 연결된 형태가 아니기 떄문에 클라이언트와 서버간의 최대 연결수보다 훨씬 많은 요청과 응답을 처리할 수 있습니다.
*단점 : 연결을 끊어버리기 떄문에, 클라이언트의 이전상황을 알 수 가 없습니다. 이러한 특징을 무상태(stateless)라고 말합니다. 이러한 특징 때문에 정보를 유지하기 위래서 cookie와 가ㅏㅌ은 기술이 등장하게 되었습니다.
	- URL : 인터넷 상의 자원의 위치, 특정 웹서버의 특정파일에 접근하기 위한 경로혹은 주소 
	-HTTPS는 HTTP 프로토콜에 SSL(Secure Socket Layer) 계층이 추가된 모드로 데이터 주고 받을 때 다른 이용자가 중간에 정보를 훔쳐보거나 듣거나 가로채서 정보를 알아내는 행위를 막는 데에 방지해주는 보안이 강화된 프로토콜이다.

##프론트엔드(FE)
* 사용자엑 웹을 통해 다양한 resource를 제공한다. 또한 사용자의 요청(요구사항)에 반응해서 동작한다.
	-적절한 배치 일관적인 디자인을 제공해야한다.(가독성)


##WAS(미들웨어)
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


** 상속의 개념 

- 부모를 설정해주고 자식도 똑같다고 하자

* css의 cascading
- 동일한 선언일때는 나중에 선언된것이 적용이 된다. 
- 구체적으로 표현이 된것에는 구체적으로 표현된것에 먼저된다. body > span 과  span이 존재한다면 body> span이 먼저 적용된다. 

- id값에는 더 높은 점수를 준다. class보다 
- id > class > element 순으로 우선순위가 적용된다. 같은 div태그라고 가정했을때


** css selector
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