'use strict';
$('#input').click(function() {
    var temp=$('#temperature').val();
    var hum=$('#humidity').val();
    $.post('/rest/insert?temperature='+temp+'&humidity='+hum,{
        temp: temp,
        hum: hum
    },function() {
        console.log("temperature: "+temp+", humidity: "+hum+"(log)");
        alert("temperature: "+temp+", humiditiy: "+hum+"(alert)");
    });
});
