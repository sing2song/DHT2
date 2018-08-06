'use strict';
var air=0;
var heat=0;
var humid=0;
var dehumid=0;

$('#air_btn_on').click(function() {
    air=1;
    $.post('/rest/device?airconditional='+1, {
        airconditional: air,
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
        airconditional: air,
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
        airconditional: air,
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
        airconditional: air,
        heater: heat,
        humidifier: humid,
        dehumidifier: dehumid
    },function() {
        console.log("DEHUMID_ON");
    });
});
$('#air_btn_off').click(function() {
    air=0;
    $.post('/rest/device?airconditional='+0, {
        airconditional: air,
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
        airconditional: air,
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
        airconditional: air,
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
        airconditional: air,
        heater: heat,
        humidifier: humid,
        dehumidifier: dehumid
    },function() {
        console.log("DEHUMID_OFF");
    });
});