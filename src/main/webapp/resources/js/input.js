'use strict';
$('#input').click(function() {
    var temperature=$('#temperature').val();
    var humidity=$('#humidity').val();
    var user_id;
    $.post('rest/get',function(result) {
        user_id=result;
    });
    $.get('/rest/insert',{
        user_id: user_id,
        temperature: temperature,
        humidity: humidity
    },function() {
        console.log("temperature: "+temperature+", humidity: "+humidity+"(log)");
    });
});
