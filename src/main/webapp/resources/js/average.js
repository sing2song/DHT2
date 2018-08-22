'use strict';

$(document).ready(function () {
    console.log("average.js");
    $.post('/rest/average',{

    },function(result) {
        console.log(result);
    });
});