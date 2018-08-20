'use strict';
$('#btn').click(function() {
    var id = $('#id').val();
    var password = $('#password').val();
    console.log("id: " + id + ", password: " + password);
    $.post('/signin', {
        user_id: id,
        user_password: password
    }, function (result) {
        if(result === "input") {
            console.log("success");
            location.href = result;
        }
        else {
            alert("login failed!");
            console.log("fail");
        }
    });
});