'use strict';
var user_id;
$(document).ready(function() {
    console.log(getCookie('user_id'));
    console.log(user_id);
})
$('#input').click(function() {
    var temperature=$('#temperature').val();
    var humidity=$('#humidity').val();
    console.log("user_id:"+user_id+", temperature:"+temperature+", humidity:"+humidity+"(log)");
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
    var arr = cookie.split(' ');
    for(var i=0; i<arr.length; i++) {
        user_id=arr[arr.length-1]
        console.log(user_id);
    }
}


