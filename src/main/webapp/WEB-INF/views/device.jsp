<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>DHT</title>

    <!-- Bootstrap core CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/css/simple-sidebar.css" rel="stylesheet">
    <link href="/resources/css/average.css" rel="stylesheet">

</head>

<body>

    <div id="wrapper">

        <%@ include file="/WEB-INF/views/include/dht_sidebar.jsp" %>

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <h1>DEVICE</h1>
            </div>
        <!-- /#page-content-wrapper -->

            <div id="input_data_alert" style="display:none" class="alert alert-danger">
                <p>Error:</p>
                <span></span>
            </div>

            <div class="form-group">
                <label for="airconditional" class="col-md-3 control-label"><strong>Airconditional</strong></label>
                <%--<div class="data_view" name="airconditional">--%>
                    <%--123141241324--%>
                <%--</div>--%>
                <div class="data_view" name="airconditional">
                    <button class="device_button">ON</button>
                    <button class="device_button">OFF</button>
                </div>
            </div>

            <div class="form-group">
                <label for="heater" class="col-md-3 control-label"><strong>Heater</strong></label>
                <div class="data_view" name="heater">
                    123141241324
                </div>
            </div>

            <div class="form-group">
                <label for="humidifier" class="col-md-3 control-label"><strong>Humidifier</strong></label>
                <div class="data_view" name="humidity">
                    123141241324
                </div>
            </div>

            <div class="form-group">
                <label for="dehumidifier" class="col-md-3 control-label"><strong>Dehumidifier</strong></label>
                <div class="data_view" name="dehumidifier">
                    123141241324
                </div>
            </div>
        </div>
    </div>
    <!-- /#wrapper -->

    <!-- Bootstrap core JavaScript -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
    <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>

</body>

</html>
