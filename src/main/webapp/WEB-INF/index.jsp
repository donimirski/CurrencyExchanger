
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Currency-Exchenger</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.min.css">
    <style>
        form{
            width: content-box;
            background-color: lightgrey;
        }
    </style>
</head>
<body>
<div class="container-fluid">

    <form>
    <div class="col-4">
        <p>Podaj kwote:</p>
        <input type="number" class="text-area" id="amountToBeExchanged">
    </div>
    <div class="col-4">
        <p>Wybierz date: </p>
        <input type="date" class="date-picker" id="data">
    </div>
</br>
    <div class="col-4">
        <p>Wybierz walute:</p>
        <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect"></label>
        <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
            <option selected>Waluty </option>
            <option value="1">EUR</option>
            <option value="2">USD</option>
            <option value="3">CHF</option>
            <option value="4">GBP</option>
        </select>
    </div>
    </br>
    <div class="col">
    <button type="button" class="btn btn-success">Oblicz</button>
    </div>
    </form>
</div>

</body>
</html>
