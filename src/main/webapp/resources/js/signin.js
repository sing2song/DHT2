'use strict';
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
            alert("성공");

            console.log("user_id:"+result);
            location.href = "/input";
        }
    });
});