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

    <!-- Custom styles for this template -->
    <link href="/resources/css/simple-sidebar.css" rel="stylesheet">

</head>

<body>

    <div id="wrapper">

        <%@ include file="/WEB-INF/views/include/dht_sidebar.jsp" %>

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <h1>INPUT DATA</h1>
            </div>

            <div class="panel-body" >
                <form id="input_data_form" class="form-horizontal" role="form">

                    <div id="input_data_alert" style="display:none" class="alert alert-danger">
                        <p>Error:</p>
                        <span></span>
                    </div>

                    <div class="form-group">
                        <label for="temperature" class="col-md-3 control-label">Temperature</label>
                        <div class="col-md-9">
                            <input type="text" class="form-control" name="temperature" placeholder="Temperature">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="humidity" class="col-md-3 control-label">Humidity</label>
                        <div class="col-md-9">
                            <input type="text" class="form-control" name="humidity" placeholder="Humidity">
                        </div>
                    </div>

                    <div style="border-top: 1px solid #999; padding-top:20px"  class="form-group">

                        <div class="col-md-offset-3 col-md-9">
                            <button id="btn" type="button" class="btn btn-success">Input Data</button>
                        </div>

                    </div>
                </form>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- Bootstrap core JavaScript -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>

</body>

</html>
