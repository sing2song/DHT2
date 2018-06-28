'use strict'
$('#btn').click(function() {
    var id=$('#id').val();
    $.post('/?id='+id,function(result) {
        var password=result.text;
        alert("id: "+id+", password: "+password);
    })
});