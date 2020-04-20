//child, parent, grandparent를 통하여서 이동할곳과 이동할 범위를 측정한다
//각각의 변수를 통하여서 특정 변수의 값을 구하였으면 toAction()함수를 통해서 실질적인 변화를 가져온다.
//
//toAction()은 파라미터를 통해서 조상노드가 todo이면 옆조상노드를 가르키고 
//옆 조상 노드의 자식에 toaction()의 부모 파라미터를 변수로하여 입력한다. 
//
// 실행순서 52 -> 23 -> 12 



// appendChlid함수를 통한 실질적인 함수 이동.
var toAction = function (child, parent, id_value) {
    var status = "";
    if (id_value === "todo") {
        status = document.querySelector("#doing");
    } else if (id_value === "doing") {
        status = document.querySelector("#done");
        parent.removeChild(child);   
    }
    status.appendChild(parent);
}

// moving 변수에는 함수값을 리턴받을것이다. 리턴받을 함수값은 toaction()메소드의값이다.
// event.target은 click의 값을 가져온다. 화살표모양의 input tag에 대한 값을 가져온다.
// child를 통하여서 parent의 값을 그리고 parent를 통하여서 grandparent의 값을 알수있다.
// 우리가 만든 main.jsp에서 parent 자식중에는 id/type값을 저장하였으므로 이를 통해서 값을 얻어올수있다. 
//
// httpRequest 를 통해서 ajax를 시행하려고 한다. 
// new XMLHttpRequest(); 통해서 전송할 값을 선정한다.
// httpRequest.readyState == XMLHttpRequest.DONE && httpRequest.status == 200 
// 위의조건은 응답받을수있는상태이고 또한 연결된 상태일때만 실행하게 한다. 

// 
var moving = function (event) {
    var child = event.target;   
    var parent = child.parentNode;
    var grandParent = parent.parentNode;

    var id = parent.children[2].value;         
    var type = parent.children[3].value;        
    console.log(type);
    var httpRequest = new XMLHttpRequest();

    var str = "/Todo/todoType?id=" + id + "&type=" + type;
    httpRequest.onreadystatechange = function () {
        if (httpRequest.readyState == XMLHttpRequest.DONE && httpRequest.status == 200) {
        	console.log(httpRequest.getResponseHeader("result"));
//        	System.out.print(httpRequest.getResponseHeader("result"));
            var a = httpRequest.getResponseHeader("a");
            if (a == 'success') {
           
                var id_value = grandParent.id;
                toAction(child, parent, id_value)
         
            }
        }
    };



    httpRequest.open("GET", str);
    httpRequest.send();
}

//querySelector를 통해서 content를 지목하고 이벤트 리스너를 동작시킨다.
//이벤트 리스너는 클릭이고 moving변를 사용하고 false이다.
var main_section = document.querySelector("#content"); 
main_section.addEventListener("click", moving, false);