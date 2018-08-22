'use strict';
$(document).ready(function () {
    var date;
    var temp;
    var humid;
    $.post('/rest/average', {
        user_id: id,
        average_temperature: temp,
        average_humidity: humid
    },function(result) {
        console.log(result);
    });
    // $.ajax({
    //     url: "average.jsp",
    //     cashe: false,
    //     success:function(data) {
    //         console.log("data:"+"\n"+data);
    //     },
    //     error: function(a,b,c) {
    //         console.log(a+", "+b+", "+c);
    //     }
    // })

    // var mysql = require('mysql');
    // var connection = mysql.createConection({
    //     host: 'root',
    //     user: 'root',
    //     password: '32152422',
    //     database: 'test'
    // });
    // connection.connect();
    //
    // var sql = 'SELECT average_temperature FROM averagedata';
    // connection.query(sql, function(err,rows,fields) {
    //     if(err) console.log(err);
    //     console.log('rows',rows);
    //     console.log('fields',fields);
    // });

});
