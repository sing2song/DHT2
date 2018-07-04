'use strict';
$('#btn').click(function() {
    var id = $('#id').val();
    var password=$('#password').val();
    $.get('/rest/get?id='+id+'&password='+password, function(result) {
        var $password=result.password;
        alert("id: "+id+", password: "+$password);
    });
});