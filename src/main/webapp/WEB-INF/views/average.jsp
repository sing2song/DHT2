<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <script src="/resources/js/average.js"></script>

    <title>DHT</title>

    <!-- Bootstrap core CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">

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
                <h1>AVERAGE DATA</h1>
            </div>
        <!-- /#page-content-wrapper -->

            <div id="input_data_alert" style="display:none" class="alert alert-danger">
                <p>Error:</p>
                <span></span>
            </div>

            <div class="form-group">
                <label for="date" class="col-md-3 control-label"><strong>Date</strong></label>
                <div class="data_view" id="date" name="date"></div>
            </div>

            <div class="form-group">
                <label for="temperature" class="col-md-3 control-label"><strong>Temperature</strong></label>
                <div class="data_view" id="average_temperature" name="humidity"></div>
            </div>

            <div class="form-group">
                <label for="humidity" class="col-md-3 control-label"><strong>Humidity</strong></label>
                <div class="data_view" id="average_humiditiy" name="humidity"></div>
            </div>
        </div>
    </div>
    <!-- /#wrapper -->

    <!-- Bootstrap core JavaScript -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
    <script src="/resources/js/average.js"></script>

</body>

</html>
