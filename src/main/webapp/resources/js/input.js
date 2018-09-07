'use strict';
var user_id;
$('#input').click(function() {
    getCookie("user_id");
    var temperature=$('#temperature').val();
    var humidity=$('#humidity').val();
    $.get('/rest/insert',{
        user_id: user_id,
        temperature: temperature,
        humidity: humidity
    },function() {
        console.log("user_id:"+user_id+", temperature:"+temperature+", humidity:"+humidity+"(log)");
    });
});
var getCookie = function(name) {
    var cookie = document.cookie;
    var arr = cookie.split('=');
    for(var i=0; i<arr.length; i++) {
        user_id=arr[arr.length-1]
    }
}


