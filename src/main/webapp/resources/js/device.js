'use strict';
var user_id;
var getCookie = function(name) {
    var cookie = document.cookie;
    var arr = cookie.split('=');
    for(var i=0; i<arr.length; i++) {
        user_id=arr[arr.length-1]
        console.log(user_id);
    }
}
$(document).ready(function() {
    getCookie('user_id');
    console.log("user_id: " + user_id);
});

var air=0;
var heat=0;
var humid=0;
var dehumid=0;

$('#air_btn_on').click(function() {
    air=1;
    $.post('/rest/device?airconditioner='+1, {
        user_id: user_id,
        airconditioner: air,
        heater: heat,
        humidifier: humid,
        dehumidifier: dehumid
    },function() {
        console.log("AIR_ON");
    });
});
$('#heat_btn_on').click(function() {
    heat=1;
    $.post('/rest/device?heater='+1, {
        user_id: user_id,
        airconditioner: air,
        heater: heat,
        humidifier: humid,
        dehumidifier: dehumid
    },function() {
        console.log("HEATER_ON");
    });
});
$('#humid_btn_on').click(function() {
    humid=1;
    $.post('/rest/device?humidifier='+1, {
        user_id: user_id,
        airconditioner: air,
        heater: heat,
        humidifier: humid,
        dehumidifier: dehumid
    },function() {
        console.log("HUMID_ON");
    });
});
$('#dehumid_btn_on').click(function() {
    dehumid=1;
    $.post('/rest/device?dehumidifier='+1, {
        user_id: user_id,
        airconditioner: air,
        heater: heat,
        humidifier: humid,
        dehumidifier: dehumid
    },function() {
        console.log("DEHUMID_ON");
    });
});
$('#air_btn_off').click(function() {
    air=0;
    $.post('/rest/device?airconditioner='+0, {
        user_id: user_id,
        airconditioner: air,
        heater: heat,
        humidifier: humid,
        dehumidifier: dehumid
    },function() {
        console.log("AIR_OFF");
    });
});
$('#heat_btn_off').click(function() {
    heat=0;
    $.post('/rest/device?heater='+0, {
        user_id: user_id,
        airconditioner: air,
        heater: heat,
        humidifier: humid,
        dehumidifier: dehumid
    },function() {
        console.log("HEAT_OFF");
    });
});
$('#humid_btn_off').click(function() {
    humid=0;
    $.post('/rest/device?humidifier='+0, {
        user_id: user_id,
        airconditioner: air,
        heater: heat,
        humidifier: humid,
        dehumidifier: dehumid
    },function() {
        console.log("HUMID_OFF");
    });
});
$('#dehumid_btn_off').click(function() {
    dehumid=0;
    $.post('/rest/device?dehumidifier='+0, {
        user_id: user_id,
        airconditioner: air,
        heater: heat,
        humidifier: humid,
        dehumidifier: dehumid
    },function() {
        console.log("DEHUMID_OFF");
    });
});