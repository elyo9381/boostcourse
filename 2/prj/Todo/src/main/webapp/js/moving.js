// // DOING에서 DONE으로
// var toDone = function (event, child, parent) {
//     var done = document.querySelector("#done");
//     // 버튼 없애기
//     parent.removeChild(child);
//     done.appendChild(parent);
// }
//
// // TODO에서 DOING으로
// var toDoing = function (event, child, parent) {
//     var doing = document.querySelector("#doing");
//     parent.children[3].value = "DOING";
//     doing.appendChild(parent);
// }

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


// 이동 시키기
var moving = function (event) {
    // -> 버튼 요소
    var child = event.target;
    // TODO or DOING 리스트 요소
    var parent = child.parentNode;
    // TODO or DOING 섹션 요소
    var grandParent = parent.parentNode;

    var id = parent.children[2].value;          // 리스트의 id 값
    var type = parent.children[3].value;        // 리스트의 type
    console.log(type);
    var httpRequest = new XMLHttpRequest();
    // TODO, DOING에 있는 TODO 리스트 모두 이벤트 등록
    var str = "/Todo/todoType?id=" + id + "&type=" + type;
    httpRequest.onreadystatechange = function () {
        if (httpRequest.readyState == XMLHttpRequest.DONE && httpRequest.status == 200) {
            var result = httpRequest.getResponseHeader("result");
            if (result == 'success') {
                // TODO, DOING 판별하기
                var id_value = grandParent.id;
                toAction(child, parent, id_value)
                // if (id_value === "todo") {                // 리스트가 TODO에 있는 경우
                //     toDoing(event, child, parent);
                // }
                // if (id_value === "doing") {
                //     toDone(event, child, parent);       // 리스트가 DOING에 있는 경우
                // }
            }
        }
    };
    httpRequest.open("GET", str);
    httpRequest.send();
}

// 이벤트 등록
// var todos = document.querySelectorAll(".change-type");
// for (var i = 0; i < todos.length; i++) {
//     todos[i].addEventListener("click", moving, false);
// }
var main_section = document.querySelector(".main-section");
main_section.addEventListener("click", moving, false);