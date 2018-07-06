'use strict';
$('#btn').click(function() {
    var id = $('#id').val();
    var password=$('#password').val();

    console.log("id: "+id+", password: "+password);

    $.get('/rest/get?id='+id+'&password='+password, function(result) {
        alert("password: "+result.user_password);
    });
});