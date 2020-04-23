var target = document.querySelector("div");

target.addEventListener("mouseover",function() {
    var preleft = parseInt(target.style.left);
    var pretop = parseInt(target.style.top);

    target.style.top = pretop + 101 + "vw";
    target.style.left = preleft + 101 + "vw";

});