'use strict';
$('#input').click(function() {
    var temperature=$('#temperature').val();
    var humidity=$('#humidity').val();
    $.get('/rest/insert',{
        temperature: temperature,
        humidity: humidity
    },function() {
        console.log("temperature: "+temperature+", humidity: "+humidity+"(log)");
    });
});
