'use strict';
var user_id;
var avgTemp;
var avgHumid;
var updateDate;
$(document).ready(function () {
    getCookie("user_id");
    console.log("average.js");
    $.post('/rest/average',{
        user_id: user_id
    }, function(result) {
        console.log(result);
        avgTemp=result.average_temperature;
        avgHumid=result.average_humidity;
        updateDate=result.update_date;
        $('#date').text(updateDate);
        $('#average_temperature').text(avgTemp);
        $('#average_humidity').text(avgHumid);
    });
});
var getCookie = function(name) {
    var cookie = document.cookie;
    var arr = cookie.split('=');
    for(var i=0; i<arr.length; i++) {
        user_id=arr[arr.length-1]
    }
}
