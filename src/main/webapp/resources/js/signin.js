'use strict';
$('#btn').click(function() {
    var id = $('#id').val();
    var password=$('#password').val();

    console.log("id: "+id+", password: "+password);

    $.post('/rest/get',{
      user_id: id,
      user_password: password
    }, function(result) {
        if (result === "success") {
            location.href = "/input";
        } else {
            alert("로그인 실패!");
        }
    });
});