'use strict';
$('#input').click(function() {
    var temperature=$('#temperature').val();
    var humidity=$('#humidity').val();
    $.post('/rest/insert?temperature='+temperature+'&humidity='+humidity,{
        temperature: temperature,
        humidity: humidity
    },function() {
        console.log("temperature: "+temperature+", humidity: "+humidity+"(log)");
        alert("temperature: "+temperature+", humidity: "+humidity+"(alert)");
    });
});
