'use strict';
var deleteCookie = function(name) {
    document.cookie = name;
}
$(document).ready(function() {
    deleteCookie(name);
})
$('#btn').click(function() {
    var id = $('#id').val();
    var password=$('#password').val();
    console.log("id: "+id+", password: "+password);
    $.post('/rest/get',{
      user_id: id,
      user_password: password
    }, function(result) {
        if (result === "fail") {
            alert("로그인 실패!");
        } else {
            setCookie('user_id',id,1);
            result;
            // location.href = "/input";
        }
    });
});
var setCookie = function(name,value,exp) {
    var date = new Date();
    date.setTime(date.getTime()+exp*60*60);
    document.cookie = value;
}
// var setCookie = fucntion(name, value, exp) {
//     var date = new Date();
//     date.setTime(date.getDate()+exp);
//     var cookies = name + "=" + excape(value) + ';path=/';
//     if(typeof exp != undefined) cookies += ';expires=' + date.toDateString()+';';
//     document.cookie = cookies;
// }

// function setCookie(cookieName, value, exdays) {
//     var exdate = new Date();
//     exdate.setDate(exdate.getDate()+exdays);
//     var cookieValue = escape(value) + (exdays==null)? "":"; expires="+exdate.toDateString();
//     document.cookie = cookieName + "=" + cookieValue;
// }
// function deleteCookie(cookieName) {
//     var expireDate = new Date();
//     expireDate.setDate(expireDate.getDate() - 1);
//     document.cookie = cookieName + "=" + ";expires=" + expireDate.toDateString();
// }
// function getCookie(cookieName) {
//     cookieName = cookieName +'=';
//     var cookieData = document.cookie;
//     var start = cookieData.indexOf(cookieName);
//     var cookieValue = '';
//     if(start != -1) {
//         start += cookieName.length;
//         var end = cookieData.indexOf(';',start);
//         if(end == -1) end = cookieData.length;
//         cookieValue = cookieData.substring(start,end);
//     }
//     return unescape(cookieValue);
// }