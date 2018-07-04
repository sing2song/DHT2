'use strict';
$('#btn').click(function() {
    var temp=$('#temperature').val();
    var hum=$('#humidity').val();
    $.post('/rest/insert?temperature='+temp+'&humidity'+hum,{
        temp: temp,
        humid: hum
    },function() {
        alert("temperature: "+temp+", humiditiy: "+hum);
    });
});