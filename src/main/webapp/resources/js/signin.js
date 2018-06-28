'use strict'
$('#btn').click(function() {
    var id=$('#id').val();
    $.get('/get?id='+id,function(result) {
        var password=result.text;
        alert("id: "+id+", password: "+password);
    });
});