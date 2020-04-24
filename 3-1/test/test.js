function makeTemplate(data,clickedName) {
    let html = document.getElementById("tabcontent").innerHTML;
    let resultHTML = "";
    for(let i = 0; i<data.length; i++) {
        resultHTML = html.replace("{name}",data[i].name)
                         .replace("{favorites}",data[i].favorites.join(" "));
    }
}

function sendAjax(url, clickedName) {
    let oReq = new XMLHttpRequest();
    oReq.addEventListener("load",function(){
        let data = JSON.parse(oReq.responseText);
        makeTemplate(data,clickedName);
    });
    oReq.open("GET",url);
    oReq.send();
}

let tabmenu = document.querySelector(".tabmenu");
tabmenu.addEventListener("click",function(){
    sendAjax("./json.txt",evt.target.innerText);
    // console.log(evt.target); // target은 element의 관한 정보를 반환함
    // console.log(evt.target.innerText); // element의 text를 반환함
});
