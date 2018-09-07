'use strict';
var user_id;
$('#btn').click(function() {
    var id = $('#id').val();
    var password = $('#password').val();
    console.log("id: " + id + ", password: " + password);
    $.post('/signin', {
        user_id: id,
        user_password: password
    }, function (result) {
        if(result === "input") {
            getCookie("user_id");
            $.get('/rest/initial', {
                user_id:user_id
            });
            location.href = result;
        }
        else {
            alert("login failed!");
        }
    });
});
var getCookie = function(name) {
    var cookie = document.cookie;
    var arr = cookie.split('=');
    for(var i=0; i<arr.length; i++) {
        user_id=arr[arr.length-1]
    }
}
